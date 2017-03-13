package SwordOffer.problem5;

import static org.junit.Assert.*;

import org.junit.Test;
import SwordOffer.node.*;

public class PrintReverseListTest {

	@Test
	public void test() {
		ListNode list=new ListNode(1);
		ListNode list2=new ListNode(2);
		ListNode list3=new ListNode(3);
		list.next=list2;
		list2.next=list3;
		list3.next=null;
		PrintReverseList printReverseList=new PrintReverseList();
		printReverseList.PrintListReversingly1(list);
		
		printReverseList.PrintListReversingly2(list);
	}

}
