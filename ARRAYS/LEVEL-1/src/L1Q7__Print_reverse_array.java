import java.util.Scanner;

public class L1Q7__Print_reverse_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6};
        reverse(arr);
    }
    static void reverse(int [] num){
        for (int i = num.length-1;i>=0;i--){// matlab i >= 1 i ki value 1 ya usse badi hai tab tak chala
            System.out.println(num[i]);
        }
    }
}
