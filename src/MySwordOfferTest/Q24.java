package MySwordOfferTest;

import java.util.ArrayList;
import java.util.Stack;

import MySwordOfferTest.node.TreeNode;

/*
 * ����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
 * ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 */
public class Q24 {
	 private ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
     private ArrayList<Integer> list = new ArrayList<Integer>();
	 public  ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		if(root==null) return listAll;
		list.add(root.val);
		target-=root.val;
		if(target==0&&root.left==null&&root.right==null){
			listAll.add(new ArrayList<Integer>(list));
		}
		FindPath(root.left, target);
		FindPath(root.right, target);
		list.remove(list.size()-1);
		return listAll;
	}
	 public static void main(String[] args) {
		 TreeNode node1=new TreeNode(10);
		 TreeNode node2=new TreeNode(5);
		 TreeNode node3=new TreeNode(12);
		 TreeNode node4=new TreeNode(4);
		 TreeNode node5=new TreeNode(7);
		// TreeNode node6=new TreeNode(7);
		 //TreeNode node7=new TreeNode(8);
		 node1.left=node2;
		 node1.right=node3;
		 node2.left=node4;
		 node2.right=node5;
		 //node3.left=node6;
		 //node3.right=node7;
		 Q24 qq=new Q24();
		 for(int i=10;i<=13;i++)
			 qq.FindPath(node1, i);
		 
	}
}
/*
 ArrayList<ArrayList<Integer>> lList=new ArrayList<ArrayList<Integer>>();
		 if(root==null) return lList;
		 Stack<TreeNode> stack=new Stack<>();
		 ArrayList<Integer> list=new ArrayList<>();
		 TreeNode node=null;
		 int temp=target;
		 stack.add(root);
		 int flag=0;
		 while(!stack.isEmpty()){
			 node=stack.pop();
			 list.add(node.val);
			 temp=temp-node.val;
			 if(temp==0) {//�˻�һ��������һ��
				 lList.add(list);
				 temp=temp+list.get(list.size()-1);
				 list.remove(list.size()-1);
			 }else if(temp<0){//�˺�һ��
				 flag++;
				 if(flag==2){
					 temp=temp+list.get(list.size()-1)+list.get(list.size()-2);
					 list.remove(list.size()-1);
					 list.remove(list.size()-1);
					 
				 }else{
					 temp=temp+list.get(list.size()-1);
					 list.remove(list.size()-1);
				 }
			 }
			 if(node.left!=null) stack.push(node.left);
			 if(node.right!=null) stack.push(node.right);
		 }
		 return lList;    
*/