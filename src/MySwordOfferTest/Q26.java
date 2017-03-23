package MySwordOfferTest;

import MySwordOfferTest.node.TreeNode;

/*
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Q26 {
	public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null) return null;
        if(pRootOfTree.left==null&& pRootOfTree.right==null) return pRootOfTree;
        TreeNode leftNode=Convert(pRootOfTree.left);
        TreeNode pNode=leftNode;
        while(pNode!=null&&pNode.right!=null){
        	pNode=pNode.right;
        }
        if(leftNode!=null){
        	pNode.right=pRootOfTree;
        	pRootOfTree.left=pNode;
        }
        TreeNode rightNode=Convert(pRootOfTree.right);
        if(rightNode!=null){
        	pRootOfTree.right=rightNode;
        	rightNode.left=pRootOfTree;
        }
		return leftNode!=null?leftNode:pRootOfTree;
    }
}
