package com.tong.school_chat.Controller;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/11/12 9:30
 */
public class ThreadTest extends Thread{
    
    public static void main(String[] args) {
        System.out.println();
    }
    
    @Override
    public void run() {
        System.out.println("running ...");
    }
    
    public ThreadTest(String name) {
        super(name);
    };
}
