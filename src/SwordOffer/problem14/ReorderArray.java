package SwordOffer.problem14;

import SwordOffer.node.*;
/*
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ����������λ�������ǰ�벿�֣�ż��λ�ں�벿��
 */
public class ReorderArray {
	void ReorderOddEven(int []a){
		int begin=0,end=a.length-1;
		int temp;
		while(begin<end){
			if(a[begin]%2==0&&a[end]%2==1){//�ҵ�һ��������ż��������
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
