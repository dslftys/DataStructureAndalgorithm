package StructureAndAlgor.chapter3.exercise.ex3_11;
import java.util.*;
public class SingleList {
	SingleList(){
		init();
	}
	boolean add(Object x){
		if(contains(x))
			return false;
		else{
			Node<Object> p=new Node<Object>(x);
			p.next=head.next;
			head.next=p;
			theSize++;
		}
		return true;
	}
	boolean remove(Object x){
		if(!contains(x)) return false;
		else{
			Node<Object> p=head.next;
			Node<Object> trailer=head;
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
		Node<Object> p=head.next;
		while(p!=null){
			System.out.println(p.data+" ");
			p=p.next;
		}
		System.out.println();
	}
	boolean contains(Object x){
		Node<Object> p=head.next;
		while(p!=null){
			if(x.equals(p.data))
				return true;
			else
				p=p.next;
		}
		return false;
	}
	void init(){
		theSize=0;
		head=new Node<Object>();
		head.next=null;
	}
	private Node<Object> head;
	private int theSize;
	private class Node<Object>{
		Object data;
		Node next;
		Node(){
			this(null,null);
		}
		Node(Object d){
			this(d,null);
		}
		Node(Object d, Node n) {
			// TODO Auto-generated constructor stub
			data=d;
			next=n;
		}
	}
}
