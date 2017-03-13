package SwordOffer.problem22;

import java.util.Stack;

import SwordOffer.node.*;
/*
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该站的压入顺序
 */
public class StackPushPopOrder {
	public boolean IsPopOrder(int [] pushA,int []popA){
		if(pushA==null||popA==null||pushA.length<=0||popA.length<=0||pushA.length!=popA.length){
			return false;
		}
		Stack<Integer> stack=new Stack<>();
		int popIndex=0;
		for(int i=0;i<pushA.length;i++){
			stack.push(pushA[i]);
			while(!stack.isEmpty()&&stack.peek()==popA[popIndex]){
				stack.pop();
				popIndex++;
			}
		}
		return stack.isEmpty();
	}
}
