package Leetcode;

public class Q27_RemoveElement {
	 public int removeElement(int[] nums, int val) {
	        int index=0;
	        for(int i=0;i<nums.length;i++){
	        	if(nums[i-1]==val){
	        		nums[index++]=nums[i];
	        	}
	        }
	        return index+1;
	 }

}
