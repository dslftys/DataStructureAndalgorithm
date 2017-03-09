package Algorithm.Chapter1_Base;
import java.util.Arrays;

import Algorithm.AuthorsLib.StdDraw;
import Algorithm.AuthorsLib.StdRandom;
public class StdDrawExa {
	/*
	 * 函数值
	 */
	public static void functionValue(int n){
		StdDraw.setXscale(0,n);
		StdDraw.setYscale(0,n);
		StdDraw.setPenRadius(0.01);
		for(int i=1;i<=n;i++){
			StdDraw.point(i, i);
			StdDraw.point(i, i*i);
			StdDraw.point(i, i*Math.log(i));
		}
	}
	/*
	 * 随机数组
	 */
	public static void RandomArray(int n){
		double [] a=new double[n];
		for(int i=0;i<n;i++){
			a[i]=StdRandom.random();
		}
		for(int i=0;i<n;i++){
			double x=1.0*i/n;
			double y=a[i]/2.0;
			double rw=0.5/n;
			double rh=a[i]/2.0;
			StdDraw.filledRectangle(x, y, rw, rh);
			
		}
	}
	
	/*
	 * 已排序的随机数组
	 */
	public static void RandomArrayWithSorted(int n){
		double [] a=new double[n];
		for(int i=0;i<n;i++){
			a[i]=StdRandom.random();
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++){
			double x=1.0*i/n;
			double y=a[i]/2.0;
			double rw=0.5/n;
			double rh=a[i]/2.0;
			StdDraw.filledRectangle(x, y, rw, rh);
			
		}
	}
	public static void main(String[] args) {
		//functionValue(100);
		//RandomArray(100);
		RandomArrayWithSorted(100);
	}
}
