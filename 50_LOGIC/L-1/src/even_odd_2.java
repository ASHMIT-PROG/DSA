public class even_odd_2 {
    public static String find(int N){
        if (N%2==0){
            return "even";
        }
        return "odd";
    }
    public static void main(String[] args) {
        System.out.println(find(4));
    }
}
