package Leetcode;
import java.util.*;
/*
 * For example, given n = 3, a solution set is:
 * [
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
  ]
 */
public class Q22_H_GenerateParentheses {
	public static List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
		return list;
    }
	
	public static void backtrack(List<String> list,String str,int open,int close,int max){
		if(str.length()==max*2){
			list.add(str);
			str="";
			return ;
		}
		System.out.println("go1:"+str+"open:"+open+",close="+close);
		if(open<max){
			backtrack(list, str+"(", open+1, close, max);
			System.out.println("open<max:"+str);
		}
		System.out.println("go2:"+str+"open:"+open+",close="+close);
		if(close<open){
			backtrack(list, str+")", open, close+1, max);
			System.out.println("close<open:"+str);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateParenthesis(3));
	}

}
