package StructureAndAlgor.chapter7_sort;

import com.sun.xml.internal.bind.AnyTypeAdapter;

public class SortAlgorithm {
	
	/*
	 * Simple insertion sort
	 * @param a an arrray of comparable items
	 * O(N2)
	 */
	public static <AnyType extends Comparable <? super AnyType>>
	//≤Â»Î≈≈–Ú
		void insertionSort(AnyType [] a)
		{
			int j;
			for(int p=1;p<a.length;p++)
			{
				AnyType tmp=a[p];
				for(j=p;j>0&&tmp.compareTo(a[j-1])<0;j--)
					a[j]=a[j-1];
				a[j]=tmp;
			}
		}
	//œ£∂˚≈≈–Ú
	public static <AnyType extends Comparable <? super AnyType>>
		void shellsort(AnyType [] a)
		{
			int j;
			for(int gap=a.length/2;gap>0;gap/=2)
				for(int i=gap;i<a.length;i++)
				{
					AnyType tmp=a[i];
					for(int j1=i;j1>=gap&&tmp.compareTo(a[j1-gap])<0;j1-=gap)
						a[j1]=a[j1-gap];
					a[i]=tmp;
				}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparable [] a={1,2,32,43,21,1,2,32,5,6};
		insertionSort(a);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
