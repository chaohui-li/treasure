package 泛型02;

public class FxDemo01 {
    public static void main(String[]args){
        Integer[]a={12,23,234,45,42};
        System.out.println(Tools.getMiddle(a));

        String[] str ={"add","sdafq","awdqw"};
        System.out.println(Tools.getMiddle(str));

        Boolean[]b={true,false,true,false};
        System.out.println(Tools.getMiddle(b));
    }
}
