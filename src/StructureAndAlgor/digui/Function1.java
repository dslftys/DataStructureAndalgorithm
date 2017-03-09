package StructureAndAlgor.digui;

public class Function1 {
	public static long F1(long n){
		if(n==0) return 1;
		else return n*F1(n/2);
	}
	
	public static int G(int m,int n){
		if(m==0&&n>=0) return 0;
		else return n+G(m-1,2*n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
