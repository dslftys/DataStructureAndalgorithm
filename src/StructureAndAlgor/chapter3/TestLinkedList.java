package StructureAndAlgor.chapter3;

import java.util.Iterator;

public class TestLinkedList {
	public static void main(String[] args) {
		MyLinkedList<Integer> mylist=new MyLinkedList<Integer>();
		for(int i=0;i<10;i++)
			mylist.add(i);
		Iterator<Integer> it=mylist.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		for(Integer a:mylist)
			System.out.println(a);
	}
}
