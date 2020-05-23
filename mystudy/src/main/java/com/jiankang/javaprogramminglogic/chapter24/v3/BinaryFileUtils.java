package com.jiankang.javaprogramminglogic.chapter24.v3;

/*
 *@create by jiankang
 *@date 2020/5/23 time 15:09
 */

import java.io.*;

public class BinaryFileUtils {

    public static void copy(InputStream input, OutputStream output)
            throws IOException {
        byte[] buf = new byte[4096];
        int bytesRead = 0;
        while ((bytesRead = input.read(buf)) != -1) {
            output.write(buf, 0, bytesRead);
        }
    }

    public static byte[] readFileToByteArray(String fileName)
            throws IOException {
        InputStream input = new FileInputStream(fileName);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try {
            copy(input, output);
            return output.toByteArray();
        } finally {
            input.close();
        }
    }

    public static void writeByteArrayToFile(String fileName, byte[] data)
            throws IOException {
        OutputStream output = new FileOutputStream(fileName);
        try {
            output.write(data);
        } finally {
            output.close();
        }
    }

}
