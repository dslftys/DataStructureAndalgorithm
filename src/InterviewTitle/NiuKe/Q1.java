package InterviewTitle.NiuKe;

import java.util.Scanner;

public class Q1 {
	public boolean IsBalancedData(int data){
		if(data<10) return false;
		String str=String.valueOf(data);
		char [] c=str.toCharArray();
		for(int i=1;i<c.length-1;i++){
			if(MultiData(c, i)) return true;
		}
	    return false;
		
	}
	public static boolean MultiData(char [] ch,int n){
		if(ch==null||ch.length<n) return false;
		int left=1,right=1;
		//ср╡Ю
		for(int i=0;i<n;i++){
			right *=ch[i]-'0';
		}
		//ср╡Ю
		for(int j=n;j<ch.length;j++){
			left*=ch[j]-'0';
		}
		return left==right?true:false;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Q1 qq=new Q1();
		
		System.out.println(qq.IsBalancedData(in.nextInt()));
	}
}
