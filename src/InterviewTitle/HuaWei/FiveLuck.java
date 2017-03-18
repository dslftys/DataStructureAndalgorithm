package InterviewTitle.HuaWei;
class Test<T>{

	
}
public class FiveLuck {
    public static  int fiveLuck(String []str){
    	int a=0;
    	int temp=9;
    	for(int i=0;i<str.length;i++){
    		a+=Integer.parseInt(str[i]);
    	}
    	while(a!=0){
    		if(temp>a%10)temp=a%10;
    		a=a/10;
    	}
    	return temp;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []strings={"10111","11011","00000","10011","01100","01100"};
		System.out.println(fiveLuck(strings));
	}

}
