package QUESTIONS;

import java.util.Scanner;

public class BASIC_BINARY_SEARCH_CODE {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the target value");

        int target = input.nextInt();

        int[] arr = {2,3,4,5,6,7,8,9,10};

        System.out.println(findbinary(arr, target));
    }

    static int findbinary(int[] nums, int target){

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                return mid;
            }

            else if(nums[mid] > target){
                end = mid - 1;
            }

            else{
                start = mid + 1;
            }
        }

        return -1;
    }
}