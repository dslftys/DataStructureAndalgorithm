package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 */
public class Q350_IntersectionTwoArrays {
	 public int[] intersect(int[] nums1, int[] nums2) {
		 HashMap<Integer, Integer > hashmap=new HashMap<>();//序号
		 ArrayList<Integer> markArrayList=new ArrayList<>();//用于标记
		 ArrayList<Integer> result=new ArrayList<>();//用于标记
		 
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
