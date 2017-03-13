package SwordOffer.problem19;

import SwordOffer.node.*;
/*
 * 输入一个二叉树，让函数输出她的镜像
 * 
 * 进行先序遍历树的节点，判断他们有无两个子节点，当交换完所有左右节点后，就得到了树的镜像
 */
public class MirrorOfBinaryTree {
	public void MirrorRecursively(BTreeNode root){
		if(root==null) return ;
		if(root.leftChild==null&&root.rightChild==null)
			return ;
		if(root.leftChild!=null)
			MirrorRecursively(root.leftChild);
		if(root.rightChild!=null)
			MirrorRecursively(root.rightChild);
		
	}
}
