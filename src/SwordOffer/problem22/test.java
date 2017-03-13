package SwordOffer.problem22;

import static org.junit.Assert.*;

import org.junit.Test;

import SwordOffer.node.*;
public class test {

	@Test
	public void test(){
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 4, 3, 5, 1, 2};
		StackPushPopOrder test = new StackPushPopOrder();
		System.out.println(test.IsPopOrder(array1, array2));
	}

}
