package MySwordOfferTest;

import java.util.ArrayList;

/*
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵： 1 2 3 4, 5 6 7 8 ,9 10 11 12 ,13 14 15 16
 *  则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Q19 {
	 public static ArrayList<Integer> printMatrix(int [][] matrix) {
	       int col=matrix[0].length-1;
	       int row=matrix.length-1;
	       int rowstart=0,colstart=0;
	       ArrayList<Integer>list=new ArrayList<>();
	       while(col>=colstart&&row>=rowstart){
	    	   list.addAll(printCircle(matrix,rowstart,row,colstart,col));
	    	   col--;
	    	   row--;
	    	   rowstart++;
	    	   colstart++;
	       }
	       return list;
	 }
	 public static ArrayList<Integer>printCircle(int [][]matrix ,int rowstart,int rowend,int colstart,int colend){//打印一圈
		 ArrayList<Integer> circleData=new ArrayList<>();
		 //行
		 for(int i=colstart;i<=colend;i++){
			 circleData.add(matrix[rowstart][i]);
		 }
		 //右列
		 for(int i=rowstart+1;i<=rowend&&rowstart!=rowend;i++){
			 circleData.add(matrix[i][colend]);
		 }
		 //下行
		 for(int i=colend-1;i>=colstart&&rowstart!=rowend;i--){
			 circleData.add(matrix[rowend][i]);
		 }
		 //左侧
		 for(int i=rowend-1;i>=rowstart+1&&colstart!=colend;i--){
			 circleData.add(matrix[i][colstart]);
		 }
		 return circleData;
	 }
	 public static void main(String[] args) {
		int [][] array={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		ArrayList<Integer>list=printMatrix(array);
		
	}
}
