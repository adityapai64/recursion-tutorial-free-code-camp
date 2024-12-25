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
    }
}