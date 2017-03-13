package InterviewTitle.ProcessThread;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyThread2Test {

	@Test
	public void test() {
		MyThread2 thread2=new MyThread2();
		new Thread(thread2,"cat").start();
		new Thread(thread2,"dog").start();
	}

}
