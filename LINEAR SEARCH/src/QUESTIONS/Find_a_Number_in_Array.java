package QUESTIONS;

import java.util.Scanner;

public class Find_a_Number_in_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int [] arr = {4,7,2,9,1};
        System.out.println(find(arr , target));
    }
    static  boolean find (int [] num , int target){
        if(num.length == 0 ){
            return false;
        }
        for (int i = 0 ; i<num.length;i++){
            if (num[i]==target){
                return true;
            }
        }
        return false;
    }
}
