package StructureAndAlgor.chapter3.exercise.ex3_12;
import java.util.*;

public class SingleListStored {
	private Node<Comparable> head;
	private int theSize;
	SingleListStored(){
		init();
	}
	boolean add(Comparable x){
		if(contains(x))
			return false;
		else{
			Node<Comparable> p=head.next;
			Node<Comparable> trailer=head.next;
			while(p!=null&&p.data.compareTo(x)<0){
				trailer=p;
				p=p.next;
			}
			trailer.next=new Node<Comparable>(x);
			trailer.next.next=p;
			theSize++;
		}
		return true;
	}
	boolean remove(Object x){
		if(!contains(x)) return false;
		else{
			Node<Comparable> p=head.next;
			Node<Comparable> trailer=head;
			while(!p.data.equals(x)){
				trailer=p;
				p=p.next;
			}
			trailer.next=p.next;
			theSize--;
		}
		return true;
	}
	int size(){
		return theSize;
	}
	void print(){
		Node<Comparable> p=head.next;
		while(p!=null){
			System.out.println(p.data+" ");
			p=p.next;
		}
		System.out.println();
	}
	boolean contains(Object x){
		Node<Comparable> p=head.next;
		while(p!=null&& p.data.compareTo(x)<=0){
			if(x.equals(p.data))
				return true;
			else
				p=p.next;
		}
		return false;
	}
	void init(){
		theSize=0;
		head=new Node<Comparable>();
		head.next=null;
	}
	private class Node<Comparable>{
		Node(){
			this(null,null);
		}
		Node(Comparable d){
			this(d,null);
		}
		Node(Comparable d, Node n) {
			// TODO Auto-generated constructor stub
			data=d;
			next=n;
		}
		Comparable data;
		Node next;
	}
}
