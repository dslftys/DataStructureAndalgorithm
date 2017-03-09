package Leetcode;

import sun.security.util.Length;

/*
Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), 
prove that at least one duplicate number must exist. Assume that there is only one duplicate number, 
find the duplicate one.
Note:
You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.
 */
public class Q287_FindtheDuplicateNumber {
	 public int findDuplicate(int[] nums) {
		    int n=nums.length;
	          for(int i=0;i<nums.length;i++) nums[i]--;
	          int slow=n-1;
	          int fast=n-1;
	          do{
	              slow=nums[slow];
	              fast=nums[nums[fast]];
	          }while(slow!=fast);
	          slow=n-1;
	          while(fast!=slow){
	              slow=nums[slow];
	              fast=nums[fast];
	          }
	          return slow+1;
	 }
}
