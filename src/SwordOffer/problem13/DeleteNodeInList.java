package SwordOffer.problem13;

import SwordOffer.node.*;

public class DeleteNodeInList {
	public ListNode DeletedNode(ListNode head,ListNode deletedNode){
		if(head==null||deletedNode==null) return head;
		if(head==deletedNode) {
			return head.next;
		}else{
			if(deletedNode.next==null){//当删除尾节点，需要从头开始遍历
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
