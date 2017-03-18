package MySwordOfferTest;
/*
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分
 * ，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
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
	//左右奇偶交换
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
