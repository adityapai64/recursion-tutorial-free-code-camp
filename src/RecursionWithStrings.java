public class RecursionWithStrings {

    //String reversal
    public String reverseStringMySolution(String input) {
        //Base case: when the string contains only one character
        if(input.length() == 1) {
            return input;
        }
        //Recursive case:
        //Return the last character + a recursive call to the function without the last char
        return input.charAt(input.length() - 1) + reverseStringMySolution(input.substring(0, input.length()-1));
    }

    public String reverseStringAuthorsSolution(String input) {
        //Base case: return empty string
        if(input.equals("")) {
            return "";
        }
        //Recursive case: recursively call the function without the first char while
        //concatenating the first char to the result of recursion
        return reverseStringAuthorsSolution(input.substring(1)) + input.charAt(0);
    }

    /*Palindrome: Word which spells the same forwards and backwards*/
    public boolean palindromeCheckMySolution(String input) {
        /*Base case: If input length is 1, return true.*/
        if (input.length() < 2) {
            return true;
        }

        /*Recursive case: Check if the first and last characters match and recurse with the rest of the string*/
        return input.charAt(0) == input.charAt(input.length() -1)
                && palindromeCheckMySolution(input.substring(1, input.length() - 1));
    }

    public boolean palindromeCheckAuthorsSolution(String input) {
        //Base case: return true if input is empty or has a length of 1
        if(input.isEmpty() || input.length() == 1){
            return true;
        }

        //Check if the first and last characters match.
        //If yes, recursively call the function after removing the first and last characters
        if (input.charAt(0) == input.charAt(input.length() - 1)) {
            return palindromeCheckAuthorsSolution(input.substring(1, input.length() -1));
        }

        //return false if both of the above conditions are not met
        return false;
    }
}
