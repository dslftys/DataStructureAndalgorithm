package InterviewTitle.ProcessThread;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyThread1Test {

	@Test
	public void test() {
		MyThread1 myThread1=new MyThread1("cat");
		MyThread1 myThread2=new MyThread1("dog");
		myThread1.start();
		myThread2.start();
		
	}

}
