import java.util.Scanner;

public class check_plaindrome_vi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int num = input.nextInt();
        int reverse = 0;
        // save the original number to compare
        int original = num;
        while (num>0){
            int digits = num%10;
             reverse = reverse*10+digits;
             num = num/10;

        }
        if (original == reverse){
            System.out.println("its a plaindrome");
        }
        else {
            System.out.println("its not a pallindrome");
        }
    }
}
