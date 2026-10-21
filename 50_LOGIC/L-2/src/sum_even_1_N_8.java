public class sum_even_1_N_8 {
    /*
    * Problem statement: Given positive integer N, return the sum of all even integers in the range from 1 through N.
    * */
    public static int sum_even(int N){
        int sum = 0;
        for (int i = 2;i<=N;i++){
            if (i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum_even(10));
    }
}
