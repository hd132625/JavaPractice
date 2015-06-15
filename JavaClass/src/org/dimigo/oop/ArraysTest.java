package org.dimigo.oop;

import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args){
		String[] src = {"카이", "타오", "수호", "루한", "세훈"};
		
		String[] dest = Arrays.copyOf(src, src.length);
		
		System.out.println(Arrays.toString(dest));
		
		System.out.println(Arrays.equals(dest, src));
		
		Arrays.sort(dest);
		System.out.println(Arrays.toString(dest));
		
		System.out.println(Arrays.binarySearch(dest, "루한"));
		
	}
}
