package SwordOffer.problem6;
import java.util.Arrays;

import SwordOffer.node.*;
/*
 * �ؽ�������
 * ��Ŀĳ��������ǰ���������������Ľ�������ؽ����ö����������������ǰ��������������
 * �Ľ���ж������ظ������֡�
 */
public class ConstructBinaryTree {
	public BTreeNode construct(int [] preorder,int[] inorder) throws Exception{
		if(preorder==null||inorder==null||preorder.length<=0||inorder.length<=0)
			return null;
		if(preorder.length!=inorder.length){
			throw new Exception("the preorder length is not equal to inorder length");
		}
		boolean flag=false;
		BTreeNode root=new BTreeNode();
		for(int i=0;i<preorder.length;i++){
			if(inorder[i]==preorder[0]){
				flag=true;//�ڵ��ҵ�
				root.data=inorder[i];
				root.leftChild=construct(Arrays.copyOfRange(preorder, 1,i+1), Arrays.copyOfRange(inorder,0,i));
				root.rightChild=construct(Arrays.copyOfRange(preorder, i+1,preorder.length), Arrays.copyOfRange(inorder,i+1,inorder.length));
			}
		}
		if(!flag){
			throw new Exception("no root node ,error input");
		}
		return root;
	}
}
