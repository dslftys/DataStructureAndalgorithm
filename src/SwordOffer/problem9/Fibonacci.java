package SwordOffer.problem9;
/*
 * 给n输出裴波那契数列 的第n项
 * n=0 f(n)=0
 * n=1 f(n)=1
 * f(n)=f(n-1)+f(n-2)
 */
public class Fibonacci {
	/*
	 * 效率很低的递归方法
	 */
	public long  Fibonacci1(int n){
		if(n==0||n==1) return n;
		return Fibonacci1(n-1)+Fibonacci1(n-2);
	}
	/*
	 * 时间复杂度为O(n)的方法
	 */
	public long Fibonacci2(int n){
		int result[]={0,1};
		if(n<2) return result[n];
		
		long  fibOne=1;
		long  fibTwo=0;
		long fibN=0;
		for(int i=2;i<n;++i){
			fibN=fibOne+fibTwo;
			fibTwo=fibOne;
			fibOne=fibN;
		}
		return fibN;
	}
	
}
