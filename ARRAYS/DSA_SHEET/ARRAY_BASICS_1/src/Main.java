import java.util.*;

public class Main {

    // Q1 - add elements
    static ArrayList<Integer> addElements(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        return list;
    }

    // Q2 - access element
    static int accessElements(ArrayList<Integer> list, int index) {

        return list.get(index);
    }

    // Q3 - update element
    static ArrayList<Integer> update_elements(
            ArrayList<Integer> list, int index, int element) {

        list.set(index, element);

        return list;
    }

    // Q4 - find size
    static int find_size(ArrayList<Integer> list) {

        return list.size();
    }

    // Q5 - remove element
    static ArrayList<Integer> remove_element(
            ArrayList<Integer> list, int index) {

        list.remove(index);

        return list;
    }

    // Q6 - print all elements
    static void print_elements(ArrayList<Integer> list) {

        System.out.println(list);
    }

    // Q7 - find sum
    static int find_sum(ArrayList<Integer> list) {

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        return sum;
    }

    // Q8 - find maximum element
    static int find_max_element(ArrayList<Integer> list) {

        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {

            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        return max;
    }

    // Q9 - find minimum element
    static int find_min_element(ArrayList<Integer> list) {

        int min = list.get(0);

        for (int i = 1; i < list.size(); i++) {

            if (list.get(i) < min) {
                min = list.get(i);
            }
        }

        return min;
    }

    // Q10 - count even numbers
    static int find_even_numbers(ArrayList<Integer> list) {

        int even = 0;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) % 2 == 0) {
                even++;
            }
        }

        return even;
    }

    // Q11 - find second largest number
    static int second_largest(ArrayList<Integer> list) {

        int largest = list.get(0);
        int second_largest = Integer.MIN_VALUE;

        for (int i = 1; i < list.size(); i++) {

            int current = list.get(i);

            if (current > largest) {

                second_largest = largest;
                largest = current;

            } else if (current > second_largest && current != largest) {

                second_largest = current;
            }
        }

        return second_largest;
    }

    // Q12 - reverse an ArrayList
    static ArrayList<Integer> reversed_array(
            ArrayList<Integer> list) {

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {

            int temp = list.get(left);

            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }

        return list;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ==========================================
        // INPUT
        // ==========================================

        System.out.println("Enter the number of elements:");
        int n = input.nextInt();

        if (n < 2) {
            System.out.println(
                    "Please enter at least 2 elements."
            );
            return;
        }

        int[] arr1 = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();
        }

        // ==========================================
        // Q1 - ADD ELEMENTS
        // ==========================================

        ArrayList<Integer> list1 = addElements(arr1);

        System.out.println("\nQ1 - List:");
        System.out.println(list1);

        // ==========================================
        // Q2 - ACCESS ELEMENT
        // ==========================================

        System.out.println("\nQ2 - Enter index to access:");
        int accessIndex = input.nextInt();

        if (accessIndex >= 0 && accessIndex < list1.size()) {

            int element = accessElements(list1, accessIndex);

            System.out.println(
                    "Element at index " + accessIndex + ": " + element
            );

        } else {
            System.out.println("Invalid index.");
        }

        // ==========================================
        // Q3 - UPDATE ELEMENT
        // ==========================================

        System.out.println("\nQ3 - Enter index to update:");
        int updateIndex = input.nextInt();

        System.out.println("Enter new element:");
        int newElement = input.nextInt();

        if (updateIndex >= 0 && updateIndex < list1.size()) {

            ArrayList<Integer> updated_list =
                    update_elements(list1, updateIndex, newElement);

            System.out.println("Updated list:");
            System.out.println(updated_list);

        } else {
            System.out.println("Invalid index.");
        }

        // ==========================================
        // Q4 - FIND SIZE
        // ==========================================

        int size = find_size(list1);

        System.out.println("\nQ4 - Size of list: " + size);

        // ==========================================
        // Q5 - REMOVE ELEMENT
        // ==========================================

        System.out.println("\nQ5 - Enter index to remove:");
        int removeIndex = input.nextInt();

        if (removeIndex >= 0 && removeIndex < list1.size()) {

            ArrayList<Integer> removed_list =
                    remove_element(list1, removeIndex);

            System.out.println("After removing:");
            System.out.println(removed_list);

        } else {
            System.out.println("Invalid index.");
        }

        // ==========================================
        // Q6 - PRINT ELEMENTS
        // ==========================================

        System.out.println("\nQ6 - All elements:");
        print_elements(list1);

        // ==========================================
        // Q7 - FIND SUM
        // ==========================================

        System.out.println(
                "\nQ7 - Sum: " + find_sum(list1)
        );

        // ==========================================
        // Q8 - FIND MAX
        // ==========================================

        System.out.println(
                "Q8 - Maximum: " + find_max_element(list1)
        );

        // ==========================================
        // Q9 - FIND MIN
        // ==========================================

        System.out.println(
                "Q9 - Minimum: " + find_min_element(list1)
        );

        // ==========================================
        // Q10 - COUNT EVEN NUMBERS
        // ==========================================

        System.out.println(
                "Q10 - Even numbers count: "
                        + find_even_numbers(list1)
        );

        // ==========================================
        // Q11 - SECOND LARGEST
        // ==========================================

        System.out.println(
                "\nQ11 - Enter size of second-largest list:"
        );

        int size_sec_largest = input.nextInt();

        if (size_sec_largest < 2) {

            System.out.println(
                    "At least 2 elements are required."
            );

        } else {

            ArrayList<Integer> sec_largest_list =
                    new ArrayList<>();

            System.out.println(
                    "Enter elements:"
            );

            for (int i = 0; i < size_sec_largest; i++) {

                int element = input.nextInt();

                sec_largest_list.add(element);
            }

            System.out.println(
                    "List: " + sec_largest_list
            );

            int secondLargest =
                    second_largest(sec_largest_list);

            if (secondLargest == Integer.MIN_VALUE) {

                System.out.println(
                        "No second distinct largest element."
                );

            } else {

                System.out.println(
                        "Q11 - Second largest: "
                                + secondLargest
                );
            }

            // ==========================================
            // Q12 - REVERSE ARRAYLIST
            // ==========================================

            System.out.println("\nQ12 - Reversed list:");

            ArrayList<Integer> reversed =
                    reversed_array(sec_largest_list);

            System.out.println(reversed);
        }

        input.close();
    }
}