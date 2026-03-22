package QUESTIONS;

import java.util.Scanner;

public class check_last_occurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int[] arr = {1, 2, 2, 2, 3};
        System.out.println(last_occurance(arr,target));
    }

    static int last_occurance(int[] num, int target) {
        int start_index = 0;
        int end_index = num.length - 1;
        int ans_index = -1;
        while (start_index <= end_index)
        {
            int middle_index = start_index + (end_index - start_index) / 2;

            if (num[middle_index] == target) {
                ans_index = middle_index;
                start_index = middle_index + 1;
            }
            else if (num[middle_index]>target)
            {
                start_index=middle_index+1;
            }
            else
            {
                end_index=middle_index-1;
            }
        }
        return ans_index;
    }
}
