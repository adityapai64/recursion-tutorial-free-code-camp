import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RecursionWithStrings recursionWithStrings = new RecursionWithStrings();
        RecursionWithNumbers recursionWithNumbers = new RecursionWithNumbers();
        DivideAndConquerAlgorithms divideAndConquerAlgorithms = new DivideAndConquerAlgorithms();

        System.out.println(recursionWithStrings.reverseStringMySolution("abcdefg"));
        System.out.println(recursionWithStrings.reverseStringAuthorsSolution("abcdefg"));
        System.out.println(recursionWithStrings.palindromeCheckMySolution("malayalam"));
        System.out.println(recursionWithStrings.palindromeCheckAuthorsSolution("kayak"));

        System.out.println(recursionWithNumbers.decimalToBinaryMySolution(255));
        System.out.println(recursionWithNumbers.decimalToBinaryAuthorsSolution(255, ""));
        System.out.println(recursionWithNumbers.sumOfNaturalNumbersMySolution(4));

        System.out.println(divideAndConquerAlgorithms.binarySearch(List.of(1, 5, 7, 9), 0, 3, 22));
        System.out.println(divideAndConquerAlgorithms.fibonacci(7));
        System.out.println(divideAndConquerAlgorithms.fibonacciOptimised(50L, new HashMap<>()));
        int[] data =new int[]{5, 3, 8, 6, 2};
        divideAndConquerAlgorithms.mergeSort(data, 0, 4);
        System.out.println(Arrays.toString(data));
    }
}