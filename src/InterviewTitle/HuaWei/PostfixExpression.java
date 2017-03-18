package InterviewTitle.HuaWei;

import java.util.ArrayList;
import java.util.Stack;

public class PostfixExpression {
	//比较运算符之间的优先级
     public static  int postfixAdd(String str){
    	 int length=str.length();
    	 Stack<Integer> stack_num=new Stack<>();
    	 int temp=0;
    	 for(int i=0;i<length;i++){
    		 if(!Isoperator(str.charAt(i))) stack_num.push((int)(str.charAt(i)-'0'));
    		 else{
    			 int a=stack_num.pop();
				 int b=stack_num.pop();
    			 switch(str.charAt(i)){
		    			 case '+': temp=b+a;
		    			 			break;
		    			 case '-': temp=b-a;
		    						break;
		    			 case '*': temp=b*a;
		    						break;
		    			 case '/': temp=b/a;	
		    						break;
		    			 default: break;
    			 }
    			 stack_num.push(temp);
    		 }
    	 }
    	 
    	 return stack_num.pop();
    }
    public static boolean Isoperator(char c){
    	if(c=='+'||c=='-'||c=='*'||c=='/') return true;
    	else return false;
    }
   public static void main(String[] args) {
	      System.out.println(postfixAdd("32*5+"));
   }    
}
