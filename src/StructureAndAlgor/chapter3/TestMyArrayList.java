package StructureAndAlgor.chapter3;
import java.util.*;
public class TestMyArrayList {
	public static void main(String[] args) {
		MyArrayList<Integer> mylist=new MyArrayList<Integer>();
		mylist.add(10);
		for(int i=0;i<10;i++)
			mylist.add(10);
		
		System.out.println(mylist.size());
		System.out.println(mylist);
		
		Iterator<Integer> it=mylist.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
