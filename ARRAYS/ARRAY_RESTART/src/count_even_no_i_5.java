import java.util.Scanner;

public class count_even_no_i_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        int even = 0;

        for (int i = 0; i < n; i++) {

            arr[i] = input.nextInt();

            if (arr[i] % 2 == 0) {

                System.out.println(
                        "Even Number = " + arr[i] +
                                ", Index = " + i
                );

                even++;//even = even+1;
            }
        }

        System.out.println("Total Even Numbers = " + even);

        input.close();
    }
}