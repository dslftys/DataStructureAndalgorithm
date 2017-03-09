package StructureAndAlgor.chapter3.exercise.ex3_7;
import java.util.*;
public class makeListTime {
	public static List<Integer> makeList(int N){
		ArrayList<Integer> lst=new ArrayList<Integer>();
		for(int i=0;i<N;i++){
			lst.add(i);
			lst.trimToSize();
		}
		return lst;
	}
	public static void main(String[] args) {
		long startTime=System.nanoTime();
		makeList(10);
		long endTime=System.nanoTime();
		System.out.println("The time is:"+(endTime-startTime)/10+"ns");
	}
}
