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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        return merge(l1,l2);
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode l = new ListNode(0);
        ListNode p = l;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                p.next = l1;
                l1 = l1.next;
            }
            else{
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if(l1 != null){
            p.next = l1;
        }
        if(l2 != null){
            p.next = l2;
        }

        return l.next;
    }
}


/**
  Quick Note :
  This code splits the linkedlist into two halves and then it calls the same function and the process continues..
  the function then calls the merge function where the sorting actually takes place between the lists.
  this is a sorting technique for linkedlist.
 */
