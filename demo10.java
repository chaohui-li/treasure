package xc;

import java.util.Scanner;

public class demo10 {
    public static void main(String[] args){
            int a=0;
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <= i; j++) {
                a=i*j;
                System.out.print(i+"*"+j+"="+a+"\t");
            }
            System.out.println();
        }
    }
}
