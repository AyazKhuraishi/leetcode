package com.leetcode.easy.list;

public class RemoveDuplicatesSortedList {

	// 83. Remove Duplicates from Sorted List
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null)	return null;
		
		ListNode current = head;
		while(current != null) {
			while(current.next != null && current.val == current.next.val) {
				current.next = current.next.next;
			}
			current = current.next;
		}
		
		return head;
    }

	public static void main(String[] args) {
		RemoveDuplicatesSortedList obj = new RemoveDuplicatesSortedList();
		testCase1(obj);
	}
	
	public static void testCase1(RemoveDuplicatesSortedList obj) {
		ListNode l1 = ListUtils.createList(new int[]{1,1,2,3,3,3,3,4});
		ListNode solution = obj.deleteDuplicates(l1);
		
		ListUtils.printList(solution);
	}

}
