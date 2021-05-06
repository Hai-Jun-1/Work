package com.jdacall.work;

import java.util.Scanner;

/*
请编写程序，输入一个字符串，统计其中有多少个字符，并在一行内打印输出用空格分开的各个字符。
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串");
        String s = sc.next();
        System.out.println(s.length());
        if (!s.isEmpty()) {
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.substring(i, i + 1) + "\t");
            }
        }
    }
}
