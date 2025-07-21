//Problem : URL=https://leetcode.com/problems/valid-anagram/
//242. Valid Anagram
//Solved
//Easy
//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//Example 1:
//Input: s = "anagram", t = "nagaram"
//Output: true
//
//Example 2:
//Input: s = "rat", t = "car"
//Output: false


import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        //I tried but failed this is my Wrong submission
        //to a variable status to check true or false value
        boolean status = true;
        //Checking edge case if length of s and t are not same then it will set status false
        if(s.length() != t.length()){
            status = false;
        } else{
            //created a two char array a1 and a1 which converts each String s and t into
            //lowercase and into array
            char[] a1 = s.toLowerCase().toCharArray();
            char[] a2 = s.toLowerCase().toCharArray();

            //Sorting both the Char array a1 and a2 which will make it is to compare
            Arrays.sort(a1);
            Arrays.sort(a2);

            //Comparing and assigning both the char array to status which will then return their status
            status = Arrays.equals(a1, a2);
        }
        return status;
    }

    public boolean isAnagram1(String s, String t) {
        //Same checks for the edge cases whether true or not
        if(s.length() != t.length()) return false;

        int[] freq = new int[26];//An array named freq of size 26
        for(char c: s.toCharArray()) freq[c-'a']++;//Iterating over each character of the newly converted String to char array and incrementing freq
        for(char c: t.toCharArray()) if(--freq[c-'a']<0) return false;//Iterating over each character of the newly converted String to char array and incrementing freq
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int j : freq) {
            if (j != 0)
                return false;
        }
        return true;
    }


}
