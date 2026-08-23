import java.util.Scanner;

public class Basic_1_i_array {
    static int [] hash  = new int [10_000_000];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        // enter the size of the array
        int n  = input.nextInt();
        int arr[] = new int[n];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
        for (int i = 0;i<n;i++){
            arr[i] = input.nextInt();
        }
        // precomputation
        for (int i = 0;i<n;i++){
            hash[arr[i]]++;

        }

        System.out.println("enter the query element");
        int q = input.nextInt();
        while (q-->0){
            System.out.println("enter the number whose freq you want to find");
            int number = input.nextInt();
            System.out.println(hash[number]);
        }







    }
}
