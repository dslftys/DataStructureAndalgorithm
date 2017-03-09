package Leetcode;

public class Q29_DivideTwoIntegers {
	 public static int divide(int dividend, int divisor) {
			if(divisor==0||(dividend==Integer.MIN_VALUE&&divisor==-1)) return Integer.MAX_VALUE;
			int result=0;
			int negative=1;
			if(dividend*divisor<0) negative=-1;
			if(dividend<0) dividend=-dividend;
			if(divisor<0) divisor=-divisor;
		    while(dividend>=divisor)
		    {
		        result++;
		    	dividend-=divisor;
		    }
		    return result*negative;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(divide(-100, -2));
	}

}
