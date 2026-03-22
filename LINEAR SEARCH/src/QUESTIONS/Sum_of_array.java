package QUESTIONS;

import java.util.Scanner;

public class Sum_of_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {3,5,-2,7};
        int sum = 0;
        for (int i = 0 ; i<=arr.length-1;i++){

            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
