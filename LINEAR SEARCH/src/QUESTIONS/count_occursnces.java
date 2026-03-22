package QUESTIONS;

import java.util.Scanner;

public class count_occursnces {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = {2,3,2,5,2};

        int target = input.nextInt();

        System.out.println(find(arr, target));
    }

    static int find(int[] nums, int target){

        int count = 0;

        for (int i = 0; i < nums.length; i++){

            if (nums[i] == target){
                count++;
            }
        }

        return count;
    }
}
