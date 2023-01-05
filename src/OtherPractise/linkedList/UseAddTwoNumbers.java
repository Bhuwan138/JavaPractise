package OtherPractise.linkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class UseAddTwoNumbers {
    public static void main(String[] args) {

        ListNode l1 = new ListNode();
        int[] firstList = {2,4,3};
        for (int j : firstList) {
            l1.val = j;
            l1.next = l1;
        }

        ListNode l2 = new ListNode();
        int[] secondList = {5,6,4};
        for (int j : secondList) {
            l2.val = j;
            l2.next = l2;
        }
        System.out.println(addTwoNumbers(l1,l2));
    }

    static public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        System.out.println(l1.val);
        return l1;
    }
}
