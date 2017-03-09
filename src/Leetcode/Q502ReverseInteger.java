package Leetcode;

public class Q502ReverseInteger {

	 public int reverse(int x) {
	        long result=0;
	        while(x!=0)
	        {
	        	result=result*10+x%10;
	            x=x/10;
	        }
	        if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE) return 0;
	        else  return (int)result;
	   }
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Q502ReverseInteger reverseInteger=new Q502ReverseInteger();
		System.out.println(reverseInteger.reverse(-2147483648));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}

}
