import java.util.ArrayList;

public class ArrayLists{
    public static void main(String[] args) {
        // Create an ArrayList that can hold integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some integers to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Get the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of ArrayList: " + size);

        // Get the element at a specific index
        int secondElement = numbers.get(1);
        System.out.println("Second element of ArrayList: " + secondElement);

        // Modify the element at a specific index
        numbers.set(1, 5);
        System.out.println("Second element of ArrayList after modification: " + numbers.get(1));

        // Remove an element from the ArrayList
        numbers.remove(0);
        System.out.println("Size of ArrayList after removing first element: " + numbers.size());

        // Iterate over the elements in the ArrayList
        System.out.print("Elements in ArrayList: ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
