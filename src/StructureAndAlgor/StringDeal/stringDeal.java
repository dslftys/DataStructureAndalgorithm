package StructureAndAlgor.StringDeal;

public class stringDeal {
	public static String concat(String s,String t){
		int maxnum=100;
		String lString=null;
		if(s.length()+t.length()<maxnum){
			lString=s+t;
		}
		if(s.length()+t.length()>maxnum&&s.length()<maxnum)
		{
			lString=s+t.substring(0,maxnum-s.length());
		}
		if(s.length()>maxnum){
			lString=s.substring(0,maxnum);
		}
		return lString;
	}
	public static int Index_bf(String s,String t){
		int i=0,j=0;
		while((i<s.length())&&(j<t.length())){
			if(s.substring(i,i+1).equals(t.substring(j,j+1))){
				i++;j++;
			}else {
				i=i-j+1;
				j=0;
			}
		}
		if(j>=t.length()) return i-t.length()+1;
		else return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
