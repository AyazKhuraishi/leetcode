package com.leetcode.easy.stack;

import java.util.Stack;

public class ValidParentheses {

	public boolean isValid(String s) {
		if(s == null || s.length() == 0)
			return true;
		
		Stack<Character> stack = new Stack<>();
		char [] arr = s.toCharArray();
		
		for(char ch : arr) {
			if(ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			}else {
				if(stack.empty()) {
					return false;
				}
				
				char top = stack.pop();
				if((ch == ')' && top != '(') 
						|| (ch == ']' && top != '[') 
						|| (ch == '}' && top != '{')) {
					return false;
				}
			}
		}
		return stack.empty();
		
    }
	
	public static void main(String[] args) {
		ValidParentheses obj = new ValidParentheses();
		System.out.println(obj.isValid("()"));
		System.out.println(obj.isValid("()[]{}"));
		System.out.println(obj.isValid("(]"));
		System.out.println(obj.isValid("([)]"));
		System.out.println(obj.isValid("{[]}"));
	}

}
