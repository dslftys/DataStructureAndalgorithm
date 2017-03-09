package Algorithm.Chapter1_Base;

public class ClassicArraysDeal {
	/*
	 * �ж��ַ����Ƿ���һ������
	 */
	public static boolean isPalindrom(String s){
		int N=s.length();
		for(int i=0;i<N/2;i++)
			if(s.charAt(i)!=s.charAt(N-1-i))
				return false;
		return true;
	}
	/*
	 * ���һ���ַ��������е�Ԫ���Ƿ��Ѱ�����ĸ��˳������
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
