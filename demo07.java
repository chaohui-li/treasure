package xc;

public class demo07 {
    public static void main(String[] args){
        int i=1;
        int sum=0;
        for (i=1;i<=10;i++){
            sum+=i;
            if (sum > 20) {
                break;
            }

        }
        System.out.println(i);
    }
}
