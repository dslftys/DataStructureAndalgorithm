package Leetcode;
/*
 * 
Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
Note: Do not modify the linked list.
 */
public class Q142_LinkedListCycleII {
	 public ListNode detectCycle(ListNode head) {
		 ListNode fast=head,slow=head;
		 while(fast!=null&&fast.next!=null){
			 fast=fast.next.next;
			 slow=slow.next;
			 if(slow==fast){
				 while(head!=slow){
					 head=head.next;
					 slow=slow.next;
				 }
				 return slow;
			 }
		 }
		 return null;
	 }
}
