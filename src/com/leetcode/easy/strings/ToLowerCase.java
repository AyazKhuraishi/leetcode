package com.leetcode.easy.strings;

public class ToLowerCase {

	// 709. To Lower Case
	public String toLowerCase(String str) {
		if(str == null || "".equals(str))
			return str;
		
		StringBuilder sb = new StringBuilder();
		
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			
			if(ch >= 65 && ch <= 90) {
				sb.append((char)(ch + 32));
			}else {
				sb.append(ch);
			}
		}
		
		return sb.toString();
    }
	
	public static void main(String[] args) {
		ToLowerCase obj = new ToLowerCase();
		
		System.out.println(obj.toLowerCase(null));
		System.out.println(obj.toLowerCase(""));
		System.out.println(obj.toLowerCase("     "));
		System.out.println(obj.toLowerCase("  Hello World "));
		System.out.println(obj.toLowerCase("Hello"));
		System.out.println(obj.toLowerCase("Hello @ World !!!"));
		System.out.println(obj.toLowerCase("A to Z and a to z"));
	}

}
