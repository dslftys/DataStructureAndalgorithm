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
	/****************0(n^2)冒泡程序**********************/
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
	/*********0(n^2)优化后的冒泡**************/
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
	/*****************0(n^2)简单的选择排序****************/

	public static  void SelectSort(int [] a)
	{
		int i,j,min;
		for(i=1;i<length;i++)
		{
			min=i;//将当前值的下表定义为最小值的下表
			for(j=i+1;j<length;j++){
				if(a[min]>a[j])//如果有小于当前最小值的关键字，将此关键字的下标赋给min
					min=j;
			}
			if(i!=min){
				swap(a, i, min);
			}
		}
	}
	
	/*******0(n^2)直接插入排序******/
	public  static void InsertSort(int a[]){
		int i,j;
		for(i=2;i<length;i++){
			if(a[i]<a[i-1]){
				a[0]=a[i];//设置哨兵
				for(j=i-1;a[j]>a[0];j--){
					a[j+1]=a[j];
				}
				a[j+1]=a[0];
			}
		}
	}
	
	/***************希尔排序0(n^(3/2))**************/
	public static void ShellSort(int a[]){
		int i,j;
		int increment=length;
		do{
			increment=increment/3+1;
			for(i=increment+1;i<=length;i++){
				if(a[i]<a[i-increment]){//需要将a[i]插入到有序的增量子表
					a[0]=a[i];//暂存在a[0]
					for(j=i-increment;j>0&&a[0]<a[j];i-=increment)
						a[j+increment]=a[j];//记录后移，查找插入位置
					a[j+increment]=a[0];//插入
					
				}
			}
		}while(increment>1);
	}
	
	/**********************堆排序**********************/
	public static void HeapSort(int []a){
		int i;
		for(i=length/2;i>0;i--){
			HeapAdjust(a,i,length);//将a中构建成一个大顶堆
		}
		for(i=length;i>1;i--){
			swap(a, 1, i);
			HeapAdjust(a,1,i-1);//将a[1..i-1]构建成一个大顶堆
		}
	}
	
	private static void HeapAdjust(int[] a, int s, int m) {
		// TODO Auto-generated method stub
		int temp,j;
		temp=a[s];
		for(j=2*s;j<=m;j*=2){//沿关键字较大的孩子节点向下筛选
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
