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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head; 
        }
        ListNode dummy =new ListNode(0,head);
        ListNode curr=dummy; 
        while(curr.next!=null){
            if(curr.next.val==val){
                curr.next=curr.next.next; 
            }
            else{
            curr=curr.next;
            } 
            
        }
        return dummy.next;
    }
        
    }
