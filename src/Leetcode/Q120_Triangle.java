package Leetcode;

import java.util.ArrayList;
import java.util.List;

/*
Given a triangle, find the minimum path sum from top to bottom. Each 
step you may move to adjacent numbers on the row below.
For example, given the following triangle
[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
Note:
Bonus point if you are able to do this using only O(n) extra space, where n
is the total number of rows in the triangle.
*/
public class Q120_Triangle {
	public static int minimumTotal(List<List<Integer>> triangle) {
		int [] A=new int[triangle.size()+1];
		for(int i=triangle.size()-1;i>=0;i--){
			for(int j=0;j<triangle.get(i).size();j++){
				A[j]=Math.min(A[j], A[j+1])+triangle.get(i).get(j);
			}
		}
		return A[0];
	}
	public static void main(String[] args) {
	
		
	}

}
/*************没考虑在上一行元素的下方

public static int minimumTotal(List<List<Integer>> triangle) {
	    int sum=0;
		for (List<Integer> list : triangle) {
			sum+=minList(list);
		}
		return sum;
	}
	private static int minList(List<Integer>list){
		int mindata=Integer.MAX_VALUE;
		for (int data : list) {
			if(data<mindata) mindata=data;
		}
		return mindata;
	}
*/