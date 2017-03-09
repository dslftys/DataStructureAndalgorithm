package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Given a sorted linked list, delete all duplicates such that each element appear only once.
For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.

Subscribe to see which companies asked this question.
 */
public class Q83_RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		  List<Integer>   list=new ArrayList<Integer>();
	      ListNode newHead=new ListNode(0);
	      newHead.next=head;
	      ListNode dummy=head,pre=newHead;
	      while(dummy!=null){
	    	  if(!list.contains(dummy.val)){
	    	      list.add(dummy.val);
	    	      pre=pre.next;
	    	      dummy=dummy.next;
	    	  }
	    	  else{
	    		  pre.next=dummy.next;
	    		  dummy=pre.next;
	    	  }
	    
	      }
	      return newHead.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
