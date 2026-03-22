package QUESTIONS;

import java.util.Scanner;

public class find_maxelement_maxcount {
    public static void main(String[] args) {
        int [] arr ={2,3,2,5,5,2};

        int max_element = 0;
        for (int i=0;i<=arr.length-1;i++){
            if (arr[i]>max_element){
                max_element = arr[i]; // agar mai arr[i]=max_element; likhu toh mai arr ko update krr raha hoon max_elememt ko mahi
            }
        }

        int count_max_element =0;
        for (int i=0;i<=arr.length-1;i++){
            if (arr[i]==max_element){
                count_max_element++;
            }
        }
        System.out.println("max element"+max_element);
        System.out.println("count_max_element"+count_max_element);
    }
}

