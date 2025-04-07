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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return createNewNode(l1, l2, 0);
    }

    // public ListNode createNewNode(ListNode l1, ListNode l2, int remains) {
    // ListNode node = new ListNode();
    // if (l1 == null && l2 == null) return null;
    
    // l1.val + l2.val + remains;
    // l1.val + remains;
    // l2.val + remains;
    // }

    public ListNode createNewNode(ListNode l1, ListNode l2, int remains) {
        if (l1 == null && l2 == null && remains == 0) return null;
        if (l1 == null && l2 == null && remains != 0) return new ListNode(remains);
        
        ListNode result = new ListNode();
        if (l1 == null) {
            
            int val = l2.val + remains;
            if (val > 9) {
                result.val = val % 10;
                result.next = createNewNode(null, l2.next, 1);
            } else {
                result.val = val;
                result.next = createNewNode(null, l2.next, 0);
            }
        } else if (l2 == null) {
            
            int val = l1.val + remains;
            if (val > 9) {
                result.val = val % 10;
                result.next = createNewNode(l1.next, null, 1);
            } else {
                result.val = val;
                result.next = createNewNode(l1.next, null, 0);
            }
        } else {
            int val = l1.val + l2.val + remains;
            if (val > 9) {
                result.val = val % 10;
                result.next = createNewNode(l1.next, l2.next, 1);
            } else {
                result.val = val;
                result.next = createNewNode(l1.next, l2.next, 0);
            }
        }
        return result;
    }
}