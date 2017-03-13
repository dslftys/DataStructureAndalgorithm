package SwordOffer.problem14;

import static org.junit.Assert.*;

import org.junit.Test;
import SwordOffer.node.*;
public class test {

	@Test
	public void test() {
		ReorderArray rArray=new ReorderArray();
		int []a={2,4,2,1,1,4,5,6,7,8};
		rArray.ReorderOddEven(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
