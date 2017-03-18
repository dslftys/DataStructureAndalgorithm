package MySwordOfferTest;

import SwordOffer.node.ListNode;

/*
 * 输入一个链表，反转链表后，输出链表的所有元素。
 */
public class Q15 {
	 public ListNode ReverseList(ListNode head) {
		 if(head==null) return null;
		 ListNode newHead=new ListNode(0);
		 ListNode dummy=head.next;
		 newHead.next=head;
		 while(dummy!=null){
			 head.next=dummy.next;
			 dummy.next=newHead.next;
			 newHead.next=dummy;
			 dummy=head.next;
		 }
		 return newHead.next;
	 }
}
