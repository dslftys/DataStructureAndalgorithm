package StructureAndAlgor.StringDeal;
/*
 * KMP的改进算法
 */
public class KMP2 {
	public static void  get_nextval(String T,int [] nextval){
		int i,j;
		i=1;
		j=0;
		nextval[1]=0;
		while(i<T.length()){
			if(j==0||T.charAt(i)==T.charAt(j)){
				i++;
				j++;
				if(T.charAt(i)!=T.charAt(j))
					nextval[i]=j;
				else nextval[i]=nextval[j];
			}
			else j=nextval[j];//若字符不相同时，则j值回溯
		}
	}
	
	public static int Index_KMP(String S,String T,int pos){
		int i=pos;
		int j=1;
		int [] next=new int[255];
		get_nextval(T, next);
		while(i<S.length()&&j<=T.length()){
			if(j==0||S.charAt(i)==T.charAt(j)){
				i++;
				j++;
			}
			else {
				j=next[j];
			}
		}
		if(j>T.length()) return i-T.length();
		else return 0;
	}
}
