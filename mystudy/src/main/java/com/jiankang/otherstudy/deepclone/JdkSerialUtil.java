package com.jiankang.otherstudy.deepclone;

import java.io.*;

public class JdkSerialUtil {
    public static <T> T deepClone(T origin) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(origin);
            objectOutputStream.flush();
        }
        byte[] bytes = outputStream.toByteArray();
        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes)) {
            return JdkSerialUtil.readObject(inputStream);
        }
    }

    private static <T> T readObject(ByteArrayInputStream inputStream) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Object object = objectInputStream.readObject();
        return (T) object;

    }
}
