import java.util.*;

public class stack_3 {

    public static void main(String[] args) {

        // Create Stack using ArrayDeque
        Deque<Integer> stack = new ArrayDeque<>();

        // ---------------- push() ----------------
        // Add element at the TOP / FRONT

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack : " + stack);
        // [40, 30, 20, 10]


        // ---------------- peek() ----------------
        // Access TOP element without removing

        System.out.println("Top : " + stack.peek());
        // 40


        // ---------------- pop() ----------------
        // Remove TOP element

        System.out.println("Removed : " + stack.pop());
        // 40

        System.out.println("After pop : " + stack);
        // [30, 20, 10]


        // ---------------- size() ----------------
        // Number of elements in stack

        System.out.println("Size : " + stack.size());


        // ---------------- contains() ----------------
        // Check if element is present

        System.out.println("Contains 20 : " + stack.contains(20));


        // ---------------- isEmpty() ----------------
        // Check if stack is empty

        System.out.println("Is Empty : " + stack.isEmpty());


        // ---------------- iterator() ----------------
        // Traverse from TOP to BOTTOM

        Iterator<Integer> iterator = stack.iterator();

        while (iterator.hasNext()) {
            System.out.println("Element : " + iterator.next());
        }


        // ---------------- clear() ----------------
        // Remove all elements

        stack.clear();

        System.out.println("After clear : " + stack);

        System.out.println("Is Empty : " + stack.isEmpty());
    }
}