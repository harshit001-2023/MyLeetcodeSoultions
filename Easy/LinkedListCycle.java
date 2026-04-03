package Easy;

//Problem URL=https://leetcode.com/problems/linked-list-cycle/
//
//        141. Linked List Cycle
//        Solved
//Easy
//        Topics
//premium lock icon
//        Companies
//        Given head, the head of a linked list, determine if the linked list has a cycle in it.
//
//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
//
//Return true if there is a cycle in the linked list. Otherwise, return false.
//
//Example 1:
//Input: head = [3,2,0,-4], pos = 1
//Output: true
//Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
//
//Example 2:
//Input: head = [1,2], pos = 0
//Output: true
//Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
//
//Example 3:
//Input: head = [1], pos = -1
//Output: false
//Explanation: There is no cycle in the linked list.
//
//Constraints:
//
//The number of the nodes in the list is in the range [0, 104].
//        -105 <= Node.val <= 105
//pos is -1 or a valid index in the linked-list.
//
//
//Follow up: Can you solve it using O(1) (i.e. constant) memory?


public class LinkedListCycle {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */

    /**
     * ----------Hare and Tortoise Algorithm----------
     * This Algorithm works on Two Pointers Approach uses Slow and Fast pointers
     * the goal of this algorithm is to find the meeting point of both the pointer
     * here Slow pointer that is Tortoise walks by one step on the other hand Fast that is Hare
     * Moves by Two steps if the list is in loop then there are chances that they will meet at
     * one point if they meet then it means loop.
     * */

    public boolean hasCycle(ListNode head) {
        // Here I am using Slow Fast Two Pointer approach
        // Or also we can say Hare and Tortoise Algorithm

        ListNode fast = head; // Fast or Hare declared on head and Considering head as slow or Tortoise

        // It will Iterate till fast and next becomes null
        while(fast != null && fast.next != null){
            head = head.next; // Slow pointer moves by one step
            fast = fast.next.next; // Fast pointer will move by Two steps

            // If both Pointer comes at same point then it means loop return true
            if(fast == head) return true;
        }

        // If no Pointer is meeting at same point then it is not loop return false
        return false;
    }
}
