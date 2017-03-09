package Leetcode;

public class Q8Atoi {
	 public int myAtoi(String str) {
			if(str==null||str.length()<1) return 0;
			//trim white spaces
			str=str.trim();
			char flag='+';
			int i=0;
			if(str.charAt(0)=='-')
			{
				flag='-';
				i++;
			}
			else if(str.charAt(0)=='+') i++;
			
			long result=0;
			while(str.length()>i&&str.charAt(i)>='0'&&str.charAt(i)<='9'&&result<=Integer.MAX_VALUE)
			{
				result=result*10+(str.charAt(i)-'0');
				i++;
			}
			if(flag=='-') result=-result;
			if(result>=Integer.MAX_VALUE)
				result=Integer.MAX_VALUE;
		    else if(result<=Integer.MIN_VALUE)
		        result=Integer.MIN_VALUE;
			return (int) result;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q8Atoi q8=new Q8Atoi();
		System.out.println(q8.myAtoi("9223372036854775809"));
		System.out.println(Long.MAX_VALUE);
	}
}
