package com.leetcode.easy.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	// 217. Contains Duplicate
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> seen = new HashSet<>();
		for(int num : nums) {
			if(seen.contains(num)){
				return true;	
			} else {
				seen.add(num);
			}
		}
		return false;
	}

}
