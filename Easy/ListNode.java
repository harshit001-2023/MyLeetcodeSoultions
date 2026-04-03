package Easy;

public class ListNode {
    int val;
    ListNode head;
    ListNode next;

    ListNode(int x){
        this.val = x;
        this.head = null;
        this.next = null;
    }

    ListNode(int x,ListNode head){
        this.val = x;
        this.head = head;
    }

    ListNode(int x,ListNode head,ListNode next){
        this.val = x;
        this.head = head;
        this.next = next;
    }
}
