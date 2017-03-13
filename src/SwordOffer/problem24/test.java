package SwordOffer.problem24;

import static org.junit.Assert.*;

import org.junit.Test;

import SwordOffer.node.*;
public class test {

	@Test
	public void test(){
		int[] a = {1,2,3,5,6,4};
		int[] b = {7,2,3,4};
		SquenceOfBST vsob = new SquenceOfBST();
		System.out.println(vsob.VerifySequenceOfBST(a)+","+vsob.VerifySequenceOfBST(b));
	}

}
