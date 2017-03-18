package MySwordOfferTest;

import java.util.Stack;

/*
 * ���������������У���һ�����б�ʾջ��ѹ��˳��
 * ���жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳��
 * ����4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
 * ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
 */
public class Q21 {
	 public static  boolean IsPopOrder(int [] pushA,int [] popA) throws Exception {
		 if(pushA==null||popA==null||popA.length<=0||pushA.length<=0) return false;
		 if(pushA.length!=popA.length){
			 throw new Exception();
		 }
		 int index=0,i=1;
	     Stack<Integer> stack=new Stack<>();
	     stack.push(pushA[0]);
	     while(index<popA.length){
	    	 while(stack.peek()!=popA[index]){
	    		 if(i==pushA.length) return false;
	    		 stack.push(pushA[i++]);
	    	 }
	    	 stack.pop();
	    	 index++;
	     }
	    return stack.isEmpty();
	 }
	 public static void main(String[] args) {
		int [] A={1,2,3,4,5};
		int []B={4,5,3,2,1};
	}
}
