package SwordOffer.problem7;

import java.util.Stack;

import sun.org.mozilla.javascript.internal.ast.ThrowStatement;
/*
 * ����ջʵ��һ������
 */
public class QueueWithTwoStacks {
	private Stack<Integer> stack1=new Stack<Integer>();//stack1��Ϊ��װ��stack2Ϊ�˵�һ����ʱʹ�õ�
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
			throw new Exception("����Ϊ�գ�����ɾ��");
		}
		return stack2.pop();
	}
}
