package InterviewTitle;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class AliBaBa {
	/** ������������������ʵ����ĿҪ��Ĺ��� **/
	 /** ��Ȼ����Ҳ���Բ��������ģ����������ȫ�����Լ����뷨�� ^-^  **/
	    static boolean resolve(int[] A) {
	    	ArrayList<Integer>list=new ArrayList<Integer>();
	    	list=resolveTwo(A,1,1);
	    	if(list.size()==1) return false;
	    	else{
	    	}
	    	return false;
	    }
	    
	    public static  ArrayList<Integer> resolveTwo(int [] A,int start,int end){
	    	long diff=0;
	    	int left=start,right=end;
	    	ArrayList<Integer>list=new ArrayList<Integer>();
	    	
	    	while(left+1<right)
	    	{
	    		diff+=A[right]-A[left];
	    		if(diff<0){
	    			right--;
	    			
	    		}else if(diff>0){
	    			left++;
	    		}else{
	    			left++;
	    			right--;
	    		}
	    	}
	    	if((left+1>=right)&&(diff==0)){
	    		list.add(left+1);//λ��
	    		list.add(1);
	    	}
	    	else {
	    		list.add(0);
	    	}
	    	return list;
	    }
	    
	    public static void main(String[] args){
	        ArrayList<Integer> inputs = new ArrayList<Integer>();
	        Scanner in = new Scanner(System.in);
	        String line = in.nextLine();
	        while(line != null && !line.isEmpty()) {
	            int value = Integer.parseInt(line.trim());
	            if(value == 0) break;
	            inputs.add(value);
	            line = in.nextLine();
	        }
	        int[] A = new int[inputs.size()];
	        for(int i=0; i<inputs.size(); i++) {
	            A[i] = inputs.get(i).intValue();
	        }
	        Boolean res = resolve(A);

	        System.out.println(String.valueOf(res));
	    }
}
