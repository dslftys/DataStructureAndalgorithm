package SwordOffer.problem17;

import static org.junit.Assert.*;

import org.junit.Test;

import SwordOffer.node.*;
public class test {

	@Test
	public void test() throws Exception {
		ListNode a=new ListNode();
		a.val=1;
		ListNode b=new ListNode();
		b.val=2;
		ListNode c=new ListNode();
		c.val=3;
		ListNode d=new ListNode();
		d.val=4;
		a.next=b;
		b.next=c;
		c.next=d;
		
		ListNode a1=new ListNode();
		a1.val=1;
		ListNode b1=new ListNode();
		b1.val=2;
		ListNode c1=new ListNode();
		c1.val=3;
		ListNode d1=new ListNode();
		d1.val=3;
		
		a1.next=b1;
		b1.next=c1;
		c1.next=d1;
		
		MegeSortedLists me=new MegeSortedLists();
		ListNode listNode=me.Merge2(a, a1);
		while(listNode!=null){
			System.out.println(listNode.val);
			listNode=listNode.next;
		}
	}

}
