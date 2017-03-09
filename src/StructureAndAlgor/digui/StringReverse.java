package StructureAndAlgor.digui;

public class StringReverse {
	public static String StringRe(String str){
		if(str.length()<=1) return str;
		return StringRe(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		String string="dewhudiwhduiwe.";
		System.out.println(StringRe(string));
	}
}
