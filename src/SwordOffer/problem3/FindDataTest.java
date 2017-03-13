package SwordOffer.problem3;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindDataTest {

	@Test
	public void test() {
		FindInPartiallySortedMatrix finddata=new FindInPartiallySortedMatrix();
		int [][]a={{2,3,4,8},{3,5,6,9},{6,9,10,12}};
		System.out.println(finddata.Find(a, 110));
	}

}
