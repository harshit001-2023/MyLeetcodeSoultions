package Medium;

// Problem URL=https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/

//82. Remove Duplicates from Sorted List II
//    Solved
//    Medium
//    Topics
//    premium lock icon
//    Companies
//    Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

//    Example 1:
//    Input: head = [1,2,3,3,4,4,5]
//    Output: [1,2,5]

//    Example 2:
//    Input: head = [1,1,1,2,3]
//    Output: [2,3]
//
//    Constraints:
//    The number of nodes in the list is in the range [0, 300].
//    -100 <= Node.val <= 100
//    The list is guaranteed to be sorted in ascending order.
//
//    Seen this question in a real interview before?
//    1/5
//    Yes
//    No
//    Accepted
//    10,84,282/2.1M
//    Acceptance Rate
//    51.5%
//    Topics
//    Linked List
//    Two Pointers

import java.util.Scanner;

public class RemoveDuplicatesFromSortedListII {

    // Your exact solution (marked as static so main can use it)
    public static ListNode deleteDuplicatesII(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode prv = temp;
        ListNode current = head;

        while(current != null){
            if(current.next != null && current.val == current.next.val){
                while(current.next != null && current.val == current.next.val){
                    current = current.next;
                }
                prv.next = current.next;
            }else{
                prv = prv.next;
            }
            current = current.next;
        }

        return temp.next;
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
        head = deleteDuplicatesII(head);

        // 4. Print Modified List
        System.out.println("\nList after removing duplicates:");
        printList(head);

        scanner.close();
    }
}
