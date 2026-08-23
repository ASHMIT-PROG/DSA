import java.util.Scanner;

public class reverse_a_num_iv_ {
    public static void main(String[] args) {
        //Given a number n, reverse its digits.
        Scanner input = new Scanner(System.in);
        System.out.println("enter the digit");
        int n = input.nextInt();
        int reverse = 0;
        while(n>0){
            // get the last digit
            int digit = n%10;
            reverse = reverse*10+digit;
            // get the last digit
            n = n/10;
        }
        System.out.println(reverse);



        
    }
}
