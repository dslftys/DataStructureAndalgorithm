package 算法经典问题.八皇后问题;

public class NQueens {
	private  int Queen;//皇后的数量
	private final int INITIAL=Integer.MIN_VALUE;//棋盘的初始值
	public int []a;
	public NQueens(int Queen){
		this.Queen=Queen;
		a=new int[Queen];
	}
	public void init(){//对棋盘初始化
		for(int i=0;i<Queen;i++){
			a[i]=INITIAL;
		}
	}
	
	public boolean Isvalid(int row,int col){//判断第row行第col列能否可以放置皇后(列不同，又不在同一斜线上)
		//也即遍历所有的a[i]都和a[row]不相等
		for(int i=0;i<row;i++){
			if(a[i]==col||Math.abs(i-row)==Math.abs(a[i]-col)) return false;
			//在同一斜线上，横坐标和纵坐标差值的绝对值相等
		}
		return true;
	}
	public void print(){//打印一组解
		for(int i=0;i<Queen;i++){
			for(int j=0;j<Queen;j++){
				if(a[i]!=j)System.out.print(". ");
				else System.out.print("# ");
			}
		System.out.println();
		}	
	}
	
	public void Queen(){
		int n=0;
		int i=0,j=0;
		while(i<Queen){
			while(j<Queen){//对每一列进行探测是否可以放皇后
				if(Isvalid(i, j)){
					//该位置是否可以放皇后
					a[i]=j;
					j=0;//探测下一行皇后
					break;
				}else{
					j++;
				}	
			}//出来后要么i位置可以放要么不可以放
			if(a[i]==INITIAL){//表示i位置没有可以放的方案。则回去重找。
				if(i==0)//回溯到第一行，仍然没有则结束
					break;
				else{
					i--;
					j=a[i]+1;//退后一步，且j的位置要增大一个
					a[i]=INITIAL;
					continue;
				}
			}
			if(i==Queen-1)//最后一行找到了一个皇后的位置，打印出来。
			{
				System.out.println("第"+ ++n+"种\n");
				print();//打印出该方案
				//再重新找
				j=a[i]+1;//从最后一行放置皇后列数的下一列继续探测
				//i=0;
				a[i]=INITIAL;
				//init();
				continue;
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		NQueens nQueens=new NQueens(8);
		nQueens.init();
		nQueens.Queen();
	}
}
