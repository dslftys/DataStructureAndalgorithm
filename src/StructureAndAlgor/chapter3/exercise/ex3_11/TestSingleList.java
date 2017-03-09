package StructureAndAlgor.chapter3.exercise.ex3_11;

public class TestSingleList {
	public static void main(String[] args) {
		SingleList list=new SingleList();
		list.add(1);
		list.add(10);
		list.add(32);
		list.print();
		System.out.println(list.contains(10));
	}
}
