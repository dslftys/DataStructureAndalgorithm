package Leetcode;

import java.util.Stack;

import util.SingleLinkedList.ListNode;

/*
You are given two non-empty linked lists representing two non-negative integers. 
The most significant digit comes first and each of their nodes contain a single digit.
 Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Follow up:
What if you cannot modify the input lists? In other words, reversing the lists is not allowed.

Example:

Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 8 -> 0 -> 7
Subscribe to see which companies asked this question.
 */
public class Q445_AddTwoNumbersII {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode newHead=new ListNode(0);
	        ListNode pre=newHead;
	        int val=0,carryval=0,curval=0;
	        Stack<Integer>stack1=new Stack<Integer>();
	        Stack<Integer>stack2=new Stack<Integer>();
	        
	        while(l1!=null){
	        	stack1.push(l1.val);
	        	l1=l1.next;
	        }
	        while(l2!=null){
	        	stack2.push(l2.val);
	        	l2=l2.next;
	        }
	       while((!stack1.isEmpty())||(!stack2.isEmpty())){
	    	    if((!stack1.isEmpty())&&(!stack2.isEmpty()))
	    	    	val=stack1.pop()+stack2.pop();
	    	    else if((stack1.isEmpty())&&(!stack2.isEmpty()))
	    	    	val=stack2.pop();
	    	    else val=stack1.pop();
	    	    curval=(carryval+val)%10;
	        	ListNode curNode=new ListNode(curval);
	        	carryval=(carryval+val)/10;
	        	curNode.next=pre.next;
	        	pre.next=curNode;
	       }
	       if(carryval!=0){
	    	    ListNode curNode=new ListNode(carryval);
	        	curNode.next=pre.next;
	        	pre.next=curNode;
	       }
	       return newHead.next;
	 }
}
/*
  ListNode newHead=new ListNode(0);
	        ListNode pre=newHead;
	        int val,carryval=0,curval=0;
	        Stack<Integer>stack1=new Stack<Integer>();
	        Stack<Integer>stack2=new Stack<Integer>();
	        
	        while(l1!=null){
	        	stack1.push(l1.val);
	        	l1=l1.next;
	        }
	        while(l2!=null){
	        	stack2.push(l2.val);
	        	l2=l2.next;
	        }
	        int size1=stack1.size(),size2=stack2.size();
	       int size=Math.min(size1, size2);
	       while(!stack1.isEmpty()&&!stack2.isEmpty()){
	    	    val=stack1.pop()+stack2.pop();
	    	    curval=(carryval+val)%10;
	        	ListNode curNode=new ListNode(curval);
	        	carryval=curval/10;
	        	curNode.next=pre.next;
	        	pre.next=curNode;
	       }
	       if(stack1.isEmpty()&&!stack2.isEmpty()){
	    	   while(!stack2.isEmpty()){
	    		    val=stack2.pop();
	    		    curval=(carryval+val)%10;
		        	ListNode curNode=new ListNode(curval);
		        	carryval=curval/10;
		        	curNode.next=pre.next;
		        	pre.next=curNode;
	    	   }
	       }else if(!stack1.isEmpty()&&stack2.isEmpty()){
	    	   while(!stack1.isEmpty()){
	    		    val=stack1.pop();
	    		    curval=(carryval+val)%10;
		        	ListNode curNode=new ListNode(curval);
		        	carryval=curval/10;
		        	curNode.next=pre.next;
		        	pre.next=curNode;
	    	   }
	       }else if((stack1.isEmpty())&&(stack2.isEmpty())&&(carryval!=0)){
	    	    ListNode curNode=new ListNode(carryval);
	        	curNode.next=pre.next;
	        	pre.next=curNode;
	       }
	       return newHead.next;


*/