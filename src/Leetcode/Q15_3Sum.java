package Leetcode;

import java.util.*;
public class Q15_3Sum {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> resArrayList=new ArrayList<List<Integer>>();
		if(nums.length<3) return resArrayList;
		
		Arrays.sort(nums);
		HashSet<ArrayList<Integer>> hsArrayLists=new HashSet<ArrayList<Integer>>();
		for(int i=0;i<=nums.length-3;i++)
		{
			int low=i+1;//第二个
			int high=nums.length-1;//最后一个
			while(low<high)
			{
				int sum=nums[i]+nums[low]+nums[high];
				if(sum==0)
				{
					ArrayList<Integer> resArrayList2=new ArrayList<Integer>();
					resArrayList2.add(nums[i]);
					resArrayList2.add(nums[low]);
					resArrayList2.add(nums[high]);
					if(!hsArrayLists.contains(resArrayList2))
					{
						hsArrayLists.add(resArrayList2);
						resArrayList.add(resArrayList2);
					}
					high--;
					low++;
				}
				else if(sum>0) high--;
				else low++;
			}
		}
		return resArrayList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sums={0,0,0,-1,-2,1,2};
		int [] sums1={0,0,0};
		
		System.out.println(threeSum(sums1));
	}

}
