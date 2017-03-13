package SwordOffer.problem24;

import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import sun.security.util.Length;
import SwordOffer.node.*;
/*
 * 输入一个数组，判断该数组是不是某平衡二叉树的后续遍历结果
 * 左子树小于根节点，右子树大于根节点
 * 
 */
public class SquenceOfBST {
	 public boolean VerifySequenceOfBST(int [] sequence) {
		if(sequence==null||sequence.length<=0) return false;
		
		int root=sequence[sequence.length-1];//后序遍历根节点为最后一个
		int i=0;
		for(;i<sequence.length;i++){//找到右节点的位置
			if(sequence[i]>root){
				break;
			}
		}
		int j=0;
		for(;j<sequence.length-1;j++){
			if(sequence[j]<root) return false;
		}
		
		boolean left=true;
		if(i>0){
			left=VerifySequenceOfBST(Arrays.copyOfRange(sequence, 0, i));
		}
		boolean right=true;
		if(i<sequence.length-1){
			right=VerifySequenceOfBST(Arrays.copyOfRange(sequence, i,sequence.length-1));
		}
		return left&&right;
	 }
}
