package Leetcode;

import java.util.*;
public class Q18_1_4Sum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> rstList=new ArrayList<List<Integer>>();
    	if(nums.length<4)  return rstList;
    	for(int i=0;i<nums.length-3;i++)
    	{
    		if(i!=0&&nums[i]==nums[i-1])
    			continue;
    		
    		for(int j=i+1;j<nums.length-2;j++)
    		{
    			if(j!=i+1&&nums[j]==nums[j-1])
    				continue;
    			int left=j+1;
    			int right=nums.length-1;
    			while(left<right)
    			{
    				int sum=nums[i]+nums[j]+nums[left]+nums[right];
    				if(sum<target);
    			}
    			
    		}
    	}
    	return null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] S={-3,-2,-1,0,0,1,2,3};
		System.out.println(fourSum(S,0));
		
		
	}

}
