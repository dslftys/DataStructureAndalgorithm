package Algorithm.Chapter1_Base;

import java.util.Arrays;

import Algorithm.AuthorsLib.In;
import Algorithm.AuthorsLib.StdIn;
import Algorithm.AuthorsLib.StdOut;

public class BinarySearch {
	public static int rank1(int key,int [] a){
		int lo=0;
		int hi=a.length-1;
		while(lo<=hi){
			int mid=lo+(hi-lo)/2;
			if(key<a[mid])hi=mid-1;
			else if(key<a[mid])lo=mid+1;
			else return mid;
			
		}
		return -1;
	}
	public static int rank(int k,int [] a){
		return rank(k,a,0,a.length-1);
	}
	public static int rank(int key,int[] a,int lo,int hi){
		//如果key存在于a[]中，它的索引不会小于lo且不会大于hi
		if(lo>hi) return -1;
		int mid=lo+(hi-lo)/2;
		if(key<a[mid]) return rank(key,a,lo,mid-1);
		else if(key>a[mid]) return rank(key,a,mid+1,hi);
		else return mid;
	}
	public static void main(String[] args){
		int [] whitelist=In.readInts(args[0]);
		Arrays.sort(whitelist);
		while(!StdIn.isEmpty()){
			//读取键值，如果不存在于白名单中则将其打印
			int key =StdIn.readInt();
			if(rank1(key,whitelist)<0) StdOut.println(key);
		}
		
	}
}
/*
 *输入%java BinarySearch tinyW.txt<tinyT.txt
 */