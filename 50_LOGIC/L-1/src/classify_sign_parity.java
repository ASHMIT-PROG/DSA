/*
* Problem statement: Given integer N, return one of "Zero", "Positive Even", "Positive Odd", "Negative Even" or "Negative Odd".
*/
public class classify_sign_parity {
    public static String classify(int N) {
        if (N == 0) {
            return "Zero";
        }
        else if (N > 0) {
            if (N % 2 == 0) {
                return "Positive Even";
            } else {
                return "Positive Odd";
            }
        } else {
            if (N % 2 == 0) {
                return "Negative Even";
            } else {
                return "Negative Odd";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(classify(-5));

    }
}
