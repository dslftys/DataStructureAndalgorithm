package StructureAndAlgor.StringDeal;

public class StringDeal2 {
	
	public static int Index(String S,String T,int pos){
		int i=pos;
		int j=1;
		while(i<S.length()&&j<T.length()){
			if(S.charAt(i)==T.charAt(j)){
				i++;
				j++;
			}
			else{
				i=i-j+2;//i�˻ص��ϴ�ƥ����λ����һλ
				j=1;//t��ͷ��ʼ�Ƚ�
			}
		}
		if(j>=T.length()) return i-T.length();
		else return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="studentgoogle",str2="student";
		System.out.println(Index(str1, str2, 0));
	}

}
