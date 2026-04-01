package Easy;

// Problem URL=https://leetcode.com/problems/remove-duplicates-from-sorted-list/

//83. Remove Duplicates from Sorted List
//        Solved
//Easy
//        Topics
//premium lock icon
//        Companies
//Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

//Example 1:
//Input: head = [1,1,2]
//Output: [1,2]

//Example 2:
//Input: head = [1,1,2,3,3]
//Output: [1,2,3]
//
//Constraints:
//
//The number of nodes in the list is in the range [0, 300].
//        -100 <= Node.val <= 100
//The list is guaranteed to be sorted in ascending order.
//
//Seen this question in a real interview before?
//        1/5
//Yes
//        No
//Accepted
//23,34,308/4.1M
//Acceptance Rate
//56.5%
//Topics
//Linked List

import java.util.Scanner;

public class RemoveDuplicatesFromSortedList {
    /** Definition for singly-linked list. */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Your exact solution (marked as static so main can use it)
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        if(current != null){
            while(current.next != null){
                if(current.next.val == current.val){
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
        }
        return head;
    }

    // Helper method to print the list nicely
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // The Main method to read input and run everything
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Note: Your algorithm expects the duplicates to be next to each other,
        // so the user should input numbers in sorted order (e.g., 1 1 2 3 3)
        System.out.println("Enter numbers for a SORTED linked list (enter -1 to stop):");

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // 1. Take User Input
        while (true) {
            int input = scanner.nextInt();

            if (input == -1) {
                break; // Stop taking input when user types -1
            }

            tail.next = new ListNode(input);
            tail = tail.next;
        }

        ListNode head = dummy.next; // The real list starts after the dummy

        // 2. Print Original List
        System.out.println("\nOriginal List:");
        printList(head);

        // 3. Run Your Method
        head = deleteDuplicates(head);

        // 4. Print Modified List
        System.out.println("\nList after removing duplicates:");
        printList(head);

        scanner.close();
    }
}
