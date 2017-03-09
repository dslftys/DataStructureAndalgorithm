package SwordOffer;

import util.*;
import util.tree.*;
/*
 * ǰ�������һ���ڵ���root,��������ҵ�root�����������ݾ�Ϊ�������������Ҳ��Ϊ
 * ����������
 */
/*
 * lengthΪ����ĳ���
 */
// public Node(Node<T> left,Node<T> right,T value) 
public class Interview6_RebuildTree {
	public Node ReConstructBiTree(int []preOrder,int []inOrder,int length) throws Exception{
		if(preOrder==null||inOrder==null||length<=0) return null;
		return ConstrucTreeCore(preOrder, inOrder, 0,length-1,0,length-1);
	}
	public Node ConstrucTreeCore(int [] preOrder,int []inOrder,int startPre,int endPre,int startIn,int endIn) throws Exception{
		int rootValue=preOrder[0];
		Node<Integer> root=new Node<>(null,null,rootValue);
		if(startPre==endPre){
			if(startIn==endIn) return root;
			else throw new Exception("Invalid input");
		}
		//������������ҵ����ڵ�
		int InRoot_index=startIn;
		while(InRoot_index<=endIn&&inOrder[InRoot_index]!=rootValue){
			++InRoot_index;
		}
		if(InRoot_index>endIn) throw new Exception("Invalid input2");
		
		//�ҵ��˸��ڵ�ΪInRoot_index
		int InleftLength=InRoot_index-startIn;//����������ڵ�ǰ�ĸ���
		int PreLeftLength=startPre+InRoot_index;//ǰ���������ڵ�������ǰ�ĸ���
		
		if(InleftLength>0){//����������
			root.setLeft(ConstrucTreeCore(preOrder, inOrder, startPre+1, PreLeftLength, startIn, InRoot_index));
		}
		if(InleftLength<endPre-startPre){
			root.setRight(ConstrucTreeCore(preOrder, inOrder, PreLeftLength+1, endPre, InRoot_index+1, endIn));
		}	
		return root;
	}
}
