package Algorithm.Chapter1_Base;

import java.util.Arrays;


public class StdRandomExa {
	/*
	 *  return [a,b)之间的值
	 */
	public static double uniform(double a,double b){
		return a+Math.random()*(b-1);
	}
	/*
	 * return [0,N)之间的int
	 */
	public static int uniform(int N){
		return (int)Math.random()*N;
	}
	
	public static int uniform(int lo,int hi){
		return (int) (lo+Math.random()*(hi-lo));
	}
	
	/*
	 * 根据离散概率随机返回int值，出现i的概率是a[i]
	 */
	public static int discrete(double [] a){
		//a[]中各元素只和必须等于1
		double r=Math.random();
		double sum=0.0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
			if(sum>=r) return i;
		}
		return -1;
	}
	
	/*
	 * 随机将double数组中的元素排序
	 */
	public static void shuffle(double [] a){
		int N=a.length;
		for(int i=0;i<N;i++){
			//将a[i]和a[i..N-1]中任意一个元素交换
			int r=(int) (i+Math.random()*(N-i));
			double temp=a[i];
			a[i]=a[r];
			a[r]=temp;
		}
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		double [] a=new double[10];
	
		for(int i=0;i<10;i++){
			double tep=Math.random()*100;
			a[i]=tep;
			System.out.print(tep+",");
		}
		
		System.out.println(uniform(10.0,20.0));
		System.out.println(uniform(10,20));
		
		System.out.println(20);
		System.out.println(discrete(a));
		shuffle(a);
		Arrays.sort(a);
		for(double aa:a){
			System.out.print(aa+",");
		}
	}
}
