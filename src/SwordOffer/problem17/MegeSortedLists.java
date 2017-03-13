package SwordOffer.problem17;

import SwordOffer.node.*;
/*
 * 输入两个递增链表，合并这两个链表使之仍然是递增的
 */
public class MegeSortedLists {
	public ListNode Merge(ListNode head1,ListNode head2){
		if(head1==null) return head2;
		else if(head2==null) return head1;
		ListNode pre=new ListNode(0);
		pre.next=head1;
		ListNode p1=pre,p2=head2,p=p2.next;

		while(p2!=null){//把2接到1上
			if(p1.next.val>=p2.val){
				p2.next=p1.next;
				p1.next=p2;
				p1=p1.next;
				p2=p;
				if(p!=null)p=p.next;
			}else{
				p1=p1.next;
			}
			if(p1.next==null){
				p1.next=p2;
				p2=null;
			}
		}
		return pre.next;
	}
	public ListNode Merge2(ListNode head1,ListNode head2){
		if(head1==null) return head2;
		else if(head2==null) return head1;
		ListNode newHead=null;
		
		if(head1.val<head2.val){
			newHead=head1;
			newHead.next=Merge2(head1.next, head2);
		}else{
			newHead=head2;
			newHead.next=Merge2(head1, head2.next);
		}
		return newHead;
	}
}
