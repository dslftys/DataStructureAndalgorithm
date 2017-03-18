package MySwordOfferTest;
/*
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Q12 {
	public double Power(double base, int exponent) throws Exception {
		double result=1;
        if(base==0&&exponent<=0){
        	throw new Exception();
        }
        if(exponent>0){
        	for(int i=0;i<exponent;i++){
        		result*=base;
        	}
        }else if(exponent<0){
        	for(int i=0;i<Math.abs(exponent);i++){
        		result*=1.0/base;
        	}
        }
        else result=1;
        return result;
	}
}
