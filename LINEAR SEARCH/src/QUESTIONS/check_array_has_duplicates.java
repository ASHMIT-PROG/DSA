package QUESTIONS;

public class check_array_has_duplicates {

    public static void main(String[] args) {

        int[] arr = {2,3,4,5,2};

        find(arr);
    }

    static void find(int[] num){

        for(int i = 0; i < num.length; i++){

            for(int j = i + 1; j < num.length; j++){

                if(num[i] == num[j]){

                    System.out.println("Duplicate element: " + num[i]);
                    System.out.println("Indexes: " + i + " and " + j);
                }
            }
        }
    }
}
