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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> stack=new Stack<>(); 
        ListNode curr=head; 
        while(curr!=null)
        {
            while(!stack.isEmpty()&&stack.peek()<curr.val)
            {
                stack.pop(); 
            }
            stack.push(curr.val); 
            curr=curr.next;
        }
        ListNode newHead=null; 
        while(!stack.isEmpty())
        {
            ListNode newNode=new ListNode(stack.pop()); 
            newNode.next=newHead;
            newHead=newNode; 
        }
        return newHead; 

        }
        
    }
