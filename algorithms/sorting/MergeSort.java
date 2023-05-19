import java.util.Arrays;

public class MergeSort{

    public static void main(String args[]){

        // An example array of integers to sort
        int data[] = {5, 9, 31, 45, 23, 17, 15, 52, 38, 20, 2, 78, 22, 3};

        // Sorting with the algorithm 
        int sortedData[] = mergeSort(data);

        // Printing the output
        for(int num: sortedData){
            System.out.print("\t" + num + "\n");
        }
    }

    public static int[] mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] leftArr = Arrays.copyOfRange(arr, 0, mid);
        int[] rightArr = Arrays.copyOfRange(arr, mid, arr.length);

        return merge(mergeSort(leftArr), mergeSort(rightArr));
    }

    public static int[] merge(int[] leftArr, int[] rightArr) {
        int[] mergedArr = new int[leftArr.length + rightArr.length];

        int left = 0;
        int right = 0;
        int index = 0;

        while (left < leftArr.length && right < rightArr.length) {
            if (leftArr[left] < rightArr[right]) {
                mergedArr[index] = leftArr[left];
                left++;
            }else {
                mergedArr[index] = rightArr[right];
                right++;
            }
            index++;
        }

        while (left < leftArr.length) {
            mergedArr[index] = leftArr[left];
            left++;
            index++;
        }

        while (right < rightArr.length) {
            mergedArr[index] = rightArr[right];
            right++;
            index++;
        }

        return mergedArr;
    }
}