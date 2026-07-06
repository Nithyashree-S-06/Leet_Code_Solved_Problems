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

 //Optimal Approach
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}

//Another Approach
/*int mid=list_length(head);
        ListNode temp=head;
        for(int i=1; i<mid; i++){
            temp=temp.next;
        }
        return temp;
    }
    int list_length(ListNode h){
        ListNode temp=h;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return (cnt/2)+1;
    }*/