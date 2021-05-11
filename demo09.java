package xc;

import java.util.Arrays;
import java.util.Scanner;

public class demo09 {
    public static void main(String[] args){
        int scores[]=new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+(i+1)+"个元素：");
            scores[i]= scanner.nextInt();
        }
        System.out.println("排序前");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]+"\t");
        }
        Arrays.sort(scores);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("排序号");
            System.out.println(scores[i]+"\t");

        }
    }
}
