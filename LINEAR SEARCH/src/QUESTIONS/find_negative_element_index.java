package QUESTIONS;

import java.util.Scanner;

public class find_negative_element_index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {4,-3,7,-1,-8,5};

        int count = 0;
        for (int i= 0;i<=arr.length-1;i++){
            if (arr[i]<0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
