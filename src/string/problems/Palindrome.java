package string.problems;

public class Palindrome {
    public static void main(String[] args) throws java.lang.Exception {
        checkPalindrome("MADAM");
        checkPalindrome("farzana");
    }

    public static void checkPalindrome(String s) {
        // reverse the given String
        String reverse = new StringBuffer(s).reverse().toString();

        // check whether the string is palindrome or not
        if (s.equals(reverse))
            System.out.println("The word is Palindrome");

        else
            System.out.println("The word is not Palindrome");
    }


}
