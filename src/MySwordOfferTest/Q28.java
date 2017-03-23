package MySwordOfferTest;

import java.util.Arrays;

/*
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
 * 超过数组长度的一半，因此输出2。如果不存在则输出0。
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
