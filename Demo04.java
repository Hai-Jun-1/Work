package com.jdacall.work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Demo04 {
    String book;
    String autor;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Demo04> list = new ArrayList<>();
        Demo04 d1=new Demo04();
        Demo04 d2=new Demo04();
        Demo04 d3=new Demo04();
        Demo04 d4=new Demo04();

        d1.book="名著名称";
        d1.autor="人物名字";
        d2.book="三国演义";
        d2.autor="刘备，曹操";
        d3.book="射雕英雄";
        d3.autor="郭靖，黄蓉";
        d4.book="倚天屠龙";
        d4.autor="张无忌，赵敏";
        list.add(d1);
        list.add(d2);
        list.add(d3);
        list.add(d4);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i).book+"\t\t"+list.get(i).autor);
        }
        boolean flag=false;
        System.out.println("输入名著的名称");
        String s=sc.next();
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).book.equals(s)){
                System.out.println("名著存在序号为："+i);
                System.out.println(list.get(i).book+"\t\t"+list.get(i).autor);
                flag=true;
            }
        }
        if (!flag){
            System.out.println("名著不存在");
        }
    }
}
