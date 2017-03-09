package StructureAndAlgor.chapter4;

import java.lang.Exception;
class TreeNode
{
	Object  element;
	TreeNode firstChild;
	TreeNode nextSibling;
}
public class BinarySearchTree<AnyType extends Comparable<? super AnyType>> {
	private static class BinaryNode<AnyType>
	{
		AnyType element;
		BinaryNode<AnyType> left;
		BinaryNode<AnyType> right;
		
		public BinaryNode(AnyType theElement) {
			// TODO Auto-generated constructor stub
			this(theElement,null,null);
		}
		public BinaryNode(AnyType theElement,BinaryNode<AnyType>lt,BinaryNode<AnyType> rt) {
			// TODO Auto-generated constructor stub
			element=theElement;
			left=lt;
			right=rt;
		}
	}
	private BinaryNode<AnyType> root;
	private BinarySearchTree()
	{
		root=null;
	}
	public void makeEmpty()
	{
		root=null;
	}
	public boolean isEmpty()
	{
		return root==null;
	}
	public boolean contains(AnyType x)
	{
		return contains(x,root);
	}
	
	public AnyType findMin() throws Exception
	{
		if(isEmpty()) throw new Exception();
		return findMin(root).element;
	}
	
	public AnyType findMax() throws Exception
	{
		if(isEmpty()) throw new Exception();
		return findMax(root).element;
	}
	
	public void insert(AnyType x)
	{
		root=insert(x, root);
	}
	public void remove(AnyType x)
	{
		root=remove(x, root);
	}
	private boolean contains(AnyType x,BinaryNode<AnyType> t)
	{
		if(t==null) return false;
		int compareResult=x.compareTo(t.element);
		if(compareResult<0) return contains(x,t.left);
		else if(compareResult>0) return contains(x,t.right);
		else return true;
	}
	/*
	 * 采用递归的方式进行寻找最大和最小值
	 */
	private BinaryNode<AnyType> findMin(BinaryNode<AnyType> t)
	{
		if(t==null) return null;
		else if(t.left==null) return t;
		return findMin(t.left);
	}
	private BinaryNode<AnyType> findMax(BinaryNode<AnyType> t)
	{
		if(t==null) return null;
			while(t.right!=null)
				t=t.right;
		return t;
	}
	
	/*
	 * insert方法
	 * 采用递归的方式，左侧为小右侧为大，一次比较才插入
	 */
	private BinaryNode<AnyType> insert(AnyType x,BinaryNode<AnyType> t)
	{
		if(t==null) 
			return new BinaryNode<AnyType>(x,null,null);
		int compareResult=x.compareTo(t.element);
		if(compareResult<0) t.left=insert(x, t.left);
		else if(compareResult>0) t.right=insert(x, t.right);
		else ;//do nothing
		return t;
	}
	
	private BinaryNode<AnyType> remove (AnyType x,BinaryNode<AnyType> t)
	{
		if(t==null) return null;
		int compareResult=x.compareTo(t.element);
		if(compareResult<0) t.left=remove(x, t.left);
		else if(compareResult>0) t.right=remove(x, t.right);
		else if(t.left!=null&&t.right!=null)
		{
			t.element=findMin(t.right).element;
			t.right=remove(t.element,t.right);
		}
		else 
			t=(t.left!=null)?t.left:t.right;
		return t;
	}
	
	//print the tree
	public void printTree()
	{
		if(isEmpty()) System.out.println("Empty tree");
		else printTree(root);
	}
	private void printTree(BinaryNode<AnyType> t)
	{
		if(t!=null){
			printTree(t.left);
			System.out.println(t.element);
			printTree(t.right);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
