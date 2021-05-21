package 泛型;

import java.util.ArrayList;

public class FxDemo01 {
    public static void main(String[]args){
        ArrayList list=new ArrayList();
        list.add(11);
        list.add("1234");
        list.add(true);
        list.add(1221,123);
        System.out.println(list);

        ArrayList<String>list1=new ArrayList<>();
        list1.add("fdcdf");
        // list.add(121);泛型做类型的约束，使集合中存放相同的数据类型
    }
}
