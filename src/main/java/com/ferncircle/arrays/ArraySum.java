package com.ferncircle.sandbox;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

public class ArraySum {


	public int[] twoSum2(int[] nums, int target){

		if(nums.length < 2){
			throw new RuntimeException("Length of Array should be more than 1");
		}
		Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();

		int[] result = new int[2];
		for(int i=0; i< nums.length; i++){
			m1.put(nums[i], i);
		}	

		for(int i =0; i< nums.length; i++){
			int diff = target - nums[i];
			if (m1.containsKey(diff) && i!= m1.get(diff)){
				result[0] = i;
				result[1] = m1.get(diff);
				break;
			}
		}

		return result;
	}


	public static void main(String[] args){
		ArraySum s1 = new ArraySum();

		//Testcase 1
		int[] t1 = {2,4,6,8};		
		int[] expected = {0,2};
		int target = 8;	

		Assert.assertTrue(Arrays.equals(expected, s1.twoSum2(t1, target)));

		//Testcase 2
		int[] t2 = {19,9,15,2,6,1,4,3};		
		int[] expected2 = {4,7};
		int target2 = 9;	

		Assert.assertTrue(Arrays.equals(expected2, s1.twoSum2(t2, target2)));		


		//Testcase 3
		int[] t3 = {3,2,4};		
		int[] expected3 = {1,2};
		int target3 = 6;	

		Assert.assertTrue(Arrays.equals(expected3, s1.twoSum2(t3, target3)));
		System.out.println(Arrays.toString(s1.twoSum2(t3, target3)));

		//Testcase 4
		int[] t4 = {3,2,4,0};		
		int[] expected4 = {0,3};
		int target4 = 3;	

		Assert.assertTrue(Arrays.equals(expected4, s1.twoSum2(t4, target4)));
		System.out.println(Arrays.toString(s1.twoSum2(t4, target4)));
		System.out.println("Test successfull");


	}
}
