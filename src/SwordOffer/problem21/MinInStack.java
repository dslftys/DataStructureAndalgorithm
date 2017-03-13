package SwordOffer.problem21;

import java.util.Stack;

import SwordOffer.node.*;
/*
 * 
 * 定义一个栈的结构，在该类型中能够得到栈的最小元素min。在该栈中调用min、push、pop的时间复杂度都是O(1)
 */
public class MinInStack {
	private Stack<Integer> dataStack=new Stack<>();
	private Stack<Integer> minStack=new Stack<>();
	
	public void push(Integer item){
		dataStack.push(item);
		if(minStack.size()==0||item<=minStack.peek()){
			minStack.push(item);
		}else{
			minStack.push(minStack.peek());
		}
	}
	public Integer pop(){
		minStack.pop();
		return dataStack.pop();
	}
	public Integer min(){
		return minStack.peek();
	}
}
