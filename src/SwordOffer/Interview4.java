package SwordOffer;

public class Interview4 {
	void ReplaceBlank(char string[],int length){
		if(string==null||length<=0) return ;
		/*
		 * originalLengthΪ�ַ���string��ʵ�ʳ���
		 */
		int originalLength=0;
		int numberOfBlank=0;
		int i=0;
		while(string[i]!='\0')//�ַ����Ľ�β������\0��β
		{
			++originalLength;
			if(string[i]==' '){
				++numberOfBlank;
			}
			++i;
		}
		/*
		 * new lengthΪ�ѿո��滻��%20֮��ĳ��ȣ��ո����һ��
		 */
		int newLength=originalLength+numberOfBlank*2;
		if(newLength>length) return ;
		int indexOfOriginal=originalLength;
		int indexOfNew=newLength;
		while(indexOfOriginal>=0&&indexOfNew>indexOfOriginal){
			if(string[indexOfOriginal]==' '){
				string[indexOfNew--]='0';
				string[indexOfNew--]='2';
				string[indexOfNew--]='%';
			}
			else{
				string[indexOfNew--]=string[indexOfOriginal];
			}
			--indexOfOriginal;
		}
	}
}
