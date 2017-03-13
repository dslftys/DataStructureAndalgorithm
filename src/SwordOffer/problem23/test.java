package SwordOffer.problem23;

import static org.junit.Assert.*;

import org.junit.Test;

import SwordOffer.node.*;
public class test {

	@Test
	public void test(){
		BTreeNode root1 = new BTreeNode();
		BTreeNode node1 = new BTreeNode();
		BTreeNode node2 = new BTreeNode();
		BTreeNode node3 = new BTreeNode();
		BTreeNode node4 = new BTreeNode();
		BTreeNode node5 = new BTreeNode();
		BTreeNode node6 = new BTreeNode();
		root1.leftChild = node1;
		root1.rightChild = node2;
		node1.leftChild = node3;
		node1.rightChild = node4;
		node4.leftChild = node5;
		node4.rightChild = node6;
		root1.data = 8;
		node1.data = 6;
		node2.data = 10;
		node3.data = 5;
		node4.data = 7;
		node5.data = 9;
		node6.data = 11;
		LevelTraverse lt = new LevelTraverse();
		lt.levelTraverse(root1);
	}

}
