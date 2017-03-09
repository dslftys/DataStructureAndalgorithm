package InterviewTitle.ProcessThread;

public class MyThread2 implements Runnable{
	private int count=5;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+"ÔËÐÐcount"+count--);
			
		}
		try{
			Thread.sleep((int)Math.random()*10);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) {
		MyThread2 thread2=new MyThread2();
		new Thread(thread2,"cat").start();
		new Thread(thread2,"dog").start();
	}
}
