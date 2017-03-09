package SwordOffer;

import java.util.ArrayList;
import java.util.Stack;

import util.SingleLinkedList.ListNode;

public class Solution1 {
	/*
	 * ��һ��
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
	  * �ڶ���
	  * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.
	  * �򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
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
	  * ������
	  * ����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ��
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
	  * ������
	  * ����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
	  * ���������ǰ���������������Ľ���ж������ظ������֡�
	  * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
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
