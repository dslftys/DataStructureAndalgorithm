package SwordOffer.problem15;

import SwordOffer.node.*;
/*
 * 输出链表倒数第k个节点
 */
public class KthNodeFromEnd {
	public int FindKthToTail(ListNode head,int k) throws Exception{
		ListNode fast=head,slow=head;
		if(head==null||k<0){
			throw new Exception("error");
		}
		for(int i=0;i<k-1;i++){
			fast=fast.next;
		}
		while(fast.next!=null){
			slow=slow.next;
			fast=fast.next;
		}
		return slow.val;
	}
}
