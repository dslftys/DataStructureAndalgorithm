package Leetcode;
/*
 * 
Given an array of integers that is already sorted in ascending order, 
find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that 
they add up to the target, where index1 must be less than index2. Please 
note that your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.
Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
 */
public class Q167_TwoSumII {
	 public static int[] twoSum(int[] numbers, int target) {
		 int left=0,right=numbers.length-1;
		 int []Twonum=new int[2];
		 if(numbers==null||numbers.length<2) return Twonum;
		 while(left<right){
			  if(numbers[left]+numbers[right]==target){
				  Twonum[0]=left+1;
				  Twonum[1]=right+1;
				  return Twonum;
			  }else if(numbers[left]+numbers[right]<target){
				  left++;
			  }else {
				  right--;
			  } 
		 }
		 return Twonum;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] Two={3,24,50,79,88,150,345};
		int [] T=new int[2];
		T=twoSum(Two, 200);
		System.out.println(T[0]);
		System.out.println(T[1]);
		
	}

}
/*****************Time out*********************
int [] Twonum=new int[2];
if(numbers==null||numbers.length<2) return Twonum;
for(int i=0;i<numbers.length;i++){
	 if(numbers[i]>target||(2*numbers[i]>target))  return Twonum;
	 for(int j=i+1;j<numbers.length;j++){
		 if(numbers[j]>target-numbers[i]) return Twonum;
		 if(target==numbers[i]+numbers[j]){
			Twonum[0]=i+1;
			Twonum[1]=j+1;
			return Twonum;
		}
	 }
}
return Twonum;
*/