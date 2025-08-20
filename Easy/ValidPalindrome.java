//Problem : URL=https://leetcode.com/problems/valid-palindrome/
//125. Valid Palindrome
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//A phrase is a palindrome if, after converting all uppercase letters
// into lowercase letters and removing all non-alphanumeric characters,
// it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.
//
//Example 1:
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.


class ValidPalindrome {
    public boolean isPalindrome(String s) {
        //Removing all the spaces and comas and converting them to Lower case letters
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        //Using StringBuilder method for reversing it
        String rev = new StringBuilder(cleaned).reverse().toString();
        //Comparing and return the boolean value
        return cleaned.equals(rev);
    }

    public static void main(String[] args) {
        ValidPalindrome isPal = new ValidPalindrome();

        System.out.println(isPal.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
