package Leetcode;

import java.util.Stack;
/******************************
 * The brackets must close in the correct order, 
 * "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * @author Victor
 */
public class Q20_ValidParentheses {
	  public static boolean isValid(String s) {
		  Stack<Character> stack=new Stack<Character>();
		  for(char c:s.toCharArray()){
			  if(c=='(') stack.push(')');
			  else if(c=='{') stack.push('}');
			  else if(c=='[') stack.push(']');
			  else if(stack.isEmpty()||stack.pop()!=c)
				  return false;
		  }
		  return stack.isEmpty();
	  }
	  public static void main(String[] args) {
		   String string="[]{[]}";
		   System.out.println(isValid(string));
	}
}
