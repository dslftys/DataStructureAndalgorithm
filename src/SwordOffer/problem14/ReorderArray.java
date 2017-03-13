package SwordOffer.problem14;

import SwordOffer.node.*;
/*
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，偶数位于后半部分
 */
public class ReorderArray {
	void ReorderOddEven(int []a){
		int begin=0,end=a.length-1;
		int temp;
		while(begin<end){
			if(a[begin]%2==0&&a[end]%2==1){//找到一对奇数和偶数，调换
				temp=a[begin];
				a[begin]=a[end];
				a[end]=temp;
				begin++;
				end--;
			}
			else if(a[begin]%2==0&&a[end]%2==0){
				end--;
			}else if(a[begin]%2==1&&a[end]%2==1){
				begin++;
			}else{
				begin++;
				end--;
			}
		}
	}
}
