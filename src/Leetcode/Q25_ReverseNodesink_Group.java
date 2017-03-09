package Leetcode;

import util.SingleLinkedList.ListNode;

/*
Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
k is a positive integer and is less than or equal to the length of the linked list. If the number 
of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
You may not alter the values in the nodes, only nodes itself may be changed.
Only constant memory is allowed.
For example,
Given this linked list: 1->2->3->4->5

For k = 2, you should return: 2->1->4->3->5

For k = 3, you should return: 3->2->1->4->5
 */
public class Q25_ReverseNodesink_Group {
	public ListNode reverseKGroup(ListNode head, int k) {
	       if(head==null) return head;
	        ListNode cur=head;
	        ListNode newHead=new ListNode(0);
	        newHead=head.next;
	        ListNode rear=head;
	        int count=0;
	        ListNode dummy=cur.next;
	        while((cur.next!=null)&&(count<=k-1)){//找到第k个节点
	        	cur=cur.next;
	        	count++;
	        }
	        cur=cur.next;

	        if(count==k-1){
	        	while(dummy.next!=cur){
	        		rear.next=dummy.next;
	        		dummy.next=rear;
	        		newHead.next=dummy;
	        	}
	        	rear=cur;
	        	dummy=cur.next;
	            newHead=reverseKGroup(dummy, k);
	        	count=0;//下一阶段
	        	cur=cur.next;
	        }
	        return newHead;
	}
}
