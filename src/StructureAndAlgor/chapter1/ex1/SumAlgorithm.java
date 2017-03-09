package StructureAndAlgor.chapter1.ex1;

public class SumAlgorithm {
	public static int maxSubSum1(int[] a){
		int maxSum=0;
		for(int i=0;i<a.length;i++){
			for(int j=1;j<a.length;j++){
				int thisSum=0;
				for(int k=i;k<=j;k++){
					thisSum+=a[k];
					if(thisSum>maxSum) maxSum=thisSum;
				}
			}
		}
		return maxSum;
	}
	
	public static int maxSubSum2(int [] a){
		int maxSum=0;
		for(int i=0;i<a.length;i++){
			int thisSum=0;
			for(int j=i;j<a.length;j++){
				thisSum+=a[j];
				if(thisSum>maxSum) maxSum=thisSum;
			}
		}
		return maxSum;
	}
}
