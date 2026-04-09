import java.util.Scanner;

public class L1Q11_Taking_input_in_an_array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User se array ka size lena
        System.out.println("enter size of the array");
        int n = input.nextInt();

        // 🔥 IMPORTANT: new int[n]
        // Yeh ek array banata hai jisme n number of elements honge
        // Default value har index pe 0 hoti hai
        // Example: n = 4 → arr = [0, 0, 0, 0]
        int[] arr = new int[n];

        System.out.println("enter arrays");

        // 🔁 FIRST LOOP → INPUT LENA (FILLING ARRAY)
        // Har iteration me:
        // i = index (0,1,2...)
        // arr[i] = user input store hota hai
        for (int i = 0; i < n; i++) {

            // Debugger me:
            // Step Over (F8) → input lega
            // Observe: arr gradually fill hota hai
            arr[i] = input.nextInt();

            // Example flow:
            // i=0 → arr[0]=10 → [10,0,0,0]
            // i=1 → arr[1]=20 → [10,20,0,0]
        }

        // 🔁 SECOND LOOP → OUTPUT PRINT KARNA (READING ARRAY)
        // Har iteration me:
        // arr[i] ko access karke print karte hain
        for (int i = 0; i < n; i++) {

            // Debugger me:
            // Observe:
            // i ka value change ho raha hai
            // arr[i] print ho raha hai
            System.out.println(arr[i]);
        }
    }
}