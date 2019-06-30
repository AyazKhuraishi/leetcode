package com.leetcode.easy.list;

// 21 Merge Two Sorted Lists
public class MergeSortedList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)	return null;
        if(l1 == null && l2 != null)	return l2;
        if(l1 != null && l2 == null)	return l1;
        
        ListNode head = null;
        ListNode tail = null;
        ListNode smaller = null;
        
        while( l1 != null && l2 != null) {
        	if(l1.val > l2.val) {
        		smaller = l2;
        		l2 = l2.next;
        	}else {
        		smaller = l1;
        		l1 = l1.next;
        	}
        	smaller.next =null;
        	
        	if(head == null) {
        		head = smaller;
        		tail = smaller;
        	}else {
        		tail.next = smaller;
        		tail = tail.next;
        	}
        }
        
        if(l1 != null)	tail.next = l1;
        if(l2 != null)	tail.next = l2;
        
        return head;
    }
	
	public static void main(String[] args) {
		MergeSortedList obj = new MergeSortedList();
		testCase1(obj);
	}
	
	public static void testCase1(MergeSortedList obj) {
		ListNode l1 = ListUtils.createList(new int[]{1,2,4});
		ListNode l2 = ListUtils.createList(new int[]{1,3,4});
		ListNode merged = obj.mergeTwoLists(l1, l2);
		
		ListUtils.printList(merged);
	}

}
