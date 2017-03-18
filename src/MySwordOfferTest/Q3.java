package MySwordOfferTest;

import java.util.ArrayList;
import java.util.Stack;

import SwordOffer.node.ListNode;

/*
 * ����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ��
 */
public class Q3 {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	        ArrayList<Integer> arrayList=new ArrayList<>();
	        if(listNode==null) return arrayList;
	        Stack<Integer> stack=new Stack<>();
	        
	        while(listNode!=null){
	        	stack.push(listNode.val);
	        	listNode=listNode.next;
	        }
	        while(!stack.isEmpty()){
	        	arrayList.add(stack.pop());
	        }
	        return arrayList;
	}
}
