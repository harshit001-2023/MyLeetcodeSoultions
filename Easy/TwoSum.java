//Problem : URL=https://leetcode.com/problems/two-sum
//1. Two Sum
//Solved
//Easy
//Topics
//Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution,
// and you may not use the same element twice.
//You can return the answer in any order.
//
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
/**
 * Intuition/Approach:
 * This problem asks for two numbers that add up to a target. A HashMap is the
 * perfect tool for this. We can iterate through the array once. For each number,
 * we calculate the 'complement' (target - current_number). Then, we check if
 * this complement already exists as a key in our HashMap.
 * - If it exists, we have found our pair. We return the current index and the
 * index stored in the map.
 * - If it doesn't exist, we put the current number and its index into the map
 * and continue to the next number.
 *
 * Time Complexity: O(n)
 * We iterate through the array of n elements only once. Each lookup and insert
 * in the HashMap takes constant time on average, O(1).
 *
 * Space Complexity: O(n)
 * In the worst case, we might have to store all n elements in the HashMap.
 */


public class TwoSum {
    public int[] twoSum(int[] nums, int target) {//takes two parameter 1 is array and 2 is integer
        //Iterating over the array till ir length
        for (int i = 0; i < nums.length; i++) {
            //Again iterating but staring from position os i form first for loop
            for (int j = i + 1; j < nums.length; j++) {
                //Checking whether the sum of two elements are equal to target or not by iterating over the array
                if (nums[i] + nums[j] == target) {
                    //if equal then return a new array with both elements Indexes
                    return new int[]{i, j};
                }
            }
        }
        return null; // No solution found
    }

    // Main method for testing
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}
