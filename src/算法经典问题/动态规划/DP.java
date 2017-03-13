package 算法经典问题.动态规划;

public class DP {
	private int n;
	int [][]C;
	public DP(int n){
		this.n=n;
		C=new int[n+1][n+1];
	}
	/*
	 * 求解二项式
	 * C(n,n)=C(n,0)=1
	 * C(n,k)=C(n-1,k-1)+C(n-1,k)
	 */
	public int Binomial(int k){
		for(int i=0;i<n;i++){
			for(int j=0;j<Math.min(i, k);j++){
				if(j==0||j==i){
					C[i][j]=1;
				}
				else C[i][j]=C[i-1][j-1]+C[i-1][j];
			}
		}
		return C[n][k];
	}
	public static void main(String[] args) {
		DP dp=new DP(8);
		for(int i=0;i<=8;i++)
			System.out.println(dp.Binomial(i));
	}
	
}
