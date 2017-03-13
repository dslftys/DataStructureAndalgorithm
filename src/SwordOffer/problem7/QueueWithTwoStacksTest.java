package SwordOffer.problem7;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueWithTwoStacksTest {

	@Test
	public void test() throws Exception {
		QueueWithTwoStacks queueTest=new QueueWithTwoStacks();
		queueTest.appendTail(1);
		queueTest.appendTail(2);
		queueTest.appendTail(3);
		queueTest.appendTail(4);
		
		System.out.println(queueTest.deleteHead());
		System.out.println(queueTest.deleteHead());
		queueTest.appendTail(4);
		queueTest.appendTail(5);
		queueTest.appendTail(6);
		System.out.println(queueTest.deleteHead());
		System.out.println(queueTest.deleteHead());
		
		
	}

}
