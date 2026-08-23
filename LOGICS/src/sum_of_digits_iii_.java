import java.util.Scanner;

public class sum_of_digits_iii_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the digit");
        int num = input.nextInt();
        int sum= 0;
        while (num>0){
            int digit = num%10; // number ka last digit nikal jaa raha hai
            sum = sum+digit;
            num = num/10;// number chota hoo jaa raha hai
        }
        System.out.println(sum);
    }
}
