package SwordOffer.problem15;

import static org.junit.Assert.*;

import org.junit.Test;

import SwordOffer.node.*;
public class test {

	@Test
	public void test() throws Exception {
		KthNodeFromEnd kt=new KthNodeFromEnd();
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
		
		System.out.println(kt.FindKthToTail(a, 2));
		
	}

}
