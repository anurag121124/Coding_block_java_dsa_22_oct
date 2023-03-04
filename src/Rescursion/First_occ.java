package Rescursion;

public class First_occ {

    public static void main(String[] args) {
        int[] arr = {2,3,5,7,2,3,1,6,5,9};
        int item =5;
        System.out.println(Index(arr,item,0));

    }
    public static int Index(int[] arr, int item , int idx){

        if (idx ==arr.length){
            return -1;
        }


        if (item ==arr[idx]){


            return idx;

        }

        return Index(arr,item , idx +1);


    }
}
