package xc.dq;

import java.util.Scanner;

public class demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score=0;
        int sum = 0;
      for(int i=0 ; i<=5 ; i++){
          System.out.println("请输入第" + i +"门课的成绩");
          score = scanner.nextInt();
          sum += score;
      }
      System.out.println("平均成绩：" + sum / 5);
    }
}