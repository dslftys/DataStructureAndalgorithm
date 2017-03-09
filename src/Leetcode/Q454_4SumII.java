package Leetcode;

import java.util.*;
//Time out
public class Q454_4SumII {
	public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
	     if(A==null||A.length<1) return 0;
	     HashMap<Integer, Integer> hashMap=new HashMap<>();
	     int len=A.length;
	     int sum=0;
	     int m=0;
	     int times=1;
	     for(int i=0;i<len;i++)
	    	 for(int j=0;j<len;j++)
	    	 {
	    		 sum=A[i]+B[j];
	    		 if(hashMap.containsKey(sum))
	    		 {
	    			 hashMap.put(sum, hashMap.get(sum)+1);
	    		 }
	    		 else hashMap.put(sum, 1);
	    	 }
	     int rst=0;
	     for(int i=0;i<len;i++)
	    	 for(int j=0;j<len;j++)
	    	 {
	    		 sum=C[i]+D[j];
	    		 if(hashMap.containsKey(-sum)) rst+=hashMap.get(-sum);
	    	 }
		 return rst*times;
	 }
	public static void main(String[] args) {
		int [] A={1,2};
		int [] B={-1,-2};
		int [] C={-1,2};
		int [] D={0,2};
		System.out.println(fourSumCount(A,B,C,D));	
	}

}
