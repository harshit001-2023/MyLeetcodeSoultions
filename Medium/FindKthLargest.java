//Problem: URL=https://leetcode.com/problems/kth-largest-element-in-an-array/
//
//215. Kth Largest Element in an Array
//Solved
//Medium
//
//Given an integer array nums and an integer k, return the kth largest element in the array.
//Note that it is the kth largest element in the sorted order, not the kth distinct element.
//Can you solve it without sorting?
//
//Example 1:
//Input: nums = [3,2,1,5,6,4], k = 2
//Output: 5
//
//Example 2:
//Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
//Output: 4
//
//Constraints:
//1 <= k <= nums.length <= 105
//-104 <= nums[i] <= 104

package Medium;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindKthLargest {
    public static int findKthLargest(int nums[], int k){
     if(nums == null || nums.length == 0){
         return 0;
     }
        Arrays.sort(nums);
     return nums[nums.length - k];
    }

    public static int findKthLargest1(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i : nums){
            pq.add(i);
            if(pq.size() > k){
                pq.poll();
            }
        }

        return pq.peek();
    }

    public static void main(String[] arg){
        int[] nums = {1,4,8,7,5,1,4,3,4,9,6};
        int k = 9;
        System.out.println(findKthLargest(nums, k));
        System.out.println(findKthLargest1(nums, k));
    }
}
