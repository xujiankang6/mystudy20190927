package com.jiankang.javaprogramminglogic.chapter13.v3;

/*
 *@create by jiankang
 *@date 2020/3/29 time 15:03
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * 一些实用的file方法
 */
public class FileUtils {


    //复制Reader到Writer
    public static void copy(final Reader input, final Writer output) throws IOException {
        char[] buf = new char[4096];
        int charsRead = 0;
        while ((charsRead = input.read(buf)) != -1) {
            output.write(buf, 0, charsRead);
        }
    }

    //将文件全部读入到一个字符串，参数为文件名和编码类型
    public static String readFileToString(final String fileName, final String encoding) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), encoding));
            StringWriter writer = new StringWriter();
            copy(reader, writer);
            return writer.toString();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }

    //将字符串写到文件，参数为文件名，字符串内容和编码类型
    public static void writeStringToFile(final String fileName, final String data, final String encoding) throws IOException {
        Writer writer = null;
        try {
            writer = new OutputStreamWriter(new FileOutputStream(fileName), encoding);
            writer.write(data);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    //将多行数据写到文件
    public static void writeLines(final String fileName, final String encoding, final Collection<?> lines) throws Exception {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(fileName, encoding);
            for (Object line : lines) {
                writer.println(line);
            }
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    //将按行将文件内容读到一个集合中
    public static List<String> readLines(final String fileName, final String encoding) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), encoding));
            String line = reader.readLine();
            List<String> list = new ArrayList<>();
            while (line != null) {
                list.add(line);
                line = reader.readLine();
            }
            return list;
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }


    //计算一个目录下所有文件大小
    public static long sizeOfDirecory(final File directory) {
        long size = 0;
        if (directory.isFile()) {
            return directory.length();
        } else {
            for (File file : Objects.requireNonNull(directory.listFiles())) {
                if (file.isFile()) {
                    size += file.length();
                } else {
                    size += sizeOfDirecory(file);
                }
            }
        }
        return size;
    }

    //在一个目录下，查找所有给定文件名的文件
    public static Collection<File> findFile(final File directory, final String fileName) {
        List<File> files = new ArrayList<>();
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (file.isFile() && file.getName().equals(fileName)) {
                files.add(file);
            } else if (file.isDirectory()) {
                files.addAll(findFile(file, fileName));
            }
        }
        return files;
    }

    //删除非空目录的方法
    public static void deleteRecursively(final File file) throws IOException {
        if (file.isFile()) {
            //删除文件
            if (!file.delete()) {
                throw new IOException("Failed to delete " + file.getCanonicalPath());
            }
        } else if (file.isDirectory()) {
            for (File child : Objects.requireNonNull(file.listFiles())) {
                deleteRecursively(child);
            }
            //删除目录
            if (!file.delete()) {
                throw new IOException("Failed to delete " + file.getCanonicalPath());
            }
        }
    }


}
