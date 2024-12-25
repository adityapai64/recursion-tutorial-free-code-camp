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
}
