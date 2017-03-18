package MySwordOfferTest;

import java.util.Stack;

/*
 * 输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
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
