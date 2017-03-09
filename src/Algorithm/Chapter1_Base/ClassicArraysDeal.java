package Algorithm.Chapter1_Base;

public class ClassicArraysDeal {
	/*
	 * 判断字符串是否是一条回文
	 */
	public static boolean isPalindrom(String s){
		int N=s.length();
		for(int i=0;i<N/2;i++)
			if(s.charAt(i)!=s.charAt(N-1-i))
				return false;
		return true;
	}
	/*
	 * 检查一个字符串数组中的元素是否已按照字母表顺序排列
	 */
	public boolean isSorted(String[] a){
		for(int i=1;i<a.length;i++){
			if(a[i-1].compareTo(a[i])>0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String s="abccba";
		System.out.println(isPalindrom(s));
	}
}
