package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // 1. Create the answer array and fill it with -1
        int[] ans = new int[nums1.length];
        Arrays.fill(ans, -1);

        // 2. Outer loop for each number in nums1
        for (int i = 0; i < nums1.length; i++) {
            boolean foundMatch = false;

            // 3. Inner loop to find the number in nums2
            for (int j = 0; j < nums2.length; j++) {

                // If we've found the number we're looking for...
                if (nums1[i] == nums2[j]) {
                    foundMatch = true;
                }

                // ...and we are now to the right of it...
                if (foundMatch && nums2[j] > nums1[i]) {
                    // ...find the first greater number, save it, and stop searching
                    ans[i] = nums2[j];
                    break; // Exit the inner loop
                }
            }
        }
        return ans;
    }

    public static int[] nextGreaterElement1(int[] nums1, int[] nums2){
        // 1. Create a map to store the answers: {number: next_greater_number}
        HashMap<Integer, Integer> nextGreaterMap = new HashMap<>();

        // 2. Create a stack to keep track of numbers waiting for an answer
        Stack<Integer> stack = new Stack<>();

        // 3. Loop through nums2 to pre-calculate all the answers
        for (int num : nums2) {
            // While the stack isn't empty AND the current number is greater
            // than the number at the top of the stack...
            while (!stack.isEmpty() && num > stack.peek()) {
                // ...we've found the answer for the number on the stack.
                // Pop it off and put the {number: answer} pair in the map.
                nextGreaterMap.put(stack.pop(), num);
            }
            // Push the current number onto the stack to wait for its answer.
            stack.push(num);
        }

        // 4. Any numbers left in the stack have no greater element.
        while (!stack.isEmpty()) {
            nextGreaterMap.put(stack.pop(), -1);
        }

        // 5. Build the final result array for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.get(nums1[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 4, 2};
        int[] nums2 = {1, 3, 4, 2};

        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
        System.out.println(Arrays.toString(nextGreaterElement1(nums1, nums2)));
    }
}
