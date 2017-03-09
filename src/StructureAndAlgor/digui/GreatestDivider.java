package StructureAndAlgor.digui;

public class GreatestDivider {
	public static int bigDivider(int m,int n){
		if(m==n) return m;
		else if(m>n) return bigDivider(m-n, n);
		else  return bigDivider(m, n-m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bigDivider(8, 10));
	}

}
