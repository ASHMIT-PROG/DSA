import java.util.Scanner;

public class L1_Count_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // count zeros
        System.out.println("enter the number");
        int w = input.nextInt();
        int n = w;
        int count =0;
        while (n>0){
            int last_digit = n%10;
            if (last_digit==0){
                System.out.println("the last digit 0 is = "+last_digit);
                count++;
            }
            n = n/10;

        }
        System.out.println("times when last digit 0 came"+count);





    }
}
