package MySwordOfferTest;
/*
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�����������
 */
public class Q8 {
	public int JumpFloor(int target) {
		if(target==1||target==2) return target;
		else return JumpFloor(target-1)+JumpFloor(target-2);//n�׵����˻�һ�׺��˻����׵ĺ�
    }
}
