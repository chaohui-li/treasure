package xc.dq;

import java.util.Scanner;

public class demo03 {
    public static void main(String[] args){
     //回文数   ：指正读反都相同的句子
        int val = 123456 ;
        int zuiho = 0 ;
        while (val !=0){
            zuiho = val %10;//取出最后一位
            System.out.println(zuiho);
            val = val/10;//去除最后一位
        }
    }
}
