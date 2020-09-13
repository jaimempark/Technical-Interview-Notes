// https://leetcode.com/problems/add-two-numbers/submissions/
/**
 * Add two numbers
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode previous = new ListNode();
	    ListNode head = previous;
        int remainder = 0;
        int sum;
        while(l1 != null || l2 != null || remainder > 0){
            //Working as expected
            sum = ((l1 == null)? 0 : l1.val) + ((l2 == null)? 0 : l2.val) + remainder;
            remainder = sum / 10;
		    l1 = (l1 != null)? l1.next : null;
		    l2 = (l2 != null)? l2.next : null;
            ListNode current = new ListNode(sum % 10);
            previous.next = current;
		    previous = current;
        }
        return head.next;
    }
}