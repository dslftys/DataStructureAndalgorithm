package MySwordOfferTest;
/*
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，
 * 但14不是，因为它包含因子7。 习惯上我们把1当做是第一个丑数。
 * 求按从小到大的顺序的第N个丑数。
 */
public class Q34 {
	public int GetUglyNumber_Solution(int index) {
		if(index<=1) return index;
		int [] result=new int[index];
		int count=0;
		int i2=0,i3=0,i5=0;
		int tmp=0;
		while(count<index-1){
			tmp=min(result[i2]*2, min(result[i3]*3, result[i5]*5));
			if(tmp==result[i2]*2)i2++;
			if(tmp==result[i3]*3)i3++;
			if(tmp==result[i5]*5)i5++;
			result[count++]=tmp;
		}
		return result[index];
    }
	public static int min(int a,int b){
		return a>=b?b:a;
	}
}
