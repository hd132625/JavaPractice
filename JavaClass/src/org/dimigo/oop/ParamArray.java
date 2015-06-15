package org.dimigo.oop;

public class ParamArray {
		public static void main(String[] args){
			int[] intArr = {1, 2, 3, 4, 5};
			String[] strArr = {"홍길동", "홍길서", "홍길남", "홍길북", "홍길중"};
			ParamArray arr = new ParamArray();
			arr.plus(intArr);
			for(int value: intArr){
				System.out.println(value);
			}
			arr.changLastName(strArr);
			for(String value:strArr){
				System.out.println(value);
			}
	}
		
		private void plus(int[] arr){
			for(int i=0; i<arr.length; i++){
				arr[i]++;
			}
		}
		
		private void changLastName(String[] strArr){
			for(int i = 0; i<strArr.length; i++){
				strArr[i] = "김"+strArr[i].substring(1, 3);
			}
		}
}
