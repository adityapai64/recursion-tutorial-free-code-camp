import java.util.HashMap;
import java.util.List;

public class DivideAndConquerAlgorithms {
    public int binarySearch(List<Integer> searchList, int left, int right, int target) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (searchList.get(mid) == target) {
            return mid;
        }

        if (searchList.get(mid) < target) {
            return binarySearch(searchList, left, mid - 1, target);
        }
        return binarySearch(searchList, mid + 1, right, target);
    }

    public int fibonacci (int input) {
        if(input == 0 || input == 1) {
            return input;
        }
        return fibonacci(input - 1) + fibonacci(input -2);
    }

    public Long fibonacciOptimised(Long input, HashMap<Long, Long> memo) {
        if(memo.containsKey(input)) {
            return memo.get(input);
        }

        if (input == 0L || input == 1L) {
            return input;
        }
        memo.put(input, fibonacciOptimised(input - 1, memo) + fibonacciOptimised(input - 2, memo));
        return memo.get(input);
    }

    public int[] mergeSort(int[] arrayToSort, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arrayToSort, start, mid);
            mergeSort(arrayToSort, mid + 1, end);
        }
        return merge(arrayToSort, start, (start + end) / 2, end);
    }

    private int[] merge(int[] intArray, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];

        int i = start, j = mid + 1, k = 0;

        //While both sub arrays have values, compare and merge them in sorted order
        while (i <= mid && j <= end) {
            if (intArray[i] <= intArray[j]) {
                temp[k++] = intArray[i++];
            } else {
                temp[k++] = intArray[j++];
            }
        }

        //Add the rest of the values from the left sub-array into the result.
        while (i <= mid){
            temp[k++] = intArray[i++];
        }
        //Add the rest of the values from the right sub-array into the result.
        while (j <= end) {
            temp[k++] = intArray[j++];
        }

        //Copy the sorted array back into the original array
        for (i = start; i <= end; i++) {
            intArray[i] = temp[i - start];
        }
        return temp;
    }
}
