package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class Q349_IntersectionTwoArrays {
	
	public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hash1=new HashSet<>();
        Set<Integer> Intersection=new HashSet<>();
        
        for(int i=0;i<nums1.length;i++)
        {
        	hash1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
        	if(hash1.contains(nums2[i])) 
        		Intersection.add(nums2[i]);
        }
        
        int [] num=new int[Intersection.size()];
        int i=0;
        for(Integer data:Intersection)
        {
        	num[i++]=data;
        }
        
        return num;     
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
