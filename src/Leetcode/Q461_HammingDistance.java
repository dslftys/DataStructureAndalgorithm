package Leetcode;
/***************************
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, calculate the Hamming distance.
Note:
0 ≤ x, y < 2^31.

Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
有多少位是不同的
The above arrows point to positions where the corresponding bits are different.
 */
public class Q461_HammingDistance {
	 public static int hammingDistance(int x, int y) {
		 System.out.println(x^y);
		 System.out.println(x+y);
		 return Integer.bitCount(x^y);
	 }
	 public static void main(String[] args) {
		System.out.println(hammingDistance(2, 4));
		System.out.println(hammingDistance(1, 4));
		System.out.println(hammingDistance(3, 4));
	}
}
