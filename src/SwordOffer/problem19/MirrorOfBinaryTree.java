package SwordOffer.problem19;

import SwordOffer.node.*;
/*
 * ����һ�����������ú���������ľ���
 * 
 * ��������������Ľڵ㣬�ж��������������ӽڵ㣬���������������ҽڵ�󣬾͵õ������ľ���
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
