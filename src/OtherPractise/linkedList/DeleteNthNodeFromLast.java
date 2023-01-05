package OtherPractise.linkedList;

public class DeleteNthNodeFromLast {

    public static void main(String[] args) {
        S s = new S();
        ListNode head =new  ListNode();
        int[] data = {1, 2,3,4,5};
        for (int i = 0; i < data.length; i++) {
            head.val = data[i];
            head.next = head;
        }

        int n = 2;
        s.removeNthFromEnd(head,n);
    }
       static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }



       static class S{
           public ListNode removeNthFromEnd(ListNode head, int n) {
               int totalNode = TNode(head);

               if(totalNode == 1) return null;
               if(totalNode == n) return head.next;

               n = totalNode - n;
               deleteNode(head,n);
               return head;
           }

           public int TNode(ListNode head){
               ListNode temp = head;
               int count = 0;
               while(temp != null){
                   count++;
                   temp= temp.next;
               }
               return count;
           }

           public void deleteNode(ListNode head, int n){
               ListNode prev = null;
               ListNode curr = head;

               while(n--> 0){
                   prev = curr;
                   curr = curr.next;
               }

               prev.next = curr.next;
               curr = null;
           }
       }

}
