class Solution {
    public ListNode doubleIt(ListNode head) {
        if (head == null) {
            return null;
        }

        // Reverse the linked list
        ListNode reversed = reverseLinkedList(head);

        ListNode curr = reversed;
        ListNode prev = null;
        int carry = 0;
        
        while (curr != null) {
            int newVal = curr.val * 2 + carry;
            carry = newVal / 10;
            curr.val = newVal % 10;
            prev = curr;
            curr = curr.next;
        }
        
        // If there's still a carry after the loop, add a new node
        if (carry > 0) {
            prev.next = new ListNode(carry);
        }
        
        // Reverse the linked list again to get the original order
        return reverseLinkedList(reversed);
    }

    // Helper function to reverse a linked list
    private ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
