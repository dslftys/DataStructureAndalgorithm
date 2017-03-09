package Leetcode;
import java.util.*;
/*
Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
For example,   If n = 4 and k = 2, a solution is:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
 */
public class Q77_H_Combinations {
	public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> listlists=new ArrayList<List<Integer>>();
        combine(listlists,new ArrayList<Integer>(),1,n,k);
        return listlists;
    }
	
	public static void combine(List<List<Integer>> combs,List<Integer> comb,int start,int n,int k){
		if(k==0){
			combs.add(new ArrayList<Integer>(comb));
			System.out.println(comb);
			return ;
		}
		for(int i=start;i<=n;i++){
			comb.add(i);
			combine(combs, comb,i+1,n,k-1);
			comb.remove(comb.size()-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(combine(3, 3));
	}
}
