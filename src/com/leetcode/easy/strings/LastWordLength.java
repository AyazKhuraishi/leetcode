package com.leetcode.easy.strings;

//58. Length of Last Word
public class LastWordLength {
	
	public int lengthOfLastWord(String s) {
		if(s == null || s.length()  == 0) {
			return 0;
		}
		
		int index = s.length()-1;
		
		while(index >= 0 && s.charAt(index)  == ' ') {
			index--;
		}
		
		if(index < 0) {
			return 0;
		}
		
		int len = 0;
		while(index >= 0) {
			if(s.charAt(index) == ' ') {
				break;
			}
			len++;
			index--;
		}
		
		return len;
    }
	
	public static void main(String [] args) {
		LastWordLength obj = new LastWordLength();

		System.out.println(obj.lengthOfLastWord(null));
		System.out.println(obj.lengthOfLastWord(""));
		System.out.println(obj.lengthOfLastWord("                "));

		System.out.println(obj.lengthOfLastWord("World"));
		System.out.println(obj.lengthOfLastWord("Hello World"));
		System.out.println(obj.lengthOfLastWord("Hello            World              "));

	}
	

}
