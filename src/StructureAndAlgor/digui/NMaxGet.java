package StructureAndAlgor.digui;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class NMaxGet {
	
	public static int  ArrayMax(int a[],int n){
		if(n==1) return a[1] ;
		return max(a[n],ArrayMax(a,n-1));
	}
	public static int max(int x,int y){
		return x>y?x:y;
	}
	public static void main(String[] args) {
		int a[]={1,2,3,4,2,32,21,43,675,223};
		System.out.println(ArrayMax(a, a.length-1));
	}
}
