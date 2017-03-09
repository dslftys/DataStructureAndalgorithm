package InterviewTitle.ProcessThread;

public class MyThread1 extends Thread{
	private int count =5;
	private String name;
	public MyThread1(String name){
		this.name=name;
	}
	
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(name+"ÔËÐÐ count="+count--);
		}
		try{
			Thread.sleep((int)Math.random()*10);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		MyThread1 myThread1=new MyThread1("cat");
		MyThread1 myThread2=new MyThread1("dog");
		myThread1.start();
		myThread2.start();
	}
	
}
