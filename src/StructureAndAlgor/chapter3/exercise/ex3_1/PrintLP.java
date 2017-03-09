package StructureAndAlgor.chapter3.exercise.ex3_1;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

/**
 * @author Victor
 * B表中的数据为A中的第几个
 */
public class PrintLP {
	public static <AnyType> void printLots(List<AnyType> L,List<AnyType> P){
		Iterator<AnyType> iterL=L.iterator();
		Iterator<AnyType> iterP=P.iterator();
		AnyType itemL=null;
		Integer itemP=0;
		int start=0;
		
		while(iterL.hasNext()&&iterP.hasNext()){
			itemP=(Integer) iterP.next();
			System.out.println("Looking for position:"+itemP);
			while(start<itemP&&iterL.hasNext()){
				start++;
				itemL=iterL.next();
			}
			System.out.println(itemL);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> L=new ArrayList<Integer>();
		L.add(2);
		L.add(4);
		L.add(6);
		L.add(88);
		L.add(99);
		ArrayList<Integer> P=new ArrayList<Integer>();
		P.add(2);
		P.add(4);
		printLots(L,P);
	}

}
