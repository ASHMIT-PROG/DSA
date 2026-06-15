import java.util.Scanner;

public class min_element_i_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = input.nextInt();
        int [] arr = new int[n];
        int min = Integer.MAX_VALUE;
        // Getting the input of integers
        System.out.println("enter the numbers of the array");
        for (int i = 0 ; i<n;i++){
            arr[i] = input.nextInt();
            min = Math.min(min,arr[i]);
        }
        System.out.println(min);





     }
}
