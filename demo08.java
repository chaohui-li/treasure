package xc;

import java.util.Scanner;

public class demo08 {
    public static void main(String[] args){
        int[] scores = new int[5];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i< scores.length; i++){
            System.out.println("请输入第"+(i+i) + "个学生的成绩；");
            scores[i] = scanner.nextInt();//把接受到的成绩存储到数组中对应的位置
            sum +=scores[i];//累加求和
        }
        System.out.println("平均分："+sum /scores.length);

    }
}
