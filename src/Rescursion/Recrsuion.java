package Rescursion;

public class Recrsuion {


    public static void main(String[] args) {
        int n =12;
        System.out.println(fact(n));

    }

    public static int fact(int n) {

        if (n==0){
            return 1;

        }
        int fn =fact(n-1);
        return n * fn;

    }
}
