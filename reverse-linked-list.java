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
        
        // previous node
        ListNode prev = null;
        
        // setting current node to head
        ListNode current = head;
        
        // next node
        ListNode next = null;
        
        // iterating through the linked list until current is null
        while (current != null) {
            // next node is set to current node's next node
            next = current.next;
            
            // next node is set to the previous node
            current.next = prev;
            
            // previous node is set to the next node
            prev = current;
            
            // current node is set to next node
            current = next;
        }
        
        /* after the iteration, previous will store the last node before null is hit,
           meaning that it contains the head of the newly reversed linked list.*/
        head = prev;
        
        // returning head;
        return head;
    }
}
