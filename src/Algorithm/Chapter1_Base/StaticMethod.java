package Algorithm.Chapter1_Base;
/*
 * 静态方法由签名（public static 以及函数的返回值，方法名以及一串各种类型的参数）和函数体(即包含在花括号中的代码)组成
 */
public class StaticMethod {
	public static int abs(int x){
		if(x<0) return -x;
		else return x;
	}
	public static double abs(double x){
		if(x<0.0) return -x;
		else return x;
	}
	//判断是否为素数
	public static boolean isPrime(int N){
		if(N<2) return false;
		for(int i=2;i*i<=N;i++){
			if(N%i==0)return false;
		}
		return true;
	}
	//计算平方根
	public static double sqrt(double c){
		if(c<0) return Double.NaN;
		double err=1e-15;
		double t=c;
		while(Math.abs(t-c/t)>err*t)
			t=(c/t+t)/2.0;
		return t;
	}
	//计算直角三角形的斜边
	public static double hypotenuse(double a,double b){
		return Math.sqrt(a*a+b*b);
	}
	//计算调和级数
	public static double H(int n){
		double sum=0;
		for(int i=1;i<=n;i++){
			sum+=1.0/i;
		}
		return sum;
	}
	
}
