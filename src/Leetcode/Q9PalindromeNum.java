package Leetcode;

public class Q9PalindromeNum {
    public boolean isPalindrome(int x) {
        int ReverseNum=0;
        int origindata=x;
        while(x!=0)
        {
        	ReverseNum=ReverseNum*10+x%10;
        	x=x/10;
        }
        return (ReverseNum==origindata);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q9PalindromeNum q9=new Q9PalindromeNum();
		System.out.println(q9.isPalindrome(-2147447412));
		System.out.println(Integer.MIN_VALUE);
	}

}
