package �㷨��������.�˻ʺ�����;

public class NQueens2 {
	private  int Queen;//�ʺ������
	private final int INITIAL=Integer.MIN_VALUE;//���̵ĳ�ʼֵ
	public int []a;
	int ii=0;
	public NQueens2(int Queen){
		this.Queen=Queen;
		a=new int[Queen];
	}
	public void init(){//�����̳�ʼ��
		for(int i=0;i<Queen;i++){
			a[i]=INITIAL;
		}
	}
	
	public boolean Isvalid(int row,int col){//�жϵ�row�е�col���ܷ���Է��ûʺ�(�в�ͬ���ֲ���ͬһб����)
		//Ҳ���������е�a[i]����a[row]�����
		for(int i=0;i<row;i++){
			if(a[i]==col||Math.abs(i-row)==Math.abs(a[i]-col)) return false;
			//��ͬһб���ϣ���������������ֵ�ľ���ֵ���
		}
		return true;
	}
	public void print(){//��ӡһ���
		for(int i=0;i<Queen;i++){
			for(int j=0;j<Queen;j++){
				if(a[i]!=j)System.out.print(". ");
				else System.out.print("# ");
			}
		System.out.println();
		}	
	}
	
	public void Queen(int k){//��k��״̬
		int j=0;
		if(k==Queen){
			System.out.println("��"+ ++ii+"��\n");
			print();
		}else{
			for(j=0;j<Queen;j++){//��̽��k�е�ÿһ��
				if(Isvalid(k, j)){
					a[k]=j;
					Queen(k+1);//��k�зźú�����зŵ�k+1��
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
