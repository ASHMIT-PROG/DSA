import java.util.Scanner;
// basic take input of pattern
public class patterns_1 {
    public void pattern(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("*");// agar mai yaha pe println likh deta toh galat ho jata
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        patterns_1 obj = new patterns_1();
        obj.pattern(n);
    }
}