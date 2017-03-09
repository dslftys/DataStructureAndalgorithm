package StructureAndAlgor.chapter3.exercise.ex3_4;

import java.util.*;

public class Intersection {
	public static <AnyType> List<AnyType> getIntersect(List<AnyType>A,List<AnyType> B){
		List<AnyType> AandB=new ArrayList<AnyType>();
		Iterator<AnyType> itA=A.iterator();
		Iterator<AnyType> itB=B.iterator();
		
		while(itA.hasNext()){
			AnyType data;
			data=itA.next();
			System.out.println("ok1");
			for(AnyType aa:B){
				if(data==aa)
					AandB.add(data);
			}
		}
		
		return AandB;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<Integer> a=new ArrayList<Integer>();
		List<Integer> b=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(40);
		a.add(50);
		
		b.add(10);
		b.add(30);
		b.add(40);
		b.add(50);
		*/
		List<String> a=new ArrayList<String>();
		List<String> b=new ArrayList<String>();
		a.add("abc");
		a.add("abd");
		a.add("dds");
		a.add("cccn");
		
		b.add("abc");
		b.add("dedew");
		b.add("dds");
		b.add("dede");
		
		System.out.println(getIntersect(a,b));
	}

}
