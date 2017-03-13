package SwordOffer.node;

public class BtreeUtil {
	public BtreeUtil(){

	}
	//�������
	public  BTreeNode PreprintBTree(BTreeNode root){
			if(root==null) return null;
				System.out.print(root.data+",");
			if(root.leftChild!=null)
				root.leftChild=PreprintBTree(root.leftChild);
			if(root.rightChild!=null)
				root.rightChild=PreprintBTree(root.rightChild);
			return root;
	}
	//�������
	public static BTreeNode InprintBTree(BTreeNode root){
		if(root==null) return null;
		if(root.leftChild!=null)
			root.leftChild=InprintBTree(root.leftChild);
		System.out.print(root.data+",");
		if(root.rightChild!=null)
			root.rightChild=InprintBTree(root.rightChild);
		return root;
	}
	//�������
	public static BTreeNode LastprintBTree(BTreeNode root){
		if(root==null) return null;
		if(root.leftChild!=null)
			root.leftChild=LastprintBTree(root.leftChild);
		if(root.rightChild!=null)
			root.rightChild=LastprintBTree(root.rightChild);
		System.out.print(root.data+",");
		return root;
	}
}
