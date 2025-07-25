//Problem: URL=https://leetcode.com/problems/sqrtx/

//69. Sqrt(x)
//Solved
//Easy

//Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
// The returned integer should be non-negative as well.
//You must not use any built-in exponent function or operator.
//
//For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
//Example 1:
//Input: x = 4
//Output: 2
//Explanation: The square root of 4 is 2, so we return 2.
//Example 2:
//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since we round it down to the
// nearest integer, 2 is returned.

public class SqrtOfx {
    public static int sqrt(int x){
        //Solving edge cases if x is 0 or 1 no need to find its Sqrt, because it will be 0 and 1
        if(x == 1 || x == 0) return 0;

        //Initializing the search range for performing binary search and to find sqrt
        int start = 1;
        int end = x;
        int mid = -1;

        //Performing Binary search to find the sqrt of x
        while(start <= end){

            //Finding mid
            mid = start + (end - start) / 2;

            //If the square of the middle value is greater than x,
                // move the "end" to the left (mid - 1).
            if((long)mid * (long)mid > x) end = mid - 1;

            // If the square of the middle value is equal to x,
                // we found the square root.
            else if (mid * mid == x) return mid;

            // If the square of the middle value is less than x,
                // move the "start" to the right (mid + 1)
            else start = mid + 1;
        }

        // The loop ends when "start" becomes greater than "end", and "end" is the integer value of the square root.
        // However, since we might have been using integer division in the calculations,
        // we round down the value of "end" to the nearest integer to get the correct square root.
        return Math.round(end);
    }

    public static void main(String[] args) {
        int x;
        System.out.println(sqrt(8));
    }
}
