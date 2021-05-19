package xc.dq;

import java.util.Locale;
import java.util.Scanner;
//equals()用于判断字符串的值是否相等
public class demo15 {
    public  static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name=scanner.next();
        System.out.println("请输入密码：");
        String password=scanner.next();
        //equalsIgnoreCase 忽略大小写判断是否相等
        if (name.equals("tom")&&password.equals("1234567")){
            System.out.println("登陆成功");
        }else{
            System.out.println("登录失败");
        }
        //toUpperCase 转为小写
        //toLowerCase 转为大写
        System.out.println("TOM".toLowerCase());
        System.out.println("tom".toUpperCase());

         /*
        equals()实现的思路
        1 先判断是否是同一个对象，如果是，则相等
        2 判断传入的对象是否是字符串类型，如果是，进入下一步判断
        2.1 判断长度是否相等，如果不等，直接返回不相等
        2.1 如果长度相等，循环判断每一位是否相等，有一位不等，则直接返回不相等
        每一位都相等，则返回true
        3.如果不是，直接返回不相等
         */
    }
}



