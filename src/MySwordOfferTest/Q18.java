package MySwordOfferTest;

import java.util.Stack;

import MySwordOfferTest.node.TreeNode;
/*
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class Q18 {
	//递归
	 public void Mirror1(TreeNode root) {
	      if(root==null) return;
	      TreeNode dummy=root.left;
	      root.left=root.right;
	      root.right=dummy;
	      Mirror1(root.left);
	      Mirror1(root.right);
	 }
	 //非递归
	 public void Mirror(TreeNode root) {
	    if(root==null) return ;
	    Stack<TreeNode> stack=new Stack<>();
	    stack.push(root);
	    while(!stack.isEmpty()){
	    	TreeNode node=stack.pop();
	    	if(node.left!=null||node.right!=null){
	    		TreeNode temp=node.right;
	    		node.right=node.left;
	    		node.left=temp;
	    	}
	    	if(node.left!=null) stack.push(node.left);
	    	if(node.right!=null) stack.push(node.right);
	    }
	 }
	 
}
