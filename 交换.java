package xc;

import java.util.Arrays;

public class 交换 {
    public static void main(String[] args) {
        int[] a = {1, 45, 23, 69, 5, 3};
        int count = 0;
        int jiaohuan = 0;
        System.out.println("原始数组为：" + Arrays.toString(a));
        for (int i = 0; i < a.length - 1 - i; i++) {
            for (int j = 0; j < a.length - 1 - j; j++) {
                if (a[j] > a[j + 1]) {
                    System.out.println(a[j] + "和" + a[j + 1] + "交换位置");

                    a[j] = a[j] ^ a[j + 1];
                    a[j + 1] = a[j] ^ a[j + 1];
                    a[j] = a[j] ^ a[j + 1];

                    System.out.println("交换完之后为：" + Arrays.toString(a));
                    jiaohuan++;

                }
                count++;
            }
        }
        System.out.println("共进行了：" + count + "论排序" + jiaohuan + "轮交换");
    }
}
