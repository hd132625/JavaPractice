package org.dimigo.oop;

public class MultiArray {
	public static void main(String[] args){
		//이차원 배열 생성하기
		int[][] intArr = new int[2][3];
		
		//이차원배열 요소값 출력하기
		for(int[] i:intArr){
			for(int j:i){
				System.out.println(j);
			}
		}
		
		
		String[][] strArr = new String[2][];
		strArr[0] = new String[]{"C", "Java", "C++"};
		strArr[1] = new String[]{"PHP", "JSP"};
		/*
		strArr[0][0] = "C";
		strArr[0][1] = "Java";
		strArr[0][2] = "C++";
		
		strArr[1][0] = "PHP";
		strArr[1][1] = "JSP";
		*/
		
		for(int i=0; i<strArr.length; i++){
			for(int j=0; j<strArr[i].length;j++){
				System.out.print(strArr[i][j]+" | ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
