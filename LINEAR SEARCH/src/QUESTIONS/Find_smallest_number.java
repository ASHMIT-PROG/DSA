package QUESTIONS;


public class Find_smallest_number {
    public static void main(String[] args) {
        int [] arr = {8,3,5,2,7};
        int small  = arr[0];
        if (arr.length==0){
            System.out.println("array is empty");
            return;
        }
        for (int i = 0; i<=arr.length-1;i++){
            if (arr[i]<small){
               small = arr[i];
            }
        }
        System.out.println(small);
    }
}
