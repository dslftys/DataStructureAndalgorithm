package MySwordOfferTest;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * ����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 */
public class Q29 {
	 public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		 ArrayList<Integer> arrayList=new ArrayList<>();
		 if(input==null||input.length<=0||k>input.length) return arrayList;
		 Arrays.sort(input);
		 for(int i=0;i<k;i++){
			 arrayList.add(input[i]);
	    }
		 return arrayList;
	 }
}
