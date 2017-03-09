package Leetcode;
/*
Rotate an array of n elements to the right by k steps.
For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
[show hint]
Related problem: Reverse Words in a String II
Credits:
Special thanks to @Freezen for adding this problem and creating all test cases.
Subscribe to see which companies asked this question.
 */
public class Q189_RotateArray {
	public static void rotate1(int[] nums, int k) {
		k%=nums.length;
		if(k==0) return;
		reverse(nums, 0, nums.length-1);
		reverse(nums, 0, k-1);
		reverse(nums, k, nums.length-1);
    }
	public static void reverse(int [] nums,int start,int end){
		while(start<end){
			int temp=nums[start];
			nums[start] =nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data={1,2,3,4,5,6,7};
		rotate1(data, 3);
		System.out.println(data.toString());
	}

}
