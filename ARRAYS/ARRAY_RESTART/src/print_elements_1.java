/*## L1-Q1: Print All Elements

**Problem:** Given an array, print all elements.

**Input:**

`[1,2,3,4]`

**Output:**

`1 2 3 4`

**Edge Case:** Empty array → print nothing*/

import java.util.Scanner;

public class print_elements_1 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int [n];
        for (int i = 0 ; i<n ; i++){
            arr[i] = input.nextInt(); // input
            System.out.println(arr[i]);
        }


    }
}
