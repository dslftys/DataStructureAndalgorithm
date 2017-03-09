package StructureAndAlgor.chapter3.exercise.ex3_4;
import java.util.*;
public class Exintersection {
	public static <AnyType extends Comparable<? super AnyType>>
			void intersection(List<AnyType> L1,List<AnyType> L2,List<AnyType> Intersect){
		ListIterator<AnyType> iterL1=L1.listIterator();
		ListIterator<AnyType> iterL2=L2.listIterator();
		
		AnyType itemL1=null,itemL2=null;
		
		//get first item in each list
		if(iterL1.hasNext()&&iterL2.hasNext()){
			itemL1=iterL1.next();
			itemL2=iterL2.next();
		}
		while(itemL1!=null&&itemL2!=null){
			int compareResult=itemL1.compareTo(itemL2);
			if(compareResult==0){
				Intersect.add(itemL1);
				itemL1=iterL1.hasNext()?iterL1.next():null;
				itemL2=iterL2.hasNext()?iterL2.next():null;
			}else if(compareResult<0){
				itemL1=iterL1.hasNext()?iterL1.next():null;
			}else{
				itemL2=iterL2.hasNext()?iterL2.next():null;
			}
		}
	}
	public static void main(String[] args) {
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
		intersection(L1,L2,L3);
		System.out.println(L3);
	}
}
