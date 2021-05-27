package 泛型02;

public class Tools {
//    public static String getMiddle(String[]a){
//        return a[a.length/2];
//    }
    public static <T> T getMiddle(T [] a) {
       return a[a.length/2];
    }
}
