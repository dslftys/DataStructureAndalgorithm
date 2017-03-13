package SwordOffer.problem22;

import java.util.Stack;

import SwordOffer.node.*;
/*
 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��վ��ѹ��˳��
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
