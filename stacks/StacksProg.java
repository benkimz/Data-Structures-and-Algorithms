import java.util.Stack;

public class StacksProg{
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Get the top element without removing it
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);

        // Get the size of the stack
        int size = stack.size();
        System.out.println("Size of stack: " + size);
    }
}
