public class ReverseString {
    public static void main(String[] args) {
        // Input string
        String original = "Hello, World!";
        
        // Reverse the string using a StringBuilder
        String reversed = new StringBuilder(original).reverse().toString();

        // Display the original and reversed strings
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
