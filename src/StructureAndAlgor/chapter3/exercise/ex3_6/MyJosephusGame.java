package StructureAndAlgor.chapter3.exercise.ex3_6;
import java.util.*;
public class MyJosephusGame {
	public static void pass(int m,int n){
		int [] a=new int[n];
		int i=0,j,tempNum=n;
		for(i=0;i<n;i++) a[i]=i+1;
		while(tempNum!=0){
			if(m<tempNum){
					System.out.println("Delete the item is:"+a[m]);
					for(j=m-1;j<tempNum-1;j++) a[m]=a[m+1];
			}else{
				System.out.println("Delete the item is:"+a[m%tempNum]);
				for(j=m%tempNum-1;j<tempNum-1;j++) a[m%tempNum]=a[m%tempNum+1];
			}
			tempNum--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pass(1,5);
	}

}
