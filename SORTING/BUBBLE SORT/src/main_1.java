import java.util.Scanner;

public class main_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr ={2,4,1,3,4,5};

    }
    static void bubble(int[] num) {
        boolean swapping;

        for (int i = 0; i < num.length - 1; i++) {
            swapping = false;

            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    swapping = true;
                }
            }

            if (swapping == false) {
                break;
            }
        }
    }
}
