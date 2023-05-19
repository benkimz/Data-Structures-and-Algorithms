import java.util.Scanner;

public class BinarySearch{
    public static void main(String args[]){

        int targetArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Scanner userinput = new Scanner(System.in);


        while(true){
            System.out.print("Value to search: ");
            int val = userinput.nextInt();
            int results = binarySearch(targetArray, val);
            System.out.print("\nThe number " + val + " is at index: " + results + "\n");            
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }    
}