package SwordOffer.problem4;

public class ReplaceBlank {
	public String ReplaceBlank(String str){
		if(str==""||str.length()<=0) return null;
		StringBuffer sBuffer=new StringBuffer();
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				sBuffer.append('%');
				sBuffer.append('2');
				sBuffer.append('0');
			}else sBuffer.append(str.charAt(i));
		}
		return sBuffer.toString();
	}
	public String ReplaceByRegex(String str){
		if(str==""||str.length()<=0) return null;
		return str.replaceAll(" ", "%20");
	}
}
