package com.leetcode.easy.strings;

public class LongestCommonPrefix {
	
	public String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0)
			return "";
		
		char [] first = strs[0].toCharArray();
		StringBuilder prefix = new StringBuilder();
		
		for(int charIndex = 0; charIndex < first.length; charIndex++) {
			char ch = first[charIndex];
			
			for(int wordIndex = 1; wordIndex < strs.length; wordIndex++) {
				if(strs[wordIndex].length() <= charIndex
						|| strs[wordIndex].charAt(charIndex) != ch) {
					return prefix.toString();
				}				
			}
			prefix.append(ch);
		}
		
		return prefix.toString();
	}
	
	public static void main(String[] args) {
		LongestCommonPrefix obj = new LongestCommonPrefix();
		/*testCase1(obj);
		testCase2(obj);
		testCase3(obj);
		testCase4(obj);*/
		testCase5(obj);
	}
	
	public static void testCase1(LongestCommonPrefix obj) {
		String [] arr = new String[] {"flower","flow","flight"};
		System.out.println(obj.longestCommonPrefix(arr));
	}
	
	public static void testCase2(LongestCommonPrefix obj) {
		String [] arr = new String[] {"dog","racecar","car"};
		System.out.println(obj.longestCommonPrefix(arr));
	}
	
	public static void testCase3(LongestCommonPrefix obj) {
		String [] arr = new String[] {"flower","flow","flora"};
		System.out.println(obj.longestCommonPrefix(arr));
	}
	
	public static void testCase4(LongestCommonPrefix obj) {
		String [] arr = new String[] {"aa","a"};
		System.out.println(obj.longestCommonPrefix(arr));
	}
	
	public static void testCase5(LongestCommonPrefix obj) {
		String [] arr = new String[] {"a"};
		System.out.println(obj.longestCommonPrefix(arr));
	}
}
