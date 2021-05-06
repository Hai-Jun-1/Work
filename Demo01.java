package com.jdacall.work;

/*
有人走台阶若每步走 2 级，则最后剩 1 级。
若每步走 3 级则最后剩 2 级。
若每步走 4级，则最后剩 3 级。
若每步走 5 级，则最后剩 4 级。
若每步走 6 级，则最后剩 5 级。
若每步走 7 级，则刚好不剩。试编制程序求此台阶数。（计算在 1000 个台阶包含 1000 个台阶）
 */
public class Demo01 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if ((i%2==1)&&(i%3==2)&&(i%4==3)&&(i%5==4)&&(i%6==5)&&(i%7==0)){
                System.out.println(i);
            }
        }
    }
}
