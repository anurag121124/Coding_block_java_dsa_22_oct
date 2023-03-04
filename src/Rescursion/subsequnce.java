package Rescursion;

public class subsequnce {
    public static void main(String[] args) {

        String ques ="abc";

        subsequnce(ques, "");
    }

    public static void subsequnce(String ques, String ans){
        if (ques.length() ==0){
          System.out.println(ans+" ");
          return;

        }
        char ch = ques.charAt(0);
        subsequnce(ques.substring(1),ans);


        subsequnce(ques.substring(1), ans+ch);



    }
}
