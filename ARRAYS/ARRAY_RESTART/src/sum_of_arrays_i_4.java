import java.util.Scanner;

public class sum_of_arrays_i_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //enter the size of the array
        int n = input.nextInt();
        int [] arr = new int[n];
        int sum =0;
        for (int i=0;i<n;i++){
             arr[i]= input.nextInt();
             sum = sum+arr[i];
        }
        System.out.println(sum);

    }
}
