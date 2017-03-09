package Leetcode;

import java.util.*;
//Time out
public class Q18_4Sum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i=0;i<=nums.length-4;i++)//第一个数
		{
			if(i!=0&&nums[i]==nums[i-1]) continue;
			for(int j=i+1;j<=nums.length-2;j++)//第二个数据
			{
				if(j!=i+1&&nums[j]==nums[j-1]) continue;
				int low=j+1;
				int high=nums.length-1;
				while(low<high)
				{
					int diff=nums[i]+nums[j]+nums[low]+nums[high]-target;
					if(diff<0) low++;
					else if(diff>0) high--;
					else 
					{
						ArrayList<Integer> arrayList=new ArrayList<>();
						arrayList.add(nums[i]);
						arrayList.add(nums[j]);
						arrayList.add(nums[low]);
						arrayList.add(nums[high]);
						list.add(arrayList);
						low++;
						high--;
					}
				}
			}
		}
		return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] S={-3,-2,-1,0,0,1,2,3};
		System.out.println(fourSum(S,0));
		
		
	}

}
