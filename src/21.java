/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null) return l2;
        if (l2==null) return l1;
        ListNode fakehead = new ListNode(0);
        ListNode cur = fakehead;
        while(l1!=null&&l2!=null){
            if(l1.val>l2.val){
                cur.next = l2;
                l2 = l2.next;
            }
            else{
                cur.next = l1;
                l1 = l1.next;
            }
            cur = cur.next;
        }
        cur.next=l1==null?l2:l1;
        return fakehead.next;        
    }
}