    import java.util.Scanner;

    import java.util.Scanner;

    public class L1Q6__Search_Element_Linear_Search {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter the target");
            int target = input.nextInt();

            int[] arr = {1,2,3,4,5,6,7};

            System.out.println(Linear_Search(arr, target));
        }

        static int Linear_Search(int[] num, int target){
            if (num.length == 0){
                return -1;
            }

            for (int i = 0; i < num.length; i++){
                if (num[i] == target){
                    return i;
                }
            }

            return -1;
        }
    }