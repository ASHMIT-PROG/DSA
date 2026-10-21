public class a_raised_b_11 {
    public  static long a_pow_b(int a,int b) {
        int result = 1;
        for (int i = 0 ; i<b ; i++){
            result*=a;

        }
        return  result;
    }
    public static void main(String[] args) {
        System.out.println(a_pow_b(3,3));
    }
}
