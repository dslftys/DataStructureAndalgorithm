package MySwordOfferTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import MySwordOfferTest.node.TreeNode;

/*
 * �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
 */
public class Q22 {
	 public static  ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		 ArrayList<Integer> list=new ArrayList<>();
         if(root==null) return list;
	       Queue<TreeNode> queue=new LinkedList<TreeNode>();
	       queue.add(root);
	       TreeNode node=null;
	       while(!queue.isEmpty()){
	    	   node=queue.poll();
	    	   list.add(node.val);
	    	   if(node.left!=null) queue.add(node.left);
	    	   if(node.right!=null) queue.add(node.right);
	       }
	       return list; 
	 }
	 public static void main(String[] args) {
		
	 }
}
