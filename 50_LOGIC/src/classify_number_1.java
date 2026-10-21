public class classify_number_1 {

    public static String solve(int N) {
        if (N>0){
            return "Positive";
        } else if (N==0) {
            return  "Zero";
        }
        return "Negative";

    }

    public static void main(String[] args) {
        System.out.println(solve(4));
    }
}