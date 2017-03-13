package SwordOffer.problem24;

import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import sun.security.util.Length;
import SwordOffer.node.*;
/*
 * ����һ�����飬�жϸ������ǲ���ĳƽ��������ĺ����������
 * ������С�ڸ��ڵ㣬���������ڸ��ڵ�
 * 
 */
public class SquenceOfBST {
	 public boolean VerifySequenceOfBST(int [] sequence) {
		if(sequence==null||sequence.length<=0) return false;
		
		int root=sequence[sequence.length-1];//����������ڵ�Ϊ���һ��
		int i=0;
		for(;i<sequence.length;i++){//�ҵ��ҽڵ��λ��
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
