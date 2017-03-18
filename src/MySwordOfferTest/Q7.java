package MySwordOfferTest;

public class Q7 {
	public static  int Fibonacci(int n) {
		if(n==0||n==1) return 1;
		int prepre=1;
		int pre=1,temp;
		for(int i=2;i<=n;i++){
			temp=pre;
			pre=pre+prepre;
			prepre=temp;
		}
		return pre;
    }
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
			System.out.println(Fibonacci(i));
	}
}