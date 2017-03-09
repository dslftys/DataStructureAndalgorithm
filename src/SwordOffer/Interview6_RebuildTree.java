package SwordOffer;

import util.*;
import util.tree.*;
/*
 * 前序遍历第一个节点是root,中序遍历找到root，其左侧的数据就为树的左子树，右侧的为
 * 树的右子树
 */
/*
 * length为数组的长度
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
		//在中序遍历中找到根节点
		int InRoot_index=startIn;
		while(InRoot_index<=endIn&&inOrder[InRoot_index]!=rootValue){
			++InRoot_index;
		}
		if(InRoot_index>endIn) throw new Exception("Invalid input2");
		
		//找到了根节点为InRoot_index
		int InleftLength=InRoot_index-startIn;//中序遍历根节点前的个数
		int PreLeftLength=startPre+InRoot_index;//前序遍历到达节点右子树前的个数
		
		if(InleftLength>0){//构建左子树
			root.setLeft(ConstrucTreeCore(preOrder, inOrder, startPre+1, PreLeftLength, startIn, InRoot_index));
		}
		if(InleftLength<endPre-startPre){
			root.setRight(ConstrucTreeCore(preOrder, inOrder, PreLeftLength+1, endPre, InRoot_index+1, endIn));
		}	
		return root;
	}
}
