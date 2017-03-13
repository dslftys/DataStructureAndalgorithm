package SwordOffer.problem4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReplaceBlankTest {

	@Test
	public void test() {
		ReplaceBlank rBlank=new ReplaceBlank();
		System.out.println(rBlank.ReplaceBlank("we are happy"));
		System.out.println(rBlank.ReplaceByRegex("We are happy"));
	}

}
