package SwordOffer;

import java.util.ArrayList;
import java.util.List;

public class ArraySplit {
	public static <T> List<List<T>> spliceArrays(List<T>datas,int splitSize){
		if(datas==null||splitSize<1) return null;
		int totalSize=datas.size();
		//获取要拆分子数组的个数
		int count=(totalSize%splitSize==0)?(totalSize/splitSize):(totalSize/splitSize+1);
		System.out.println("split count = " +count);
		List<List<T>> rows = new ArrayList();
		for (int i = 0;i < count;i ++) {
		     int index = i * splitSize;
		     List<T> cols = new ArrayList();
		     int j = 0;
		     while (j < splitSize && index < totalSize) {
		    	  cols.add(datas.get(index++));
		          j ++;
		     }
		     rows.add(cols);
		}
		 return rows;
	}
	
	private <T> List<List<T>> spliceArrays2(List<T> datas, int splitSize) {
	    if (datas == null || splitSize < 1) {
	        return  null;
	    }
	    int totalSize = datas.size();
	    int count = (totalSize % splitSize == 0) ?
	            (totalSize / splitSize) : (totalSize/splitSize+1);
	 
	    List<List<T>> rows = new ArrayList<>();
	 
	    for (int i = 0; i < count;i++) {
	 
	        List<T> cols = datas.subList(i * splitSize,
	                (i == count - 1) ? totalSize : splitSize * (i + 1));
	        rows.add(cols);
	        System.out.println(cols);
	    }
	    return rows;
	}
}
