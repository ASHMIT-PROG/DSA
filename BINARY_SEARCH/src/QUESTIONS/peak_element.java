package QUESTIONS;

import java.util.Scanner;

public class peak_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {1,3,5,4,2};
        int target = input.nextInt();
    }
    static int find_peak(int [] num , int target){
        int start =0;
        int end = num.length-1;
        while (start<end){
            int middle_index = start+(end-start)/2;
            if (num[middle_index]>num[middle_index+1]){
                end = middle_index;
            }
            else {
                start=middle_index+1;
            }
        }
        return start;
    }
}
