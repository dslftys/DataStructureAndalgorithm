package MySwordOfferTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import MySwordOfferTest.node.TreeNode;

/*
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
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
