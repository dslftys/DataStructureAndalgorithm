package MySwordOfferTest;
/*
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ��λ������ĺ�벿��
 * ������֤������������ż����ż��֮������λ�ò��䡣
 */
public class Q13 {
	public void reOrderArray(int [] array) {
        int pre=0,end=array.length-1;
        int temp;
        while(pre<end){
        	if(array[pre]%2==0&&array[end]%2==1){
        		temp=array[pre];
        		array[pre]=array[end];
        		array[end]=temp;
        		pre++;
        		end--;
        	}else if(array[pre]%2==1&&array[end]%2==1){
        		end--;
        	}else if(array[pre]%2==0&&array[end]%2==0){
        		pre++;
        	}else{
        		pre++;
        		end--;
        	}
        }
    }
	//������ż����
	public static void ExchangeEvoOdd(int [] array) {
		int temp;
		int slow=0,fast=1;
		while(fast<array.length){
			if(array[slow]%2==0&&array[fast]%2==1){
				if(fast-slow==1){
					temp=array[fast];
					array[fast]=array[slow];
					array[slow]=temp;
				}else{
					temp=array[fast];
					for(int i=fast;i>slow;i--){
						array[i]=array[i-1];
					}
					array[slow]=temp;
				}
				slow++;
				fast++;
				
			}else if(array[slow]%2==0&&array[fast]%2==0){
				fast++;
			}else{
				slow++;
				fast++;
			}
		}
	}
	public static void main(String[] args) {
		int []array={1,2,3,4,5,6,7,8,9,10};
		ExchangeEvoOdd(array);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}
