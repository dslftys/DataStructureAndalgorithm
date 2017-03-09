package StructureAndAlgor.chapter3.exercise.ex3_5;

import java.util.*;

public class UnionElement {
	public static <AnyType> List<AnyType> UnionEle(List<AnyType>A,List<AnyType> B){
		List<AnyType> AandB=new ArrayList<AnyType>();
		int k=0;
		Iterator<AnyType> itB=B.iterator();
		for(AnyType a:A){
			AandB.add(a);
		}
		while(itB.hasNext()){
			AnyType data;
			k=0;
			data=itB.next();
			for(AnyType aa:A){
				if(aa!=data) k++;
				if(k==A.size()) AandB.add(data);
			}	
		}
		return AandB;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.nanoTime();
		List<Integer> L1=new ArrayList<Integer>();
		L1.add(10);
		L1.add(11);
		L1.add(12);
		L1.add(20);
		List<Integer> L2=new ArrayList<Integer>();
		L2.add(8);
		L2.add(9);
		L2.add(10);
		L2.add(20);
		
		List<Integer> L3=new ArrayList<Integer>();
		L3=UnionEle(L1,L2);
		System.out.println(L3);
		long endTime =System.nanoTime();
		System.out.println("程序运行的时间:"+(endTime-startTime)+"ns");

	}
}
