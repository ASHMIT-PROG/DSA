package QUESTIONS;

import java.util.Scanner;

public class return_index_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int [] arr = {4,7,2,9,1};
        System.out.println(find(arr , target));
    }
    static int find(int [] num , int target){
        if (num.length==0){
            return -1;
        }
        for (int i = 0 ; i<=num.length-1; i++){
            if (num[i]==target){
                return i;
            }
        }
        return -1;
    }
}
