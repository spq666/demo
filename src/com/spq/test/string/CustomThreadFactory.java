package com.spq.test.string;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("spq线程");
        return thread;
    }
}
