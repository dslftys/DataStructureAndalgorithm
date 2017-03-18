package MySwordOfferTest;

import java.util.Stack;

/*
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class Q20 {
	Stack<Integer> stack1=new Stack<>();
	Stack<Integer> stack2=new Stack<>();//装最小值
	
    public void push(int node) {
    	stack1.push(node);
        if(stack2.isEmpty()||stack2.peek()>=node) stack2.push(node);
        if(stack2.peek()<node) stack2.push(stack2.peek());
    }
    
    public void pop() {
        stack1.pop();
        stack2.pop();
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int min() {
        return stack2.peek();
    }
}
