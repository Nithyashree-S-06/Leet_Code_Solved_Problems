/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode h2=null;//step-1
        ListNode temp=head;//step-2
        while(temp!=null){
            head=head.next; //moving head to next node
            temp.next=h2;//head node become null using temp
            h2=temp;
            temp=head;
        }
        return h2;
    }
}