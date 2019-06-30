package com.leetcode.easy.list;

public class PalindromeLinkedList {
	
	//234. Palindrome Linked List
	public boolean isPalindrome(ListNode head) {
		ListNode reversed = reverseList(head);
		while(head != null && reversed != null) {
			if(head.val != reversed.val) {
				return false;
			}
			head = head.next;
			reversed = reversed.next;
		}
		
		return true;
    }

	public ListNode reverseList(ListNode head) {   
		ListNode other = null;
		ListNode current = head;
		
		while(current != null) {
			ListNode node = new ListNode(current.val);
			node.next = other;
			other = node;
			
			current = current.next;
		}
		
		return other;
    }

	
	public static void main(String[] args) {
		PalindromeLinkedList obj = new PalindromeLinkedList();
		testCase1(obj);
	}
	
	public static void testCase1(PalindromeLinkedList obj) {
		ListNode list = ListUtils.createList(new int[]{1,1,2,1});
		System.out.println(obj.isPalindrome(list));
	}

}
