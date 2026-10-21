public class sum_1_N_7 {
    public static int sum_n (int N){
        int sum = 0;
        for (int i = 0;i<=N;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum_n(5));
    }
}
