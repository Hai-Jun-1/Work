package com.jdacall.work;

import java.util.Scanner;

public class Demo05 {
    public static void main(int[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("学生A的三门成绩是：");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        double average1=(s1+s2+s3)/3;
        System.out.println("学生A的平均分是"+average1);
        System.out.println("学生B的三门成绩是：");
        int s4=sc.nextInt();
        int s5=sc.nextInt();
        int s6=sc.nextInt();
        double average2=(s4+s5+s6)/3;
        System.out.println("学生B的平均分是"+average2);
        System.out.println("学生C的三门成绩是：");
        int s7=sc.nextInt();
        int s8=sc.nextInt();
        int s9=sc.nextInt();
        double average3=(s7+s8+s8)/3;
        System.out.println("学生C的平均分是"+average3);
    }
}
