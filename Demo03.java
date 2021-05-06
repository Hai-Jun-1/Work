package com.jdacall.work;

/*
请使用线程创建的2种方式，实现2个线程一起同步打印输出26个字母A-Z，请确保输出字符不重复；
 */
public class Demo03 {
    String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int count = 0;

    public static void main(String[] args) {
        Demo03 d = new Demo03();

        Thread t1 = new Thread(new person(d));
        Thread t2 = new Thread(new home(d));
        t1.setName("线程我");
        t2.setName("线程他");
        t1.start();
        t2.start();
    }

}

class person implements Runnable {
    Demo03 d;


    public person(Demo03 d) {
        this.d = d;

    }

    @Override
    public void run() {
        while (true) {
            synchronized (d) {
                if (d.count>(d.s.length()-1)){
                    break;
                }
                System.out.print(Thread.currentThread().getName() + ":" + d.s.substring(d.count, d.count + 1) + "\t");
                d.count++;

            }
        }
    }
}

class home extends Thread {
    Demo03 d;


    public home(Demo03 d) {
        this.d = d;

    }

    @Override
    public void run() {

        while (true) {
            synchronized (d) {
                if (d.count>(d.s.length()-1)){
                    break;
                }
                System.out.print(Thread.currentThread().getName() + ":" + d.s.substring(d.count, d.count + 1) + "\t");
                d.count++;
            }
        }
    }
}

