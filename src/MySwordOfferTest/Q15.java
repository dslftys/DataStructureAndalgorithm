package MySwordOfferTest;

import SwordOffer.node.ListNode;

/*
 * ����һ��������ת�����������������Ԫ�ء�
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
