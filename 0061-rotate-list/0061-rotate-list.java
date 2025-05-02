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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0)
        {
            return head; 
        }
        ListNode curr=head; 
        int length=1; 
        while(curr.next!=null)
        {
            curr=curr.next;
            length++; 
        }
        curr.next=head;
        int steptonewtail=length-(k%length); 
        ListNode newtail=head; 
        for(int i=1;i<steptonewtail;i++)
        {
            newtail=newtail.next; 
        }
        ListNode newhead=newtail.next; 
        newtail.next=null; 
        return newhead; 


        
    }
}