package SwordOffer.problem3;


public class FindInPartiallySortedMatrix {
	public boolean Find(int [][] a,int data){
		if(a==null||a.length<0) return false;
		int row=0;
		int column=a[0].length-1;
		while(row<a.length&&column>=0){
			if(a[row][column]==data) return true;
			else if(a[row][column]<data){
				row++;
			}else{
				column--;
			}
		}
		return false;
	}
}
