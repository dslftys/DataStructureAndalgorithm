package 算法经典问题.八皇后问题;

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
