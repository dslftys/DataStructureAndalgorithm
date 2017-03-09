package StructureAndAlgor.chapter3;

import java.util.Iterator;
import java.util.ListIterator;
 
public class MyArrayList<AnyType> implements Iterable<AnyType>{

	private static final int DEFAULT_CAPACITY=10;
	private int theSize;
	private AnyType [] theItems;
	public MyArrayList(){
		clear();
	}
	public  void clear() {
		// TODO Auto-generated method stub
		theSize=0;
		ensureCapacity(DEFAULT_CAPACITY);
	}
	public int size(){
		return theSize;
	}
	
	public boolean isEmpty(){
		return size()==0;
	}
	
	public void trimToSize(){
		ensureCapacity(size());
	}
	
	public AnyType get(int idx){
		if(idx<0||idx>=size()){
			throw new ArrayIndexOutOfBoundsException();
		}
		return theItems[idx];
	}
	
	public AnyType set(int idx,AnyType newVal){
		if(idx<0||idx>=size()){
			throw new ArrayIndexOutOfBoundsException();
		}
		AnyType old=theItems[idx];
		theItems[idx]=newVal;
		return old;
	}
	
	public void ensureCapacity(int newCapacity) {
		// TODO Auto-generated method stub
		if(newCapacity<theSize){
			return;
		}
		AnyType[] old=theItems;
		theItems=(AnyType[])new Object[newCapacity];
		for(int i=0;i<size();i++){
			theItems[i]=old[i];
		}
	}
	
	public boolean add(AnyType x){
		add(size(),x);
		return true;
	}
	public void add(int idx,AnyType x){
		if(theItems.length==size()){
			ensureCapacity(size()*2+1);
		}
		for(int i=theSize;i>idx;i--){
			theItems[i]=theItems[i-1];
		}
		theItems[idx]=x;
		theSize++;
	}
	public void addAll(Iterable<?extends AnyType> items){
		Iterator<? extends AnyType> iter=items.iterator();
		while(iter.hasNext()){
			add(iter.next());
		}
	}
	public void removeAll(Iterable<?extends AnyType> items){
		AnyType item,element;
		Iterator<? extends AnyType> iter=items.iterator();
		while(iter.hasNext()){
			item=iter.next();
			Iterator<? extends AnyType> iterList=iterator();
			while(iterList.hasNext()){
				element=iterList.next();
				if(element.equals(item))
					iterList.remove();
			}
		}
	}
	public AnyType remove(int idx){
		AnyType removedItem=theItems[idx];
		for(int i=idx;i<size()-1;i++){
			theItems[i]=theItems[i+1];
		}
		theSize--;
		return removedItem;
	}
	@Override
	public java.util.Iterator<AnyType> iterator(){
		return new ArrayListIterator();
	}
	public java.util.ListIterator<AnyType> listIterator(){
		return (ListIterator<AnyType>) new ArrayListIterator();
	}
	
	public class ArrayListIterator implements java.util.ListIterator<AnyType>{
		private int current=0;
		boolean backwards=false;
		
		public boolean hasNext(){
			return current<size();
		}
		
		public AnyType next(){
			if(!hasNext()){
				throw new java.util.NoSuchElementException();
			}
			backwards=false;
			return theItems[current++];
		}
		public void remove(){
			MyArrayList.this.remove(--current);
		}

		@Override
		public boolean hasPrevious() {
			// TODO Auto-generated method stub
			return current>0;
		}

		@Override
		public AnyType previous() {
			// TODO Auto-generated method stub
			if(!hasPrevious())
				throw new java.util.NoSuchElementException();
			backwards=true;
			return theItems[--current];
		}

		@Override
		public int nextIndex() {
			// TODO Auto-generated method stub
			throw new java.lang.UnsupportedOperationException();
		}

		@Override
		public int previousIndex() {
			// TODO Auto-generated method stub
			throw new java.lang.UnsupportedOperationException();
		}

		@Override
		public void set(AnyType newVal) {
			// TODO Auto-generated method stub
			MyArrayList.this.set(current, newVal);
		}

		@Override
		public void add(AnyType e) {
			// TODO Auto-generated method stub
			
		}
	}
}
