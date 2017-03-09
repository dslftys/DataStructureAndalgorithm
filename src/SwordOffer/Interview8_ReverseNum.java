package SwordOffer;

public class Interview8_ReverseNum {
	public static  int Min(int []number,int length) throws Exception{
		if(number==null||length<=0) 
			throw new Exception();
		
		int index1=0;
		int index2=0;
		
		int indexMid=index1;
		while(number[index1]>=number[index2]){
			if(index2-index1==1){
				indexMid=index2;
				break;
			}
			indexMid=(index1+index2)/2;
			if(number[indexMid]>=number[index1])
				index1=indexMid;
			else if(number[indexMid]<=number[index2])
				index2=indexMid;
		}
		return number[indexMid];
	}
	
	public static void main(String[] args) throws Exception {
		int []data={3,4,2,1,4,2,8};
		System.err.println(Min(data, data.length));
		
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
	}
}
