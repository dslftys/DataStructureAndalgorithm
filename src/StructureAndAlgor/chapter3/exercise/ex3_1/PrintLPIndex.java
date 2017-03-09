package StructureAndAlgor.chapter3.exercise.ex3_1;
import java.util.*;
class A{
	public A(){
		
	}
	public void printPL(ArrayList<Integer> P,ArrayList<Integer> L){
		Iterator<Integer> itP=P.iterator();
		System.out.println();
		if(P.get(P.size()-1)>L.size()){
			System.out.println("Out of");
			return;
		}
		while(itP.hasNext())
			System.out.println(L.get(itP.next()-1));
	}
}
public class PrintLPIndex {
	public static void main(String[] args) {
		A a=new A();
		ArrayList<Integer> p=new ArrayList<Integer>();
		p.add(1);
		p.add(3);
		p.add(5);
		p.add(7);
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(31);
		l.add(25);
		l.add(73);
		l.add(78);
		l.add(78);
		l.add(89);
		a.printPL(p, l);
	}
}
