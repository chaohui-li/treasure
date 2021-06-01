package demo;

@FunctionalInterface//表明函数式编程

interface IMymessage3{
    void print();
}

public class demo01 {
    public static void main(String[] args) {
        IMymessage3 mymessage3 = () -> System.out.println("MyMessage");
        mymessage3.print();
    }
}