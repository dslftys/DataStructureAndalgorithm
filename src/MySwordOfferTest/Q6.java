package MySwordOfferTest;
/*
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
* ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 */
public class Q6 {
	 public static  int minNumberInRotateArray(int [] array) {
		//���ַ�
		int start=0,end=array.length-1;
		int mid=0;
		while(start<=end){
			mid=(start+end)/2;
			if(array[start]<array[mid]){
				start=mid;
			}else if(array[start]==array[mid]){
				start++;
			}
			else {
				end=mid;	
			}
		}
		return array[mid];
	 }
	 public static void main(String[] args) {
		int [] array={3,4,5,1,2};
		System.out.println(minNumberInRotateArray(array));
	}
	 
}
