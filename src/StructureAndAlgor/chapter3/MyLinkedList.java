package StructureAndAlgor.chapter3;

import java.util.Iterator;

public class MyLinkedList<AnyType> implements Iterable<AnyType> {

	private int theSize;
	private int modCount=0;
	private Node<AnyType> beginMarker;
	private Node<AnyType> endMarker;
	
	private static class Node<AnyType>{
		public Node(AnyType d,Node<AnyType> p,Node<AnyType> n){
			data=d;
			prev=p;
			next=n;
		}
		public AnyType data;
		public Node<AnyType>prev;
		public Node<AnyType> next;
		
	}
	
	public MyLinkedList(){
		clear();
	}
	/*
	 * Change the size of this collection to zero
	 */
	public void clear(){
		beginMarker =new Node<AnyType>(null,null, null);
		endMarker=new Node<AnyType>(null,beginMarker,null);
		beginMarker.next=endMarker;
		theSize=0;
		modCount++;
	}
	public int size(){
		return theSize;
	}
	public boolean isEmpty(){
		return size()==0;
	}
	public boolean add(AnyType x){
		add(size(),x);
		return true;
	}
	public void add(int idx,AnyType x){
		addBefore(getNode(idx),x);
		
	}
	
	public AnyType get(int idx){
		return getNode(idx).data;
	}
	
	public AnyType set(Node<AnyType> p,AnyType newVal){
		AnyType oldVal=p.data;
		p.data=newVal;
		return oldVal;
	}
	
	public AnyType remove(int idx){
		return remove(getNode(idx));
	}
	
	

	/*
	 * add an item to this collection ,at specified position p
	 */
	private void addBefore(Node<AnyType> p,AnyType x){
		Node<AnyType> newNode=new Node<AnyType>(x,p.prev,p);
		newNode.prev.next=newNode;
		p.prev=newNode;
		theSize++;
		modCount++;
	}
	/*
	 * Removes the object containted in Node p
	 */
	private AnyType remove(Node<AnyType> p){
		p.next.prev=p.prev;
		p.prev.next=p.next;
		theSize--;
		modCount++;
		
		return p.data;
	}
	/*
	 * Gets the Node at position idx,which must range from 0 to size()
	 */
	private Node<AnyType> getNode(int idx){
		Node<AnyType> p;
		if(idx<0||idx>size()){
			throw new IndexOutOfBoundsException();
		}
		if(idx<size()/2){
			p=beginMarker.next;
			for(int i=0;i<idx;i++){
				p=p.next;
			}
		}else{
			p=endMarker;
			for(int i=size();i>idx;i--){
				p=p.prev;
			}
		}
		return p;
	}
	public boolean contains(AnyType x){
		Node<AnyType> p=beginMarker.next;
		while(p!=endMarker&&!(p.data.equals(x))){
			p=p.next;
		}
		return (p!=endMarker);
	}
	@Override
	public Iterator<AnyType> iterator() {
		// TODO Auto-generated method stub
		return new LinkedListIterator();
	}
	public java.util.ListIterator<AnyType> listInterator(){
		return new LinkedListIterator();
	}
	private class LinkedListIterator implements java.util.ListIterator<AnyType>{
		private Node<AnyType> current=beginMarker.next;
		private int expectedModCount=modCount;
		private boolean okToRemove=false;
		public boolean hasNext(){
			return current!=endMarker;
		}
		
		public AnyType next(){
			if(modCount!=expectedModCount)
				throw new java.util.ConcurrentModificationException();
			if(!hasNext())
				throw new java.util.NoSuchElementException();
			
			AnyType nextItem=current.data;
			current =current.next;
			okToRemove=true;
			return nextItem;
		}
		
		public void remove(){
			if(modCount!=expectedModCount)
				throw new java.util.ConcurrentModificationException();
			
			if(!okToRemove)
				throw new IllegalStateException();
			MyLinkedList.this.remove(current.prev);
			okToRemove=false;
			//expectedModCount++;
		}

		@Override
		public boolean hasPrevious() {
			// TODO Auto-generated method stub
			return current.prev!=beginMarker;
		}

		@Override
		public AnyType previous() {
			// TODO Auto-generated method stub
			if(modCount!=expectedModCount)
				throw new java.util.ConcurrentModificationException();
			if(!hasPrevious())
				throw new java.util.NoSuchElementException();
			current=current.prev;
			AnyType previousItem=current.data;
			okToRemove=true;
			
			return previousItem;
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
		public void set(AnyType e) {
			// TODO Auto-generated method stub
			if(modCount!=expectedModCount)
				throw new java.util.ConcurrentModificationException();
			MyLinkedList.this.set(current.next, e);
		}

		@Override
		public void add(AnyType e) {
			// TODO Auto-generated method stub
			if(modCount!=expectedModCount)
				throw new java.util.ConcurrentModificationException();
			MyLinkedList.this.addBefore(current.next, e);
		}
	}
}
