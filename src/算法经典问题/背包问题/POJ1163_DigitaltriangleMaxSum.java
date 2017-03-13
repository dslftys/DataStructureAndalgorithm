package �㷨��������.��������;
/*
 * D(r,j)��ʾ��r�е�j������
 * MaxSum(r,j)��ʾ��D(r,j)���ױߵĸ���·���У����·������֮��
 * ��������Ϊ��MAxSum(1,1)
 */
public class POJ1163_DigitaltriangleMaxSum {
	
	private int MaxRow;
	private int [][]D;
	public POJ1163_DigitaltriangleMaxSum(int MaxRow,int [][]D){
		this.MaxRow=MaxRow;
		this.D=D;
	}
	/*
	 * ����1���ݹ�
	 */
	public int MaxSum(int i,int j){
		if(i==MaxRow-1) return D[i][j];
		return Math.max(MaxSum(i+1, j), MaxSum(i+1, j+1))+D[i][j];
	}
	public static void main(String[] args) {
		int [][]D={{7,0,0,0,0},{3,8,0,0,0},{8,1,0,0,0},{2,7,4,4,0},{4,5,2,6,5}};
		POJ1163_DigitaltriangleMaxSum digitaltriangleMaxSum=new POJ1163_DigitaltriangleMaxSum(D.length, D);
		System.out.println(digitaltriangleMaxSum.MaxSum(0, 0));
	}
}
