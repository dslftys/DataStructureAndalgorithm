package Algorithm.Chapter1_Base;

public class ClassicArrayDeal {
	public double FindMax(double [] a){
		double max=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>max) max=a[i];
		}
		return max;
	}
	public double FindAvg(double [] a){
		int N=a.length;
		double sum=0;
		for(int i=0;i<N;i++){
			sum+=a[i];
		}
		return sum/N;
	}
	public double [] CopyArray(int[] a){
		int N=a.length;
		double [] b=new double[N];
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
		}
		return b;
	}
	public void ReverseArray(double [] a){
		int N=a.length;
		for(int i=0;i<N/2;i++){
			double temp=a[i];
			a[i]=a[N-i-1];
			a[N-i-1]=temp;
		}
		System.out.println(a);
	}
	/*
	 * 矩阵相乘  a[][]*b[][]=c[][]
	 */
	public void MatrixMulti(double [][] a,double[][] b){
		int N=a.length;
		double [][] c=new double[N][N];
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++){
				for(int k=0;k<N;k++)//计算行i和列j的点乘
					c[i][k]+=a[i][k]*b[i][k];
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
