package InterviewTitle.ProcessThread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExtThreadPoolTest {
    
    static class MyTask implements Runnable {
        public String name;
        
        public MyTask(String name) {
            super();
            this.name = name;
        }
        
        @Override
        public void run() {
            try {
                Thread.sleep(500);
                System.out.println("ִ����:"+this.name);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        
        ExecutorService es = new ThreadPoolExecutor(5,5,0,TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>()){

            @Override
            protected void beforeExecute(Thread t, Runnable r) {
                System.out.println("׼��ִ��:" + ((MyTask)r).name);
            }

            @Override
            protected void afterExecute(Runnable r, Throwable t) {
                System.out.println("ִ�����:" + ((MyTask)r).name);
            }

            @Override
            protected void terminated() {
                System.out.println("ִ���˳�");
            }
            
        };
        
        
        for(int i=0;i<5;i++){
            MyTask task = new MyTask("Task-"+i);
            es.execute(task);
        }
        
        Thread.sleep(10);    // �ȴ�terminated()ִ��
        
        es.shutdown();    // ���޸÷��������̲߳��������
    }
    
}