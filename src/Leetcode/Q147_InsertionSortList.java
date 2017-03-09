package Leetcode;

import util.SingleLinkedList.ListNode;

/*
 * Sort a linked list using insertion sort.
 */
public class Q147_InsertionSortList {
	 public ListNode insertionSortList(ListNode head) {
		    if(head==null) return head;
	        ListNode newhead=new ListNode(0);
		    ListNode pre=newhead;
	        ListNode cur=head;
	        ListNode next=null;
	        
	        while(cur.next!=null){
	        	next=cur.next;
	        	while(pre.next!=null&&pre.next.val<cur.val)
	        		pre=pre.next;//找到合适的位置
	        	cur.next=pre.next;
	        	pre.next=cur;
	        	cur=next;
	        	pre=newhead;
	        }
	        return newhead.next;
	 }
}
