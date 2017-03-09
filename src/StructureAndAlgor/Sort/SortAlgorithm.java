package StructureAndAlgor.Sort;

public class SortAlgorithm {
	static int length;
	
	public SortAlgorithm(int length){
		this.length=length;
	}
	public static void swap(int []a,int i,int j){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	/**************0(n^2)*******************/
	public static void BubbleSort0(int [] a)
	{
		for(int i=1;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(a[i]>a[j]) swap(a,i,j);
			}
		}
	}
	/****************0(n^2)ð�ݳ���**********************/
	public static void BubbleSort1(int [] a)
	{
		for(int i=1;i<length;i++)
		{
			for(int j=length-1;j>i;j--)
			{
				if(a[j]>a[j+1]) swap(a,j,j+1);
			}
		}
	}
	/*********0(n^2)�Ż����ð��**************/
	public static void  BubbleSort2(int []a)
	{
		int i,j;
		boolean  flag=true;
		for(i=1;i<length&&flag;i++)
		{
			flag=false;
			for(j=length-1;j>i;j--)
			{
				if(a[j]>a[j+1]) swap(a,j,j+1);
				flag=true;
			}
		}
	}
	/*****************0(n^2)�򵥵�ѡ������****************/

	public static  void SelectSort(int [] a)
	{
		int i,j,min;
		for(i=1;i<length;i++)
		{
			min=i;//����ǰֵ���±���Ϊ��Сֵ���±�
			for(j=i+1;j<length;j++){
				if(a[min]>a[j])//�����С�ڵ�ǰ��Сֵ�Ĺؼ��֣����˹ؼ��ֵ��±긳��min
					min=j;
			}
			if(i!=min){
				swap(a, i, min);
			}
		}
	}
	
	/*******0(n^2)ֱ�Ӳ�������******/
	public  static void InsertSort(int a[]){
		int i,j;
		for(i=2;i<length;i++){
			if(a[i]<a[i-1]){
				a[0]=a[i];//�����ڱ�
				for(j=i-1;a[j]>a[0];j--){
					a[j+1]=a[j];
				}
				a[j+1]=a[0];
			}
		}
	}
	
	/***************ϣ������0(n^(3/2))**************/
	public static void ShellSort(int a[]){
		int i,j;
		int increment=length;
		do{
			increment=increment/3+1;
			for(i=increment+1;i<=length;i++){
				if(a[i]<a[i-increment]){//��Ҫ��a[i]���뵽����������ӱ�
					a[0]=a[i];//�ݴ���a[0]
					for(j=i-increment;j>0&&a[0]<a[j];i-=increment)
						a[j+increment]=a[j];//��¼���ƣ����Ҳ���λ��
					a[j+increment]=a[0];//����
					
				}
			}
		}while(increment>1);
	}
	
	/**********************������**********************/
	public static void HeapSort(int []a){
		int i;
		for(i=length/2;i>0;i--){
			HeapAdjust(a,i,length);//��a�й�����һ���󶥶�
		}
		for(i=length;i>1;i--){
			swap(a, 1, i);
			HeapAdjust(a,1,i-1);//��a[1..i-1]������һ���󶥶�
		}
	}
	
	private static void HeapAdjust(int[] a, int s, int m) {
		// TODO Auto-generated method stub
		int temp,j;
		temp=a[s];
		for(j=2*s;j<=m;j*=2){//�عؼ��ֽϴ�ĺ��ӽڵ�����ɸѡ
			if(j<m&&a[j]<a[j+1])
				++j;
			if(temp==a[j])
				break;
			a[s]=a[j];
			s=j;
		}
		a[s]=temp;
	}
	public static void main(String[] args) {
		int a[]={0,1,3,4,2,1,5,3,6,7};
		SortAlgorithm sortAlgorithm=new SortAlgorithm(10);
		InsertSort(a);
		for(int i=0;i<10;i++)
			System.out.print(a[i]);
		
		boolean b=true?false:true==true?false:true;
		System.out.println(b);
		
	}
}
