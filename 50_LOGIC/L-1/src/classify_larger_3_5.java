public class classify_larger_3_5 {
    public static int  classify_3(int a,int b,int c){
      if (a>=b && a>=c){
          return a;
      } else if (b>=c && b>=a) {
          return b;

      }
      else {
          return c;
      }
    }
    public static void main(String[] args) {
        System.out.println(classify_3(43,5467,432));
    }
}
