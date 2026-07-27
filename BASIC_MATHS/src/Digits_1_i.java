import java.util.Scanner;

public class Digits_1_i {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the last digit");
        int w = input.nextInt();
        int n=w;
        int last_number;
        int count = 0;
        while(n>0){
            last_number = n%10;// last digit nikalo
            System.out.println("the last number is"+last_number);
            count = count+1;
            // last digit hatao
            n=n/10;
        }
        System.out.println("the total number is"+count);
    }
}
