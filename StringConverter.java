public class StringConverter {
    public static void main(String[] args) {
        // Number to String
        int number = 123;
        String numberAsString = Integer.toString(number);
        System.out.println("Number to String: " + numberAsString);

        // String to Number
        String strNumber = "456";
        int stringToNumber = Integer.parseInt(strNumber);
        System.out.println("String to Number: " + stringToNumber);

        // Reverse a string
        String input = "hello world";
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    // Function to reverse a string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
