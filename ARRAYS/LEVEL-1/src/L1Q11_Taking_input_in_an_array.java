import java.util.Scanner;

public class L1Q11_Taking_input_in_an_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of the array");
        int n  = input.nextInt();
        System.out.println("enter arrays");
        int [] arr = new int[n];
        for (int i=0;i<=n-1;i++){
            arr[i]=input.nextInt();
        }
        for (int i=0;i<=n-1;i++){
            System.out.println(arr[i]);
        }
    }
}
