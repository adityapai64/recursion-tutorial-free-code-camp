public class RecursionWithNumbers {

    public String decimalToBinaryMySolution(Integer input) {
        /*Base case: if number is lower than 1, return its remainder when divided by 2 as a String*/
        if(input  <= 1) {
            return String.valueOf(input % 2);
        }
        /*Recursive case: return a recursive call to the number divided by to
        and concatenate the remainder of the number % 2 to the end */
        return decimalToBinaryMySolution(input/2) + input % 2;
    }

    public String decimalToBinaryAuthorsSolution(int decimal, String result) {
        if (decimal == 0) {
            return result;
        }

        result = decimal % 2 + result;
        return decimalToBinaryAuthorsSolution(decimal/2, result);
    }

    public Integer sumOfNaturalNumbersMySolution(int input) {
        if (input == 1) {
            return input;
        }
        return input + sumOfNaturalNumbersMySolution(input - 1);
    }
    //Author's solution to this was exactly the same as the one above

}
