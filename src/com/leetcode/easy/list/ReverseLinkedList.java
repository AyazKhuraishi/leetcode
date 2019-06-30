package com.leetcode.easy.list;

public class ReverseLinkedList {

	// 206. Reverse Linked List
	public ListNode reverseList(ListNode head) {
    
		ListNode other = null;
		ListNode temp = null;
		
		while(head != null) {
			temp = head;
			head = head.next;
			temp.next = null;
			
			temp.next = other;
			other = temp;
			
		}
		
		return other;
    }
	
	public static void main(String[] args) {
		ReverseLinkedList obj = new ReverseLinkedList();
		testCase1(obj);
	}
	
	public static void testCase1(ReverseLinkedList obj) {
		ListNode l1 = ListUtils.createList(new int[]{1,2,3, 4, 5});
		ListNode reversed = obj.reverseList(l1);
		
		ListUtils.printList(reversed);
	}

}
