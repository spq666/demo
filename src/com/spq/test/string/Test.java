package com.spq.test.string;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {

    static {
        System.out.println("这是Test静态代码块");
    }

    {
        System.out.println("这是Test代码块");
    }

    public Test(){
        System.out.println("这是Test构造方法");
    }

    public static void main(String[] args) {
//        String a = "abc";
//        String b = "abc";
//        String c = new String("abc");
//        System.out.println(a==b);
//        System.out.println(a==c);

//        int k = 0;
//        System.out.println(++k);
//        System.out.println(k++);
//        System.out.println(++k);
//        System.out.println(k++);
        //System.out.println(++k + k++ + ++k + k++);


//        int i = getValue();
//        System.out.println(i);
//
//        new TestA();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 60l, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10), new CustomThreadFactory());
        for (int i = 0;i<20;i++) {
            executor.execute(new TestThread());
        }
        executor.shutdown();

    }

    private static int getValue(){

        String[] arr = new String[0];
        int i = 0;
        try {
            arr[1] = "a";
            System.out.println("1");
            return i++;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("2=========="+i);
            return i++;
        }catch (Exception e){
            System.out.println("3=========="+i);
            return i++;
        }finally {
            System.out.println("4=========="+i);
            return i++;
        }
    }
}
