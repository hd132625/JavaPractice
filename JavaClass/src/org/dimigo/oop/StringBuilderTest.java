package org.dimigo.oop;

public class StringBuilderTest {
	public static void main(String[] args){
		String str = "디미고 ";
		str+="2학년 ";
		str+="6반 ";
		str+="25번 ";
		str+="전상현";
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder();
		sb.append("디미고 ");
		sb.append("2학년 ");
		sb.append("6반 ");
		sb.append("25번 ");
		sb.append("전상현 ");
		System.out.println(sb.toString());
		
		String sb1 = new StringBuilder().append("디미고  ").append("2학년 ").append("6반 ").append("25번 ").append("전상현 ").toString();
		System.out.println(sb1);
		
		
		
		
		long start = System.currentTimeMillis();
		StringBuilder test1 = new StringBuilder("abc");
		for(int i = 0; i<100000; i++){
			test1.append("def");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		
		
	}
}
