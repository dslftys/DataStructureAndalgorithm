package SwordOffer.problem18;

import SwordOffer.node.*;
/*
 * 输入两个二叉树A和B，判断B是不是A的子结构
 */
public class SubstructureInTree {
	public boolean HasSubtree(BTreeNode root1,BTreeNode root2){
		boolean flag=false;
		if(root1!=null&&root2!=null){
			if(root1.data==root2.data){
				flag=isSubTree(root1, root2);
			}
			if(!flag) return HasSubtree(root1.leftChild, root2)||HasSubtree(root1.rightChild, root2);
		}
		return flag;
		
	}
	private  boolean isSubTree(BTreeNode root1,BTreeNode root2){
		if(root2==null) return true;
		if(root1==null) return false;
		if(root1.data!=root2.data) return false;
		else {
			return isSubTree(root1.leftChild, root2.leftChild)&&isSubTree(root1.rightChild, root2.rightChild);
		}
		
	}
	
}
