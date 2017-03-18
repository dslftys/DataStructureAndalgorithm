package MySwordOfferTest;
/*
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Q8 {
	public int JumpFloor(int target) {
		if(target==1||target==2) return target;
		else return JumpFloor(target-1)+JumpFloor(target-2);//n阶等于退回一阶和退回两阶的和
    }
}
