package Leetcode;

import java.lang.reflect.Array;
import java.util.*;
public class Q16_3SumClosest {
	  public static int threeSumClosest(int[] nums, int target) {
		  if(nums.length<3) return 0;
		  ArrayList<Integer> rstArrayList=new ArrayList<Integer>();
		  HashSet<Integer> hashSet=new HashSet<Integer>();
		  Arrays.sort(nums);
		  int mindiff=Integer.MAX_VALUE;
		  for(int i=0;i<=nums.length-3;i++)
		  {
			  int low=i+1;//µÍÎ»
			  int high=nums.length-1;//¸ßÎ»
			  while(low<high)
			  {
				  int diff=nums[i]+nums[low]+nums[high]-target;
				  if(Math.abs(diff)<Math.abs(mindiff)) mindiff=diff;
				  if(diff==0) break;
				  else if(diff<0) low++;
				  else high--;
			  }
		  }
		  return mindiff+target;
	  }
	  public static void main(String[] args) {
		  int [] datas={0,2,1,-3};
		  System.out.println(threeSumClosest(datas,1));
	}
}
