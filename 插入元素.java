package xc.dq;

import java.util.Arrays;
import java.util.Scanner;

public class 插入元素 {
    public static void main(String[] args){
       /*
       插入新元素，依旧保持原数组有序
        */
        int[] scores = new int[7] ;
        scores[0]=99;
        scores[1]=88;
        scores[2]=77;
        scores[3]=66;
        scores[4]=55;
        scores[5]=44;
        //1.获取要插入的值
        System.out.println("请输入你要插入的值");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        //2.找到要插入新值得位置
        int index=0;
        for (int i = 0; i < scores.length; i++) {
            if(num>scores[i]){ //99 88 77 66 55 44 (80) 找到数组中一个比num小的值，该位置就是num要插入的位置
                index=i;//把位置记录在index中
                break;
            }
        }
        //3 把元素向后移 index<->length-1 之间的全部数据向后移动移位
        for (int i = scores.length-1; i >index ; i--) {
            System.out.println("把"+(i-1)+"位置元素"+scores[i-1]+"移动到"+i+"位置"+scores[i]);
            scores[i]=scores[i-1];
            System.out.println(Arrays.toString(scores));
        }
        //4 插入新值
        System.out.println("在"+index +"位置"+scores[index]+"插入新值："+num);
        scores[index]=num;
        //5 打印插入后的结果
        //降序
        System.out.println("插入之后的结果为；降序;");
        System.out.println("降序");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]+"\t");
        }
        //升序
        System.out.println();
        System.out.println("升序");
        for (int i = scores.length-1; i >=0; i--) {
            System.out.println(scores[i]+"\t");
        }
    }

}
