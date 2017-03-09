package Leetcode;
/*
 
Given a sorted linked list, delete all 
nodes that have duplicate numbers, leaving only distinct numbers from the original list.
For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.
 */
public class Q82_RemoveDuplicatesfromSortedListII {
	public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode FakeHead=new ListNode(0);
        FakeHead.next=head;
        ListNode pre=FakeHead;
        ListNode cur=head;
        while(cur!=null){
            while(cur.next!=null&&cur.val==cur.next.val){
                cur=cur.next;
            }
            if(pre.next==cur){
                pre=pre.next;
            }
            else{
                pre.next=cur.next;
            }
            cur=cur.next;
        }
        return FakeHead.next;
    }
}
/***************time out

public ListNode deleteDuplicates(ListNode head) {
         if(head!=null){
        	 ListNode newNode=new ListNode(0);
        	 newNode.next=head;
        	 ListNode cur=head.next,curhead=head;
        	 int flag=0;
        	 while(cur!=null){
        		 if(cur.next!=null)
        		 {
        			 if(cur.val==cur.next.val){
            			 flag=1;
            			 cur.next=cur.next.next;
            		 }else if(cur.val!=cur.next.val&&flag==1){
    					 curhead.next=cur.next;
    					 cur=curhead.next;
    				}else{
    					curhead=curhead.next;
    					cur=cur.next;
    				}
        		 }else{
        			 if(flag==1){
        				 curhead.next=cur.next;
        				 cur=cur.next;
        			 }
        			 return head;
        		 }
        		 
        	 }
         }
         return head;
    }
*/