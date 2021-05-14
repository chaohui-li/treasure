package xc;

import java.util.Scanner;

public class demo11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {//每个人
            System.out.println("请输入第"+(i+1)+"个人购买商品的价格：");
            int count = 0;
            for (int j = 0; j < 3; j++) {//每个人买的商品

                int price = scanner.nextInt();
                if (price>=300){
                    count++;
                }

            }
            System.out.println("第"+(i+1)+"个人有"+ count +"件商品享受8折优惠");
        }
    }
}
