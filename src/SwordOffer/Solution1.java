package SwordOffer;

import java.util.ArrayList;
import java.util.Stack;

import util.SingleLinkedList.ListNode;

public class Solution1 {
	/*
	 * 第一题
	 */
	 public static boolean Find(int target, int [][] array) {
			int i=0,j=array[0].length-1;
	        
	        while(i<array.length&&j>=0){
	            if(array[i][j]==target)
	                return true;
	            else if(array[i][j]<target)
	                i++;
	            else j--;
	        }
	        return false;
	    }
	 /*
	  * 第二题
	  * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.
	  * 则经过替换之后的字符串为We%20Are%20Happy。
	  */
	 public static String replaceSpace(StringBuffer str) {
	     
		 String st="";
		 String str2String=str.toString();
		 for(int i=0;i<str2String.length();i++){
			 if(str2String.charAt(i)!=' ') st+=str2String.charAt(i);
			 else st+="%20";
		 }
		 return st;
	  }
	 /*
	  * 第三题
	  * 输入一个链表，从尾到头打印链表每个节点的值。
	  */
	 public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	        ListNode listNode2=listNode;
	        ArrayList<Integer> arrayList=new ArrayList<Integer>();
	        if(listNode==null) return arrayList; 
	        while(listNode2.next!=null){
	        	arrayList.add(listNode2.val);
	        	listNode2=listNode2.next;
	        }
	        int length=arrayList.size(),temp;
	        for(int i=0;i<length/2;i++){
	        	temp=arrayList.get(i);
	        	arrayList.add(i, arrayList.get(length-1-i));
	        	arrayList.add(length-1-i,temp);
	        }
	        return arrayList;
	  }
	 /*
	  * 第三题
	  * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
	  * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
	  * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
	  */
	 public static void main(String[] args) {
		int [][]array={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15},{7,9,12,18}};
		System.out.println(array.length);
		System.out.println(array[0].length);
		
		StringBuffer strbuBuffer=new StringBuffer("we are happy");
		System.out.println(replaceSpace(strbuBuffer));
		ArrayList<Integer> list=new ArrayList<Integer>();
				list.add(1);
				list.add(12);
				 int length=list.size(),temp;
			        for(int i=0;i<length/2;i++){
			        	temp=list.get(i);
			        	list.set(i, list.get(length-1-i));
			        	list.set(i,temp);
			        }
		System.out.println(list);
	}
}
