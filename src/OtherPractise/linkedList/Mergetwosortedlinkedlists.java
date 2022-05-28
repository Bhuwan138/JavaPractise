package OtherPractise.linkedList;
import java.util.*;
/*
* https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1
* Merge two sorted linked lists
* */

import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Mergetwosortedlinkedlists {

    Node head;
    /* Function to print linked list */
    public static void printList(Node head)
    {

        while (head!= null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int N = 4, M=3;
        int[] valueN = {5,10,15,40};
        int[] valueM = {2,3,20};
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();

            while(t>0)
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                OtherPractise.linkedList.Node head1 = new OtherPractise.linkedList.Node(sc.nextInt());
                OtherPractise.linkedList.Node tail1 = head1;
                for(int i=0; i<n1-1; i++)
                {
                    tail1.next = new OtherPractise.linkedList.Node(sc.nextInt());
                    tail1 = tail1.next;
                }
                OtherPractise.linkedList.Node head2 = new OtherPractise.linkedList.Node(sc.nextInt());
                OtherPractise.linkedList.Node tail2 = head2;
                for(int i=0; i<n2-1; i++)
                {
                    tail2.next = new OtherPractise.linkedList.Node(sc.nextInt());
                    tail2 = tail2.next;
                }

                LinkedList obj = new LinkedList();
                OtherPractise.linkedList.Node head = obj.sortedMerge(head1,head2);
                printList(head);

                t--;
            }
    }
}

class LinkedList
{
    //Function to merge two sorted linked list.

    Node sortedMerge(Node head1, Node head2) {
//        Node node = null;
//        //checking for first node and second node
//
//        while (head1!= null && head2 != null){
//            if(head1.data >= head2.data){
//                node.data = head1.data;
//                head1 = head1.next;
//            }else{
//                node.data = head2.data;
//                head2 = head2.next;
//            }
//            node.next = null;
//        }
//
//        while(head1 == null && head2!= null){
//            node.data = head2.data;
//            head2.next = head2;
//        }
//
//        while (head2 == null && head1!=null){
//            node.data = head1.data;
//            head1.next = head1;
//        }
//        return node;
        Node prev=null;
        Node ans=prev;
        while(head1!=null || head2!=null){
            Node head;
            int data1,data2;
            if(head1==null){
                head=new Node(head2.data);
                head2=head2.next;
            }else if(head2==null){
                head=new Node(head1.data);
                head1=head1.next;
            }else{
                data1=head1.data;
                data2=head2.data;
                if(data1<=data2){
                    head=new Node(head1.data);
                    head1=head1.next;
                }else{
                    head=new Node(head2.data);
                    head2=head2.next;
                }
            }
            if(prev==null){
                prev=head;
                ans=prev;
            }
            else{
                prev.next=head;
                prev=prev.next;
            }
        }
        return ans;
    }
}
