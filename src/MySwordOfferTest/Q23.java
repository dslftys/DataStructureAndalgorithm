package MySwordOfferTest;
/*
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ����������Yes,�������No���������������������������ֶ�������ͬ��
 */
public class Q23 {
	public boolean VerifySquenceOfBST(int [] sequence) {//��С����
	     if(sequence==null||sequence.length<=0) return false;
	        return  isTreeBst(sequence, 0 , sequence.length-1);
	    }
		public static  boolean isTreeBst(int []sequence,int start,int end){
			if(start>=end) return true;
			int i=start;
			for(;i<end;i++){
				if(sequence[i]>sequence[end]) break;//�ҵ�������λ��
			}
			for(int j=i;j<end;j++){
				if(sequence[j]<sequence[end]) return false;
			}
			return isTreeBst(sequence, i, end-1)&&isTreeBst(sequence, start, i-1);
		}
}
