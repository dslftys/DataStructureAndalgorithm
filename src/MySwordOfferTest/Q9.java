package MySwordOfferTest;
/*
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
 * �����������һ��n����̨���ܹ��ж�����������
 */
public class Q9 {
	public static int JumpFloorII(int target) {
		if(target<=0) return 0;
		else if(target==1) return 1;
		return 2*JumpFloorII(target-1);
    }
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
			System.out.println(JumpFloorII(i));
	}
}
