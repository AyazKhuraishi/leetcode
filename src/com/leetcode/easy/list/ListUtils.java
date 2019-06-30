package com.leetcode.easy.list;

public class ListUtils {

	public static ListNode createList(int [] arr) {
		if(arr == null || arr.length == 0)
			return null;
		
		ListNode head = null;
		for(int index = arr.length-1; index >=0 ; index--) {
			ListNode node = new ListNode(arr[index]);
			node.next = head;
			head = node;
		}
		
		return head;
	}
	
	public static void printList(ListNode head) {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.val);
			if(current.next != null) {
				System.out.print(" -> ");
			}
			current = current.next;
		}
	}
	
}
