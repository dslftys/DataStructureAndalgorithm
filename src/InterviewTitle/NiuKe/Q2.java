package InterviewTitle.NiuKe;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//分类个数
public class Q2 {
	public static int classNume(String [] str){
		if(str==null||str.length<=0) return 0;
		if(str.length==1) return 1;
		int count=1;
		Arrays.sort(str,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				String a=String.valueOf(o1.length());
				String b=String.valueOf(o2.length());
				return a.compareTo(b);
			}
		});
		for(int i=1;i<str.length;i++){
			if(!isSameClass(str[i-1], 0, str[i]))count++;
		}
		return count;
	}
	public static boolean isSameClass(String str1,int start,String str2){
		if(str1.length()!=str2.length()||start>=str1.length()) return false;
		if(str1==str2) return true;
		char [] ch=str1.toCharArray();
		for(int i=0;i<ch.length;i++){
			swap(ch, start, i);
		    if(isSameClass(str1, start+1, str2)) return true;
		}
		return false;
	}
	public static void swap(char [] ch,int i,int j){
		char temp=ch[j];
		ch[j]=ch[i];
		ch[i]=temp;
	}
	public static void main(String[] args) {
		//String [] str={"ad","adbde","aad","ad","ad","adbde","aad","a"};
		//
		Scanner in = new Scanner(System.in);
        int num=in.nextInt();
		String []str=new String[num];
         while (in.hasNextInt()) {//注意while处理多个case
              for(int i=0;i<num;i++){
                 str[i]=String.valueOf(in.nextInt());
              }
        }
        System.out.println(classNume(str));
	}
}
