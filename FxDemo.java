package 泛型01;

public class FxDemo {
    public static void main(String[]args){
        Pair<Integer>pair1=new Pair<>(1,5);
        Pair<Double>pair2=new Pair<>(1.5,5.9);
        Pair<String>pair3=new Pair<>("dada","fewfgfg");

        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);




    }
}
