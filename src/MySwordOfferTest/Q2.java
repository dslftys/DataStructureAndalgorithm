package MySwordOfferTest;

public class Q2 {
	public static String replaceSpace(StringBuffer str) {
	    	int length=str.length();
	    	String string="";
	    	for(int i=0;i<length;i++){
	    		if(str.charAt(i)==' ') string+="%20";
	    		else string+=str.charAt(i);
	    	}
	    	return string;
	}
	public static void main(String[] args) {
		StringBuffer str1=new StringBuffer();
		str1.append("we");
		str1.append(' ');
		str1.append("we");
		str1.append(' ');
		str1.append("we");
		
		System.out.println(replaceSpace(str1));
	}
}
