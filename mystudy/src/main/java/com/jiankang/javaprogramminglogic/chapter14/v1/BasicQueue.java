package com.jiankang.javaprogramminglogic.chapter14.v1;

/*
 *@create by jiankang
 *@date 2020/3/30 time 14:22
 * 实现简单的消息队列
 */

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class BasicQueue {

    //队列最多消息个数
    private static final int MAX_MSG_NUM = 1020 * 1024;
    //消息体最大长度
    private static final int MAX_MSG_BODY_SIZE = 1020;
    //每天消息占用的空间
    private static final int MSG_SIZE = MAX_MSG_BODY_SIZE + 4;
    //队列消息5体数据文件大小
    private static final int DATA_FILE_SIZE = MAX_MSG_BODY_SIZE * MAX_MSG_NUM;
    //队列元数据文件大小（head+tail）
    private static final int META_SIZE = 8;
    //数据
    private MappedByteBuffer dataBuf;
    //元数据
    private MappedByteBuffer metaBuf;


    public BasicQueue(String path, String queueName) throws IOException {
        if (!path.endsWith(File.separator)) {
            path += File.separator;
        }
        RandomAccessFile dataFile = null;
        RandomAccessFile metaFile = null;
        try {
            dataFile = new RandomAccessFile(path + queueName + ".data", "rw");
            metaFile = new RandomAccessFile(path + queueName + ".meta", "rw");
            dataBuf = dataFile.getChannel().map(FileChannel.MapMode.READ_WRITE, 0, DATA_FILE_SIZE);
            metaBuf = metaFile.getChannel().map(FileChannel.MapMode.READ_WRITE, 0, META_SIZE);
        } finally {
            if (dataFile != null) {
                dataFile.close();
            }
            if (metaFile != null) {
                metaFile.close();
            }
        }
    }

    private int head() {
        return metaBuf.getInt(0);
    }

    private void head(int newHead) {
        metaBuf.putInt(0, newHead);
    }

    private int tail() {
        return metaBuf.getInt(4);
    }

    private void tail(int newTail) {
        metaBuf.putInt(4, newTail);
    }

    //判断队列是空是满
    private boolean isEmpty() {
        return head() == tail();
    }

    private boolean isFull() {
        return ((tail() + MSG_SIZE) % DATA_FILE_SIZE) == head();
    }


    //入队
    public void enqueue(byte[] data) throws IOException {
        if (data.length > MAX_MSG_BODY_SIZE) {
            throw new IllegalArgumentException("msg size is" + data.length + ", while maximum allowed length is " + MAX_MSG_BODY_SIZE);
        }
        if (isFull()) {
            throw new IllegalStateException("queue is full");
        }
        int tail = tail();
        dataBuf.position(tail);
        dataBuf.putInt(data.length);
        dataBuf.put(data);
        if (tail + MSG_SIZE >= DATA_FILE_SIZE) {
            tail(0);
        } else {
            tail(tail + MSG_SIZE);
        }
    }

    public byte[] dequeue() throws IOException {
        if (isEmpty()) {
            return null;
        }
        int head = head();
        dataBuf.position(head);
        int length = dataBuf.getInt();
        byte[] data = new byte[length];
        dataBuf.get(data);
        if (head + MSG_SIZE >= DATA_FILE_SIZE) {
            head(0);
        } else {
            head(head + MSG_SIZE);
        }
        return data;
    }


}
