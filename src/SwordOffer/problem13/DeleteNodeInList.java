package SwordOffer.problem13;

import SwordOffer.node.*;

public class DeleteNodeInList {
	public ListNode DeletedNode(ListNode head,ListNode deletedNode){
		if(head==null||deletedNode==null) return head;
		if(head==deletedNode) {
			return head.next;
		}else{
			if(deletedNode.next==null){//��ɾ��β�ڵ㣬��Ҫ��ͷ��ʼ����
				ListNode d=head;
				while(d.next.next!=null) d=d.next;
				d.next=null;
			}else{
				deletedNode.val=deletedNode.next.val;
				deletedNode.next=deletedNode.next.next;
			}
		}
		return head;
	}
}
