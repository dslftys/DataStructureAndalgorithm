package SwordOffer;

public class Interview4 {
	void ReplaceBlank(char string[],int length){
		if(string==null||length<=0) return ;
		/*
		 * originalLength为字符串string的实际长度
		 */
		int originalLength=0;
		int numberOfBlank=0;
		int i=0;
		while(string[i]!='\0')//字符串的结尾都是以\0结尾
		{
			++originalLength;
			if(string[i]==' '){
				++numberOfBlank;
			}
			++i;
		}
		/*
		 * new length为把空格替换成%20之后的长度，空格代替一个
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
