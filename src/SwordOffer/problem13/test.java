package SwordOffer.problem13;

import static org.junit.Assert.*;

import org.junit.Test;
import SwordOffer.node.*;
public class test {

	@Test
	public void test() {
		ListNode a = new ListNode();
		ListNode b = new ListNode();
		ListNode c = new ListNode();
		a.next = b;
		b.next = c;
		a.val = 1;
		b.val = 2;
		c.val = 3;
		DeleteNodeInList dn = new DeleteNodeInList();
		ListNode head = dn.DeletedNode(a,a.next.next.next);
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}

}
