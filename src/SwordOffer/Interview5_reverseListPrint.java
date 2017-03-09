package SwordOffer;
import java.util.Stack;

import util.*;
import util.SingleLinkedList.ListNode;
public class Interview5_reverseListPrint {
	void PrintListReversingly_Iteratively(ListNode head){
		if(head==null) return ;
		ListNode listNode=head;
		Stack<Integer> stack=new Stack<Integer>();
		while(listNode!=null){
			stack.push(listNode.val);
			listNode=listNode.next;
		}
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}
	//能用栈的就能用递归
	void PrintListReversingly_Iteratively2(ListNode head){
		if(head!=null){
			if(head.next!=null){
				PrintListReversingly_Iteratively2(head.next);
			}
			System.out.println(head.val);
		}
	}
}
