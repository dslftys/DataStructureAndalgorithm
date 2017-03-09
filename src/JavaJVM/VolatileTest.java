package JavaJVM;

import org.omg.CORBA.PUBLIC_MEMBER;

/*
 * Volatile类似与synchronized
 * 
 */
public class VolatileTest {

	public static volatile int race=0;
	public static void increase(){
		race++;
	}
	
	private static final int THREADS_COUNT=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread[] threads=new Thread[THREADS_COUNT];
		for(int i=0;i<THREADS_COUNT;i++){
			threads[i]=new Thread(new Runnable() {
				
				@Override
					public void run(){
						for(int i=0;i<10000;i++){
							increase();
						}
					}
			});
		}
		//等待所有累加的线程都结束
		while(Thread.activeCount()>1)
			Thread.yield();
		System.out.println(race);
	}

}
