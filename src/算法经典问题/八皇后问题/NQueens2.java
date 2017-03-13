package 算法经典问题.八皇后问题;

public class NQueens2 {
	private  int Queen;//皇后的数量
	private final int INITIAL=Integer.MIN_VALUE;//棋盘的初始值
	public int []a;
	int ii=0;
	public NQueens2(int Queen){
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
	
	public void Queen(int k){//第k种状态
		int j=0;
		if(k==Queen){
			System.out.println("第"+ ++ii+"种\n");
			print();
		}else{
			for(j=0;j<Queen;j++){//试探第k行的每一列
				if(Isvalid(k, j)){
					a[k]=j;
					Queen(k+1);//第k行放好后，则进行放第k+1行
				}
			}
		}
	}
	
	public static void main(String[] args) {
		NQueens2 nQueens=new NQueens2(8);
		nQueens.init();
		nQueens.Queen(0);
	}
}
