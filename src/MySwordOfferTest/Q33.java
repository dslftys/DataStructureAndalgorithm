package MySwordOfferTest;

import java.util.Arrays;
import java.util.Comparator;

/*
 * ����һ�����������飬����������������ƴ�������ų�һ������
 * ��ӡ��ƴ�ӳ���������������С��һ����������������{3��32��321}��
 * ���ӡ���������������ųɵ���С����Ϊ321323��
 */
/*
 * 3 32 
 * "332">"323"
 * 3>32
 */
public class Q33 {
	public String PrintMinNumber(int [] numbers) {
		if(numbers==null||numbers.length<=0) return "";
		int len=numbers.length;
		String []str=new String[len];
		String string="";
		for(int i=0;i<len;i++){
			str[i]=String.valueOf(numbers[i]);
		}
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				String c1=o1+o2;
				String c2=o2+o1;
				return c1.compareTo(c2);
			}
		});
		for(int i=0;i<len;i++){
			string+=str[i];
		}
		return string;
    }
	
	public static void main(String[] args) {
		int []numbers={3,32,321};
		Q33 qq=new Q33();
		System.out.println(qq.PrintMinNumber(numbers));
	}
}
