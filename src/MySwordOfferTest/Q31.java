package MySwordOfferTest;
/*
 * HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ��
 * ��������鿪����,���ַ�����:�ڹ��ϵ�һάģʽʶ����,
 * ������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý����
 * ����,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�
 * ����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
 * ��᲻�ᱻ������ס��(�������ĳ���������1)
 */
public class Q31 {
	public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length<=0) return 0;
        int sum=array[0],tempsum=array[0];
        for(int i=0;i<array.length;i++){
        	tempsum=(tempsum<0)?array[i]:tempsum+array[i];
        	sum=tempsum>sum?tempsum:sum;
        }
		return sum;
    }
}

/*
//��������
public int FindGreatestSumOfSubArray(int[] array) {
	  if(array.length<=0) return 0;
	  HashSet<Integer> hashSet=new 
	  for(int i)
}

*/