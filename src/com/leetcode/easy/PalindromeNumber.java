package com.leetcode.easy;

public class PalindromeNumber {
	
	public boolean isPalindrome(int x) {
        if(x < 0)
        	return false;
        
		return x == reverse(x);
    }
	
	public int reverse(int number) {
        boolean isNegative = number < 0;
        int num = Math.abs(number);
        
        int reversed = 0;
        while( num > 0){
            int remainder = num%10;
            num = num/10;
            reversed = reversed*10 + remainder;
        }
        
        return isNegative ? -1*reversed : reversed;
	}

	public static void main(String[] args) {
		PalindromeNumber obj = new PalindromeNumber();
		System.out.println(obj.reverse(321));
	}

}
