package SwordOffer.problem16;

import SwordOffer.node.*;
/*
 * ��ת��������������ͷ�ڵ�
 */
public class ReverseList {
	public ListNode ReverseListt(ListNode head) throws Exception{
		if(head==null) return head;
		ListNode newHead=new ListNode(0);
		ListNode p=head.next;
		newHead.next=head;
		while(p!=null){
			head.next=p.next;
			p.next=newHead.next;
			newHead.next=p;
			p=head.next;
		}
		return newHead.next;
	}
}
