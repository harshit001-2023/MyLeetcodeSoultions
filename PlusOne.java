//Problem: URL=https://leetcode.com/problems/plus-one/

//66. Plus One
//Solved
//Easy
//You are given a large integer represented as an integer array digits,
// where each digits[i] is the ith digit of the integer. The digits are ordered
// from most significant to least significant in left-to-right order. The large integer
// does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.
//
//Example 1:
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
//
//Example 2:
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].

class PlusOne {
    public int[] plusOne(int[] digits) {
        StringBuilder number = new StringBuilder();
        for (int num : digits) {
            number.append(num);
        }

        // Convert to String to avoid overflow issues
        String numStr = number.toString();
        StringBuilder resultStr = new StringBuilder();
        int carry = 1; // Start with +1

        // Process digits from right to left
        for (int i = numStr.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(numStr.charAt(i)) + carry;
            carry = digit / 10;
            resultStr.insert(0, digit % 10);
        }

        if (carry > 0) {
            resultStr.insert(0, carry);
        }

        // Convert back to int array
        int[] newDigits = new int[resultStr.length()];
        for (int i = 0; i < resultStr.length(); i++) {
            newDigits[i] = Character.getNumericValue(resultStr.charAt(i));
        }

        return newDigits;
    }

    public int[] plusOne1(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // Early exit if no carry-over
            }
            digits[i] = 0; // Handle 9 → 0 carry-over
        }
        // Only reached for all-9s case
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}