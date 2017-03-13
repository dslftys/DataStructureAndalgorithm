package SwordOffer.problem6;

import static org.junit.Assert.*;

import org.junit.Test;

import SwordOffer.node.BTreeNode;
import SwordOffer.node.*;

public class ConstructBinaryTreeTest {

	@Test
	public void test() throws Exception {
		ConstructBinaryTree cTree=new ConstructBinaryTree();
		int [] pre={1,2,4,7,3,5,6,8};
		int [] in= {4,7,2,1,5,3,8,6};
		BTreeNode rootBTreeNode=cTree.construct(pre, in);
		BtreeUtil btreeUtil=new BtreeUtil();
		System.out.println("先序遍历");
		btreeUtil.PreprintBTree(rootBTreeNode);
		System.out.println("\n中序遍历");
		btreeUtil.InprintBTree(rootBTreeNode);
		System.out.println("\n后续遍历");
		btreeUtil.LastprintBTree(rootBTreeNode);
	}
}
