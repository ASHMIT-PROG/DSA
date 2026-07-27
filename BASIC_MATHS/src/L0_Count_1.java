import java.util.Scanner;

public class L0_Count_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Print numbers from 1 to N and count iterations

        System.out.println("enter the value of N");
        int N = input.nextInt();
        int count =0;

        for (int i = 0;i<=N;i++){
            System.out.println(i);
            count++;
        }
        System.out.println( "Total iterations"+count);





    }
}
