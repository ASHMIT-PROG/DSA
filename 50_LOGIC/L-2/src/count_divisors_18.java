public class count_divisors_18 {
    public static int count_div(int n){
        int count = 0 ;
        for(int i =1;i<=Math.sqrt(n);i++){
            if (n%i==0){
                if (n/i==i){
                    System.out.println(i);//100/10 = 10
                    count++;
                }
                else {
                    System.out.println(i);// first pair
                    System.out.println(n/i);// second pair
                    count+=2;// total numbers
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(count_div(100));
    }
}
