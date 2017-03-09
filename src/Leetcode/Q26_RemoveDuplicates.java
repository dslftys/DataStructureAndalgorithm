package Leetcode;
import java.util.*;
/*
 * 还要保证nums 前两个元素
 */
public class Q26_RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
    	int length=nums.length;
    	if(nums.length<=1) return nums.length;
    	ArrayList<Integer> list=new ArrayList<Integer>();
    	for(int i=0;i<length;i++){
    		if(!list.contains(nums[i])) list.add(nums[i]);
    	}
    	for(int i=0;i<list.size()-1;i++){
    		nums[i]=list.get(i);
    	}
    	
    	return list.size();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={1,2,3,4,3,3};
		System.out.println(removeDuplicates(nums));
	}

}
