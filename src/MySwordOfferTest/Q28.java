package MySwordOfferTest;

import java.util.Arrays;

/*
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}����������2�������г�����5�Σ�
 * �������鳤�ȵ�һ�룬������2����������������0��
 */
public class Q28 {
	public static int MoreThanHalfNum_Solution(int [] array) {
        if(array==null||array.length<=0) return 0;
        if(array.length==1) return array[0];
        Arrays.sort(array);
        int length=array.length,k=1;
        for(int i=1;i<length;i++){
        	if(array[i-1]==array[i]){
        		k++;
        		if(k>length/2) return array[i-1];
        	}
        	else k=1;
        }
        return 0;
    }
	public static void main(String[] args) {
		int []a={1};
		System.out.println(MoreThanHalfNum_Solution(a));
	}
}
