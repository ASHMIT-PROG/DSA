package QUESTIONS;

import java.util.Scanner;

public class check_number_exist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target_value = input.nextInt();
        int [] arr = {2,4,6,8};

        System.out.println(check_number(arr , target_value));

    }
    static boolean check_number(int[]num , int target){
        int start_index = 0;
        int end_index = num.length-1;
        while (start_index<=end_index){
            int middle_index = start_index+(end_index-start_index)/2;
            if (num[middle_index]==target){
                System.out.println(middle_index);// it will give at which index the value is
                return true;
            }
            else if (num[middle_index]<target) {
                start_index = middle_index+1;
            }
            else {
                end_index=middle_index-1;
            }
        }


        return false;
    }
}
