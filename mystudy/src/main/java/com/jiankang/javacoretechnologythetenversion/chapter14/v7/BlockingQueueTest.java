package com.jiankang.javacoretechnologythetenversion.chapter14.v7;

/*
 *@create by jiankang
 *@date 2020/7/1 time 10:27
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
    private static final int FILE_QUEUE_SIZE = 10;
    private static final int SEARCH_THREADS = 100;
    private static final File DUMMY = new File("");
    private static BlockingQueue<File> queue = new ArrayBlockingQueue<>(FILE_QUEUE_SIZE);

    public static void main(String[] args) {
        Runnable enumerator = () -> {
            try {
                enumerate(new File("D:\\mystudy20190927\\mystudy\\src\\main\\java\\com\\jiankang\\javacoretechnologythetenversion"));
                queue.put(DUMMY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(enumerator).start();
        for (int i = 0; i < SEARCH_THREADS; i++) {
            Runnable searcher = () -> {
                try {
                    boolean done = false;
                    while (!done) {
                        File file = queue.take();
                        if (file == DUMMY) {
                            queue.put(file);
                            done = true;
                        }else {
                            search(file,"public class");
                        }
                    }
                } catch (InterruptedException | FileNotFoundException e) {
                    e.printStackTrace();
                }
            };
            new Thread(searcher).start();
        }

    }


    /**
     * 将目录里面所有文件放入队列
     *
     * @param directory
     * @throws InterruptedException
     */
    public static void enumerate(File directory) throws InterruptedException {
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                enumerate(file);
            } else {
                queue.put(file);
            }
        }
    }


    /**
     * 搜索符合条件的行并打印
     *
     * @param file
     * @param keyword
     * @throws FileNotFoundException
     */
    public static void search(File file, String keyword) throws FileNotFoundException {
        try (Scanner in = new Scanner(file, "UTF-8")) {
            int lineNumber = 0;
            while (in.hasNextLine()) {
                lineNumber++;
                String line = in.nextLine();
                if (line.contains(keyword)) {
                    System.out.printf("%s:%d:%s%n", file.getPath(), lineNumber, line);
                }
            }
        }
    }


}
