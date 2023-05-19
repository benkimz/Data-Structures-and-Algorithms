public class ArraysProg{
    public static void main(String args[]) {        
        // declare an array to hold marks of a student for 5 subjects
        float marks[] = new float[5];
        // add marks into the array
        marks[0] = 92.0f;
        marks[1] = 86.5f;
        marks[2] = 75.0f;
        marks[3] = 90.0f;
        marks[4] = 88.0f;

        /* OPERATIONS ON ARRAYS */
        System.out.println("Array 'marks' is of size: "+marks.length);

        // Getting the sum of numbers in the array
        float sum = 0;
        for(float mark: marks){
          sum += mark;
        }
        System.out.println("Total marks: " + sum);        

        // Getting the average of marks
        // Method 1:
        float avg = (float) sum / 5;
        System.out.println("The average mark: " + avg);

        // Method 2: Looping/ iteration
        float average = 0;
        for(float mark: marks){
          average += (float) mark / 5;
        }
        System.out.println("The average by iteration: " + average);


        // Lets initialize an array to hold names for 5 students
        String students[] = new String[5];
        // add some 5 students in the array
        students[0] = "John";
        students[1] = "Andrew";
        students[2] = "Joe";
        students[3] = "Sam";
        students[4] = "Ben";

        // print out the students in the array
        // Method 1: foreach loop
        for(String student: students){
          System.out.println(student); // prints the name of each student
        }
        //Method 2:
        for(short i = 0; i < students.length; i++){
          System.out.println(students[i]); // prints the name of each student
        }
    }
}