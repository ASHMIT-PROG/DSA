import java.util.Scanner;

public class ARRAYS_4__sum_of_arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(sum(arr));
    }
    static int sum(int [] num){
        int sum = 0;
        for (int i=0;i<=num.length-1;i++){
            sum=sum+num[i];
        }
        return sum;
    }

}
