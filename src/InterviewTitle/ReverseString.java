package InterviewTitle;

public class ReverseString {
	public static String reverse(String originStr)
	{
		if(originStr==null||originStr.length()==1)
			return originStr;
		return reverse(originStr.substring(1))+originStr.charAt(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="string";
		System.out.println(reverse(str));
	}

}
