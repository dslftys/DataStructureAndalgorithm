package �㷨��������.�˻ʺ�����;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueenTest {

	@Test
	public void test() {
		NQueens nQueens=new NQueens(8);
		nQueens.init();
		nQueens.Queen();
	}

}
