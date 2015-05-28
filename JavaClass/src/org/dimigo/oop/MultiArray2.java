package org.dimigo.oop;

public class MultiArray2 {
	public static void main(String[] args){
		int[][] intArr = {
				{1, 2, 3},
				{4, 5, 6, 7},
				{8, 9,  10, 11, 12}
		};
		
		for(int[] i:intArr){
			for(int j:i){
				System.out.print(j + "|");
			}
			System.out.print('\n');
		}
	}
}
