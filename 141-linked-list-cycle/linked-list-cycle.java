/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
      

        // Initialize both pointers at head
        ListNode slow = head;
        ListNode fast = head;

        // Move while fast can safely take two steps
        while (fast != null && fast.next != null) {

            // Slow moves one step
            slow = slow.next;

            // Fast moves two steps
            fast = fast.next.next;

            // If both point to the same node, cycle exists
            if (slow == fast) {
                return true;
            }
        }

        // Fast reached null, so no cycle exists
        return false;
    }
}
    