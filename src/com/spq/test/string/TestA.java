package com.spq.test.string;

public class TestA extends Test {

    static {
        System.out.println("这是TestA静态代码块");
    }

    {
        System.out.println("这是TestA代码块");
    }

    public TestA(){
        System.out.println("这是TestA构造方法");
    }
}
