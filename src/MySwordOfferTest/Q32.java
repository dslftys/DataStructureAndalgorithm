package MySwordOfferTest;
/*
 * ���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����
 * Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,
 * ���Ƕ��ں�����������û���ˡ�ACMerϣ�����ǰ����,������������ձ黯,
 * ���Ժܿ���������Ǹ�����������1���ֵĴ�����
 */
public class Q32 {
	public int NumberOf1Between1AndN_Solution(int n) {
		int count=0;
		while(n>0){
			String string=String.valueOf(n);
			char [] c=string.toCharArray();
			for(int i=0;i<c.length;i++){
				if(c[i]=='1') count++;
			}
			n--;
		}
		return count;
	}
	public static void main(String[] args) {
		Q32 qqQ32=new Q32();
		System.out.println(qqQ32.NumberOf1Between1AndN_Solution(1100323232));
	}
}
