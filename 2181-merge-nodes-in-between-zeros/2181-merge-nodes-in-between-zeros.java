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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr=head; 
        int sum=0; 
        ListNode newhead=new ListNode(0);
        ListNode new1=newhead; 
        while(curr!=null)
        {
            if(curr.val==0&&sum!=0)
            {
                new1.next=new ListNode(sum); 
                new1=new1.next; 
                sum=0; 
            }
            sum+=curr.val ; 
            curr=curr.next; 
            
        }
        return newhead.next; 
    }
}