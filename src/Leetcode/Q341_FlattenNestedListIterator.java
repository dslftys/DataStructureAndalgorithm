package Leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface NestedInteger{
	// @return true if this NestedInteger holds a single integer, rather than a nested list.
	public boolean isInteger();
	// @return the single integer that this NestedInteger holds, if it holds a single integer
	// Return null if this NestedInteger holds a nested list
	public Integer getInteger();

	// @return the nested list that this NestedInteger holds, if it holds a nested list
	// Return null if this NestedInteger holds a single integer
	public List<NestedInteger> getList();
}
public class Q341_FlattenNestedListIterator implements Iterator<Integer>{
	NestedInteger dataInteger;
	List<NestedInteger> nestedList=new ArrayList<NestedInteger>();
	public Q341_FlattenNestedListIterator(List<NestedInteger> nestedList) {
		this.nestedList=nestedList;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
