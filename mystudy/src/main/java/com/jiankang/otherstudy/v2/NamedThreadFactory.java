package com.jiankang.otherstudy.v2;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * NamedThreadFactory
 *
 * @author jiankang.xu
 * @date 2020/3/13
 */
public class NamedThreadFactory implements ThreadFactory {
    private static AtomicInteger threadNumber = new AtomicInteger();
    private final String namePrefix;
    private final boolean daemon;

    public NamedThreadFactory(String namePrefix, boolean daemon) {
        this.namePrefix = namePrefix;
        this.daemon = daemon;
    }

    public NamedThreadFactory(String namePrefix) {
        this(namePrefix, false);
    }

    @Override
    public Thread newThread(Runnable r) {
        final Thread thread = new Thread(r, namePrefix + "thread-" + threadNumber.getAndIncrement());
        thread.setDaemon(daemon);
        return thread;
    }
}
