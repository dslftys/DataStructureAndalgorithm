package SwordOffer.problem23;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import SwordOffer.node.*;
/*
 * ���ϵ��´�ӡ������ÿһ���ڵ㣬ͬһ��Ľڵ㰴�մ����ҵ�˳���ӡ��
 * 
 */
public class LevelTraverse {
	 public void levelTraverse(BTreeNode root) {
		 if(root==null) return ;
		 Queue<BTreeNode> queue=new LinkedList<>(); 
		 queue.offer(root);
		 while(!queue.isEmpty()){
			    BTreeNode node = queue.poll();
	            System.out.println(node.data);
	            if (null != node.leftChild) {
	                queue.offer(node.leftChild);
	            }
	            if (null != node.rightChild) {
	                queue.offer(node.rightChild);
	            }
		 }
	 }
}
