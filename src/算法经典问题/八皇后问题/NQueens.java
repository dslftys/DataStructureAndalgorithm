package �㷨��������.�˻ʺ�����;

public class NQueens {
	private  int Queen;//�ʺ������
	private final int INITIAL=Integer.MIN_VALUE;//���̵ĳ�ʼֵ
	public int []a;
	public NQueens(int Queen){
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
	
	public void Queen(){
		int n=0;
		int i=0,j=0;
		while(i<Queen){
			while(j<Queen){//��ÿһ�н���̽���Ƿ���ԷŻʺ�
				if(Isvalid(i, j)){
					//��λ���Ƿ���ԷŻʺ�
					a[i]=j;
					j=0;//̽����һ�лʺ�
					break;
				}else{
					j++;
				}	
			}//������Ҫôiλ�ÿ��Է�Ҫô�����Է�
			if(a[i]==INITIAL){//��ʾiλ��û�п��Էŵķ��������ȥ���ҡ�
				if(i==0)//���ݵ���һ�У���Ȼû�������
					break;
				else{
					i--;
					j=a[i]+1;//�˺�һ������j��λ��Ҫ����һ��
					a[i]=INITIAL;
					continue;
				}
			}
			if(i==Queen-1)//���һ���ҵ���һ���ʺ��λ�ã���ӡ������
			{
				System.out.println("��"+ ++n+"��\n");
				print();//��ӡ���÷���
				//��������
				j=a[i]+1;//�����һ�з��ûʺ���������һ�м���̽��
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
