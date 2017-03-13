package SwordOffer.problem5;

import java.util.Stack;
import SwordOffer.node.*;
public class PrintReverseList {
	void PrintListReversingly1(ListNode head){
		if(head==null) return;
		ListNode head2=head;//��֤ԭhead����
		Stack<ListNode> stack=new Stack<ListNode>();
		while(head2!=null){
			stack.push(head2);
			head2=head2.next;
		}
		while(!stack.isEmpty()){
			System.out.println(stack.pop().val);
		}
	}
	
	/*
	 * ����ʹ��ջ�Ķ�����ʹ�õݹ�
	 */
	void PrintListReversingly2(ListNode head){
		if(head!=null){
			if(head.next!=null){
				PrintListReversingly2(head.next);
			}
			System.out.println(head.val);
		}
		
	}
}
