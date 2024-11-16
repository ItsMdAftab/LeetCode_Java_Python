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
        ListNode curr=head; 
        ListNode NextNode=head;
        if(head==null||head.next==null){
            return false ;
        }
        
        while(NextNode!=null&&NextNode.next!=null){
            curr=curr.next; 
            NextNode=NextNode.next.next; 
            if(curr==NextNode){
                return true; 

            }
        }
        return false;
            
        
    }
}