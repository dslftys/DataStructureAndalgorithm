package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 */
public class Q350_IntersectionTwoArrays {
	 public int[] intersect(int[] nums1, int[] nums2) {
		 HashMap<Integer, Integer > hashmap=new HashMap<>();//���
		 ArrayList<Integer> markArrayList=new ArrayList<>();//���ڱ��
		 ArrayList<Integer> result=new ArrayList<>();//���ڱ��
		 
		 for(int i=0;i<nums1.length;i++)
		 {
			 hashmap.put(i, nums1[i]);
		 }
		 for(int i=0;i<nums2.length;i++)
		 {
			 
		 }
		 
		 return null;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
