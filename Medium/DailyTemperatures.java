//Problem: URL=https://leetcode.com/problems/daily-temperatures/
//
//739. Daily Temperatures
//        Attempted
//        Medium
//
//        Given an array of integers temperatures represents the daily temperatures,
//        return an array answer such that answer[i] is the number of days you have to wait
//        after the ith day to get a warmer temperature. If there is no future day for which this
//        is possible, keep answer[i] == 0 instead.
//
//        Example 1:
//        Input: temperatures = [73,74,75,71,69,72,76,73]
//        Output: [1,1,4,2,1,1,0,0]
//
//        Example 2:
//        Input: temperatures = [30,40,50,60]
//        Output: [1,1,1,0]
//
//        Example 3:
//        Input: temperatures = [30,60,90]
//        Output: [1,1,0]
//
//        Constraints:
//        1 <= temperatures.length <= 105
//        30 <= temperatures[i] <= 100

package Medium;

import java.util.Arrays;

//This is the very classic brute force approach it is old approach which can't handle big inputs
// otherwise Leetcode will throw Time Exceeded error
public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        // 1. Create a result array of the same size
        int[] result = new int[temperatures.length];

        // 2. Outer loop to look at each day
        for (int i = 0; i < temperatures.length; i++) {
            // 3. Inner loop to look at the days to the right
            for (int j = i + 1; j < temperatures.length; j++) {
                // 4. Check for the first warmer day
                if (temperatures[j] > temperatures[i]) {
                    // If we find it, calculate the distance
                    result[i] = j - i;
                    // Important: stop the inner loop and move to the next day
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] temps = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] answer = dailyTemperatures(temps);
        // This will print: [1, 1, 4, 2, 1, 1, 0, 0]
        System.out.println(Arrays.toString(answer));
    }
}
