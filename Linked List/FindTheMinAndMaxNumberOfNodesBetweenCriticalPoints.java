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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode pre = head;
        ListNode cur = head.next;
        int[] ans = {-1,-1};
        int pre_pos = -1;
        int cur_pos = -1;
        int first = -1;
        int index = 1;
        while(cur.next != null){
            if((cur.val < pre.val)&&(cur.val < cur.next.val) || (cur.val > pre.val)&&(cur.val>cur.next.val)){
                pre_pos = cur_pos;
                cur_pos = index;

                if(first == -1){
                    first = index;
                }
                if(pre_pos != -1){
                    ans[0] = ans[0]==-1?cur_pos-pre_pos:Math.min(ans[0],cur_pos-pre_pos);
                    ans[1] = index - first;
                }
            }
            index++;
            pre = cur;
            cur = cur.next;
        }
        return ans;
    }
}
