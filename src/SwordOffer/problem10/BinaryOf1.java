package SwordOffer.problem10;

public class BinaryOf1 {
	/*
	 * ����һ��������������������Ʊ�ʾ�еģ��ĸ���
	 * ���ۣ���һ��������ȥ���ٺ�ԭ�����룬�ͻ���������ұ�һ������ɣ�
	 */
	public int numberOf1(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = (n-1) & n;
		}
		
		return count;
	}
}
