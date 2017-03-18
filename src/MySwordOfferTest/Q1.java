package MySwordOfferTest;
/*
 * 二维数组查找
 */
public class Q1 {
	public static boolean Find(int target, int [][] array) {
		int row=array.length;
		int column=array[0].length;
		int i=0,j=column-1;
		while(i<row&&j>=0){
			if(target==array[i][j]) return true;
			else if(target>array[i][j]) i++;
			else j--;
		}
		return false;
    }
	public static void main(String[] args) {
		int [][]array={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		
		System.out.println(Find(7,array));
	}
}
