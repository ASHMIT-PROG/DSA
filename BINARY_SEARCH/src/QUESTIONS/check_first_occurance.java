package QUESTIONS;

import java.util.Scanner;

public class check_first_occurance {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int [] arr = {1,2,2,2,3};
        int target = input.nextInt();
        System.out.println(first_occurance(arr,target));
    }
    static int first_occurance(int[]num , int target)
    {
        int start =0;
        int end = num.length-1;
        int ans = -1; // jab bhi hume array ka index ya koi index pe based question ayega toh -1;
        while (start<=end)
        {
            int middle_index = start+(end-start)/2;
            if(num[middle_index]==target)
            {
                ans = middle_index;
                end = middle_index-1;
            }
            else if (num[middle_index]<target)
            {
                start=middle_index+1;
            }
            else
            {
                end=middle_index-1;
            }
        }
        return ans;
    }
}
