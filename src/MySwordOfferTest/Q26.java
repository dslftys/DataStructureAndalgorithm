package MySwordOfferTest;

import MySwordOfferTest.node.TreeNode;

/*
 * ����һ�ö��������������ö���������ת����һ�������˫������
 * Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
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
