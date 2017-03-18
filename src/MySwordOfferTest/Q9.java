package MySwordOfferTest;
/*
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Q9 {
	public static int JumpFloorII(int target) {
		if(target<=0) return 0;
		else if(target==1) return 1;
		return 2*JumpFloorII(target-1);
    }
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
			System.out.println(JumpFloorII(i));
	}
}
