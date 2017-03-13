package SwordOffer.problem9;
/*
 * ��n����Შ�������� �ĵ�n��
 * n=0 f(n)=0
 * n=1 f(n)=1
 * f(n)=f(n-1)+f(n-2)
 */
public class Fibonacci {
	/*
	 * Ч�ʺܵ͵ĵݹ鷽��
	 */
	public long  Fibonacci1(int n){
		if(n==0||n==1) return n;
		return Fibonacci1(n-1)+Fibonacci1(n-2);
	}
	/*
	 * ʱ�临�Ӷ�ΪO(n)�ķ���
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
