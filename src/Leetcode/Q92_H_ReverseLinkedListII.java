package Leetcode;

import util.SingleLinkedList.ListNode;

/*
Reverse a linked list from position m to n. Do it in-place and in one-pass.
For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,
return 1->4->3->2->5->NULL.
Note:
Given m, n satisfy the following condition:
1 ≤ m ≤ n ≤ length of list.
 * 
 */
public class Q92_H_ReverseLinkedListII {
	 public ListNode reverseBetween(ListNode head, int m, int n) {
		 if(head==null||head.next==null) return head;
		 ListNode newHead=new ListNode(0);
		 newHead.next=head;
		 ListNode pre=head;
		 for(int i=1;i<=m-1;i++) pre=pre.next; //指到要移动位置的前面一个
		 
		 ListNode rear=pre.next;
		 ListNode start=rear.next;
		
		 for(int i=0;i<m-n;i++){
			 start.next=pre.next;
			 pre.next=start;
			 start=rear.next;
		 }
		 return newHead.next;
	 }
	 
	 public static void main(String[] args) {
		 int i=1;
		System.out.println(--i);
	}
}
