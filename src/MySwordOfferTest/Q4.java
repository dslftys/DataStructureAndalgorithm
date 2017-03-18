package MySwordOfferTest;
import java.util.Arrays;

import MySwordOfferTest.node.*;
/*
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
 */
public class Q4 {
	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) throws Exception {
		if(pre.length!=in.length) {
			throw new Exception();
		}
		if(pre==null||in==null||pre.length==0) return null;
		TreeNode root=new TreeNode(pre[0]);
		int rootVal=pre[0];
		int i=0;
		while(i<pre.length){
			if(in[i]==rootVal) break;
			i++;
		}
		if(i>=1)//��ʾ������
			root.left=reConstructBinaryTree(Arrays.copyOfRange(pre, 1,i+1),Arrays.copyOfRange(in, 0, i));
		if(i<pre.length-1)//��ʾ���Һ���
			root.right=reConstructBinaryTree(Arrays.copyOfRange(pre, i+1,pre.length),Arrays.copyOfRange(in,i+1, in.length));
		return root;
	}
	public static void main(String[] args) throws Exception {
		int []pre={1,2,4,7,3,5,6,8};
		int []in={4,7,2,1,5,3,8,6};
		//reConstructBinaryTree(pre,in);
		int []a=Arrays.copyOfRange(pre,1, 3);
	}
}
