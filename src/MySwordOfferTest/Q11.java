package MySwordOfferTest;
/*
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 */
public class Q11 {
	public static int NumberOf1(int n) {
		 String string=Integer.toBinaryString(n).toString();
		 int b=0;
		 for(int i=0;i<string.length();i++){
			 if(string.charAt(i)=='1') b++;
		 }
		 return b;
    }
	public static void main(String[] args) {
		System.out.println(NumberOf1(15));
	}
}
/*
public int NumberOf1(int n) {
int count = 0;
while(n!= 0){
    count++;
    n = n & (n - 1);
 }
return count;
}
*/
/*
public int NumberOf1(int n) {
int t=0;
    char[]ch=Integer.toBinaryString(n).toCharArray();
    for(int i=0;i<ch.length;i++){
        if(ch[i]=='1'){
            t++;
        }
    }
    return t;
}*/