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
        return createNode(l1, l2, 0);
    }

    public ListNode createNode(ListNode l1, ListNode l2, int remains) {
        if (l1 == null && l2 == null) 
            return remains == 0 ? null : new ListNode(remains);
        
        int v1 = l1 == null ? 0 : l1.val;
        int v2 = l2 == null ? 0 : l2.val;
        int val = v1 + v2 + remains;

        boolean hasRemain = val > 9;
        ListNode node = new ListNode(hasRemain ? val % 10 : val);
        node.next = createNode(
            l1 == null ? null : l1.next,
            l2 == null ? null : l2.next,
            hasRemain ? 1 : 0
        );
        return node;
    }
}