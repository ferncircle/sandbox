package com.ferncircle.sandbox;

import java.util.Arrays;

public class ArraySort {

	public int[] sort(int[] a){
		if(a==null || a.length<2)
			return a;
		
		Arrays.sort(a);
		
		return a;
	}
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(new ArraySort().sort(new int[]{4,4,6,23,12,5,45,1,23,5,2,23})));

	}

}
