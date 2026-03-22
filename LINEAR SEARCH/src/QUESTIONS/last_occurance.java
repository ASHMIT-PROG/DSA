package QUESTIONS;

import java.util.Scanner;

public class last_occurance {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int target = input.nextInt();

        int[] arr = {1, 2, 3, 4, 2};

        int last_index_occurance = -1; // agar mann lo index value 6 ho gayi aur arr me 6 indexes hai hii nahi toh agar mai iska value 0 likh du toh galat ho jayega

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                last_index_occurance = i;
            }

        }

        System.out.println("Last Occurrence Index: " + last_index_occurance);
    }
}
