public class larger_of_2_Nums_4 {
    /*
    * Problem statement: Given integers A and B, return "A" if A is larger, "B" if B is larger, or "Equal" if both values are equal.
    * Return the corresponding result with the larger value when applicable.
    * */
    public static String  compare (int A , int B){
        if (A>B){
            return "A";
        } else if (A==B) {
            return "Equal";

        } else {
            return "B";
        }
    }
    public static void main(String[] args) {
        System.out.println( compare(4,2));
    }
}
