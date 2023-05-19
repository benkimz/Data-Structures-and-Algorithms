import java.util.LinkedList;

public class LinkedLists{
    public static void main(String args[]){
        // Initialize a LinkedList to store student names
        LinkedList<String> students = new LinkedList<String>(); 

        // Add students into the list: list.add(student)
        students.add("Ben");
        students.add("John");
        students.add("James");

        // Get the size of your linked-list: list.size()
        System.out.println("List is of size: " + students.size()); // prints List is of size: 3

        // Declaring a linked list
        LinkedList<Integer> data;
        // Initializing the linked list
        data = new LinkedList<Integer>();
        // check if the list is empty
        System.out.println("Is the LinkedList empty? >> " + data.isEmpty());

        // Add integer items into the list:
        // I will add numbers between 0 and 100 where n % 5 == 0
        for(int n = 0; n < 100; n++){
            if(n % 5 == 0) data.add(n);
        }
        System.out.println(data); // Print the list
        
        // checking if a linked list contains an item
        System.out.println("Is the number 10 in data? >> " + data.contains(10));
        
        // removing items from a linked list
        data.remove(0); // removes item at index 0
        data.remove(1); // removes item at index 1
        data.remove(2); // removes item at index 2
        
        System.out.println("After removing 0, 1, and 2 from data: \n" + data);
    }
}
