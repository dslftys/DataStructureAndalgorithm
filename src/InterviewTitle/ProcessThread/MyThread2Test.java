package InterviewTitle.ProcessThread;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyThread2Test {

	@Test
	public void test() {
		new Thread(new MyThread2("cat")).start();
		new Thread(new MyThread2("dog")).start();
		
	}

}
