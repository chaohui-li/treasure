package xc;

import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
       int y = 2012;
       int s= 250000;
       while (s<1000000){
           s=(int)(s*(1+0.25));
           y ++;
       }
        System.out.println("年份" + y + "学生"+s);
       System.out.println(y+"超过一百万");
       }
       }
