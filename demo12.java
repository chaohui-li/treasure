package xc.dq;

import java.util.Scanner;

public class demo12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入等腰三角形的行数：");
        int hangShu = scanner.nextInt();
        for (int i = 1; i < hangShu; i++) {
            for (int j = 0 ; j < hangShu-i; j ++){
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i-1; k++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
