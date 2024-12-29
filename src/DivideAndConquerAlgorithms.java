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
}
