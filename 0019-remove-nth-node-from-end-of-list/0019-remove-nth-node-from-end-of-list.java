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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 1. Create a duplicate node to handle edge cases (e.g., removing the head)
        ListNode dup = new ListNode(0);
        dup.next = head;
        
        ListNode fast = dup;
        ListNode slow = dup;
        
        // 2. Move the fast pointer 'n' steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        
        // 3. Move both pointers together until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        // 4. Skip the n-th node from the end
        slow.next = slow.next.next;
        
        // Return the actual head of the modified list
        return dup.next;
    }
}