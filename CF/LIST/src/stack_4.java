import java.util.*;

public class stack_4 {

    public static void main(String[] args) {

        // Create a Stack
        Stack<Integer> stack = new Stack<>();

        // ---------------- push() ----------------
        // Add element on the top of stack

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack); // [10, 20, 30]

        // ---------------- pop() ----------------
        // Remove top element

        stack.pop();

        System.out.println(stack); // [10, 20]

        // ---------------- peek() ----------------
        // View top element without removing

        System.out.println(stack.peek());

        // ---------------- empty() ----------------
        // Check whether stack is empty

        System.out.println(stack.empty());

        // ---------------- search() ----------------
        // Returns position from top (1-based)
        // Returns -1 if element not found

        System.out.println(stack.search(20));

        // ---------------- size() ----------------
        // Returns total number of elements

        System.out.println(stack.size());

        // ---------------- add() ----------------
        // Add element at the end (Inherited from Vector)

        stack.add(40);

        System.out.println(stack);

        // ---------------- remove() ----------------
        // Remove element using index

        stack.remove(0);

        System.out.println(stack);

        // ---------------- get() ----------------
        // Access element using index

        System.out.println(stack.get(0));

        // ---------------- set() ----------------
        // Replace element at given index

        stack.set(0, 100);

        System.out.println(stack);

        // ---------------- contains() ----------------
        // Check whether element exists

        System.out.println(stack.contains(40));

        // ---------------- iterator() ----------------
        // Traverse the stack

        Iterator<Integer> iterator = stack.iterator();

        while (iterator.hasNext()) {
            System.out.println("Element : " + iterator.next());
        }

        // ---------------- toArray() ----------------
        // Convert Stack into Array

        Object[] arr = stack.toArray();

        System.out.println(Arrays.toString(arr));

        // ---------------- sort() ----------------
        // Sort in ascending order

        Collections.sort(stack);

        System.out.println("Ascending : " + stack);

        // ---------------- reverseOrder() ----------------
        // Sort in descending order

        Collections.sort(stack, Collections.reverseOrder());

        System.out.println("Descending : " + stack);

        // ---------------- clone() ----------------
        // Creates a shallow copy

        Stack<Integer> newStack = (Stack<Integer>) stack.clone();

        System.out.println(newStack);

        // ---------------- ensureCapacity() ----------------
        // Increase internal capacity

        Stack<Integer> marks = new Stack<>();

        marks.ensureCapacity(100);

        // ---------------- capacity() ----------------
        // Returns current capacity

        System.out.println("Capacity : " + marks.capacity());

        // ---------------- firstElement() ----------------
        // Returns first element

        System.out.println(stack.firstElement());

        // ---------------- lastElement() ----------------
        // Returns last element (Top of Stack)

        System.out.println(stack.lastElement());

        // ---------------- clear() ----------------
        // Remove all elements

        stack.clear();

        System.out.println(stack);

        // ---------------- isEmpty() ----------------
        // Check whether stack is empty

        System.out.println(stack.isEmpty());

    }
}