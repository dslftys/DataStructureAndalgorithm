package SwordOffer.problem7;

import java.util.Stack;

import sun.org.mozilla.javascript.internal.ast.ThrowStatement;
/*
 * 两个栈实现一个队列
 */
public class QueueWithTwoStacks {
	private Stack<Integer> stack1=new Stack<Integer>();//stack1是为了装，stack2为了当一个临时使用的
	private Stack<Integer> stack2=new Stack<Integer>();
	
	public void appendTail(Integer a){
		stack1.push(a);
	}
	public Integer deleteHead() throws Exception{
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		if(stack2.isEmpty()){
			throw new Exception("队列为空，不能删除");
		}
		return stack2.pop();
	}
}
