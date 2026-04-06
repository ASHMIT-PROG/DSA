import java.util.Scanner;

public class ARRAYS_5__count_even_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6};
        System.out.println(even(arr));
    }
    static int even(int [] num){
        if (num.length==0){
            return -1;
        }
        int count = 0;
        for (int i=0;i<= num.length-1;i++){
            if (num[i]%2==0){
                System.out.println("number"+num[i]+"count"+count);
                count++;
            }
        }
        return count;
    }
}
