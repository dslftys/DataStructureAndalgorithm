package MySwordOfferTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则
 * 打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。 
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
