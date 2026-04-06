import java.util.Scanner;

public class ARRAYS_1__print_all_elements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6};// agar mai yaha pe System.out.println(print_arr(arr)); likhta toh error aataa rewason 👉 print_arr(arr) → kuch return nahi karta matlab println boll raha hai ki bhai mujhe pata hii nahi kya print karna hai
                print_arr(arr);
    }
    static void print_arr(int[]num){
        for (int i=0;i<=num.length-1;i++){
            System.out.println(num[i]);
        }
    }
}
