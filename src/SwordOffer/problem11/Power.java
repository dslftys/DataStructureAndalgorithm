package SwordOffer.problem11;
/*
 * ʵ�ֺ���
 */
public class Power {
	double Power(double base,int exponent){
		if(exponent==1) return base;
		return base*Power(base, exponent-1);
	}
	double Power2(double base,int exponent) throws Exception{
		double res=0.0;
		if(equal(base,0.0)&&exponent<0){
			throw new Exception("error");
		}
		if(exponent==0) return 1.0;
		if(exponent<0){
			res=powerWithExponent(1.0/base, -exponent);
		}else{
			res=powerWithExponent(base, exponent);
		}
		return res;
	}
	private double powerWithExponent(double base, int exponent) {
		double res = 1.0;
		for (int i = 1; i <= exponent; i++) {
			res = res * base;
		}
		return res;
	}
	private boolean equal(double num1, double num2) {
		if (Math.abs(num1- num2) < 0.0000001) {
			return true;
		} else {
			return false;
		}
	}
}
