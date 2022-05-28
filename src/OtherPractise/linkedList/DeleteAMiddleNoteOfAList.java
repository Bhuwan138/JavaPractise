package OtherPractise.linkedList;

import java.util.List;

/*
* https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
* 2095. Delete the Middle Node of a Linked List
* */
public class DeleteAMiddleNoteOfAList {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        int[] data = {1, 3, 4, 7, 1, 2, 6};
        for (int i = 0; i < data.length; i++) {
            head.val = data[i];
            head.next = head;
        }
        System.out.println(deleteMiddle(head));
    }
    static  public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;

        return head;
    }

    static public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
