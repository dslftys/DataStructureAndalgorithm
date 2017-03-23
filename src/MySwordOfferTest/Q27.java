package MySwordOfferTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С����������ַ���abc,��
 * ��ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba�� 
 */
public class Q27 {
	public ArrayList<String> Permutation(String str) {
		ArrayList<String> aList=new ArrayList<>();
	    if(str.length()<=0||str=="") return aList; 
	    char [] strchar=str.toCharArray();
	    TreeSet<String> result=new TreeSet<>();
	    Permutation(strchar, 0, result);
	    aList.addAll(result);
		return aList;
    }
	public static void Permutation(char [] strchar,int begin,TreeSet<String> result){
		if(strchar==null||strchar.length<=0||begin>=strchar.length) return ;
		//result.add(String.valueOf(strchar));
		for(int i=0;i<strchar.length;i++){
			result.add(String.valueOf(strchar));
			swap(strchar, begin, i);
			Permutation(strchar, begin+1, result);
		}
	}
	public static void swap(char [] strchar,int i,int j){
		char temp;
		temp=strchar[i];
		strchar[i]=strchar[j];
		strchar[j]=temp;
	}
	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<>();
		Q27 q27=new Q27();
		alist=q27.Permutation("aab");
		Iterator<String> iterator=alist.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}
