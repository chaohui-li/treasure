package xc;

public class demo01 {

    public static void main(String[] args) {
        // write your code here
        int i = 1; //循环次数
        while (i<=100 ) {
            System.out.println("这是我第" + i + "次鼓励：好好学习");
            i++; // 循环次数+1，维持i的意义（循环次数）正确，循环不变量，不变的是意义，数值发生变化为了使意义正确
        }
    }
}
