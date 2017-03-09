package Leetcode;

public class Q441_ArrangingCoins {
	public static int arrangeCoins(int n) {
        
		return (int)((-1+Math.sqrt(1+8*n))/2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(arrangeCoins(5));
	}

}
