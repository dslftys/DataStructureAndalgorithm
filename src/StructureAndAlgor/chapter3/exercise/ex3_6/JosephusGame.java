package StructureAndAlgor.chapter3.exercise.ex3_6;
import java.util.*;
public class JosephusGame {
	public static void pass(int m,int n){
		int i,j,mPrime,numLeft;
		ArrayList<Integer> L=new ArrayList<Integer>();
		for(i=1;i<n;i++){
			L.add(i);
		}
		ListIterator<Integer> iter=L.listIterator();
		Integer item=0;
		numLeft=n;
		mPrime=m%n;
		for(i=0;i<n;i++){
			mPrime=m%numLeft;
			if(mPrime<=numLeft/2){
				if(iter.hasNext()){
					item=iter.next();
				}
				for(j=0;j<mPrime;j++){
					if(!iter.hasNext())
						iter=L.listIterator();
					item=iter.next();
				}
			}else{
				for(j=0;j<numLeft-mPrime;j++){
					if(!iter.hasPrevious())
						iter=L.listIterator(L.size());
					item=iter.previous();
				}
			}
			System.out.println("Removed"+item+" ");
			iter.remove();
			if(!iter.hasNext())
				iter=L.listIterator();
			
			System.out.println();
			for(Integer x:L)
				System.out.println(x+" ");
			System.out.println();
			numLeft--;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		pass(1,5);
	}
}
