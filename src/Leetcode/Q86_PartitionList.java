package Leetcode;

import java.awt.HeadlessException;

import util.SingleLinkedList.ListNode;
/*
Given a linked list and a value x, partition it such that all nodes less than x come before 
nodes greater than or equal to x.
You should preserve the original relative order of the nodes in each of the two partitions.
For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.
 */

public class Q86_PartitionList {
	  public ListNode partition(ListNode head, int x) {
		  if(head==null) return head;
          ListNode newHead1=new ListNode(0);
	      ListNode newHead2=new ListNode(0);
	        
	        ListNode pre1=newHead1,pre2=newHead2;
	        while(head!=null){
	        	if(head.val<x){
	        		pre1.next=head;
	        		pre1=pre1.next;
	        	}else{
	        		pre2.next=head;
	        		pre2=pre2.next;
	        	}
	        	head=head.next;
	        }
	        pre2.next=null;
	        pre1.next=newHead2.next;
	        return newHead1.next;
	  }
}
