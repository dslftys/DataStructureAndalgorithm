package MySwordOfferTest;
/*
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class Q23 {
	public boolean VerifySquenceOfBST(int [] sequence) {//左小于右
	     if(sequence==null||sequence.length<=0) return false;
	        return  isTreeBst(sequence, 0 , sequence.length-1);
	    }
		public static  boolean isTreeBst(int []sequence,int start,int end){
			if(start>=end) return true;
			int i=start;
			for(;i<end;i++){
				if(sequence[i]>sequence[end]) break;//找到右子树位置
			}
			for(int j=i;j<end;j++){
				if(sequence[j]<sequence[end]) return false;
			}
			return isTreeBst(sequence, i, end-1)&&isTreeBst(sequence, start, i-1);
		}
}
