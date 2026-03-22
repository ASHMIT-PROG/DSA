package QUESTIONS;

import java.util.Scanner;

public class ceiling_of_a_number {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int target = input.nextInt();

        int[] arr = {2,3,4,5,6,7};

        int result = find(arr, target);

        if(result != -1)
            System.out.println(arr[result]);
        else
            System.out.println("No ceiling found");
    }

    static int find(int[] num , int target){

        int ans = -1;
        int start = 0;
        int end = num.length - 1;

        while (start <= end){

            int middle_index = start + (end - start)/2;

            if(num[middle_index] == target){
                return middle_index;
            }

            else if(num[middle_index] > target){
                ans = middle_index;          // store answer
                end = middle_index - 1;      // LEFT
            }

            else{
                start = middle_index + 1;    // RIGHT
            }
        }

        return ans;
    }
}