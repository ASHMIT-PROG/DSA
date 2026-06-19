import java.util.Scanner;

public class reverse_array_i_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF ARRAY");
        int n = input.nextInt();
        int [] arr = new int[n];
        System.out.println("give the input of the array");
        for (int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        reverse_array(arr);
    }
    static void reverse_array (int [] reverse_arr){
        for (int i=reverse_arr.length-1;i>=0;i--){
            System.out.println(reverse_arr[i]);
        }

    }
}
