public class multiples_k_9 {
    /*
    Problem statement: Given positive integers N and K, count integers in the range [1, N] that are divisible by K.
    */


    public  static  int multiples_k(int k , int n){
        int         count = 0;
        for (int i = 1;i<=n;i++){
            if (i%k==0){
                count++;
                System.out.println(i);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(multiples_k(3,10));
    }
}
