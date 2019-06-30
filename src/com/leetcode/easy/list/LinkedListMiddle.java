package com.leetcode.easy.list;

public class LinkedListMiddle {

	// 876. Middle of the Linked List
	public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null) {
        	slow = slow.next;
        	fast = fast.next.next;
        }
        
        return slow;
    }
	
	
	public static void main(String[] args) {
		LinkedListMiddle obj = new LinkedListMiddle();
		//testCase1(obj);
		//testCase2(obj);
		//testCase3(obj);
		testCase4(obj);
	}
	
	public static void testCase1(LinkedListMiddle obj) {
		ListNode list = ListUtils.createList(new int[]{1,2,3,4,5});
		ListNode solution = obj.middleNode(list);
		
		ListUtils.printList(solution);
	}
	
	public static void testCase2(LinkedListMiddle obj) {
		ListNode list = ListUtils.createList(new int[]{1,2,3,4,5,6});
		ListNode solution = obj.middleNode(list);
		
		ListUtils.printList(solution);
	}
	
	public static void testCase3(LinkedListMiddle obj) {
		ListNode list = ListUtils.createList(new int[]{});
		ListNode solution = obj.middleNode(list);
		
		ListUtils.printList(solution);
	}
	
	public static void testCase4(LinkedListMiddle obj) {
		ListNode list = ListUtils.createList(new int[]{1});
		ListNode solution = obj.middleNode(list);
		
		ListUtils.printList(solution);
	}

}
