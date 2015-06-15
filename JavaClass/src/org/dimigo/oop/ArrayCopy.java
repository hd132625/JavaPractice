package org.dimigo.oop;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ArrayCopy {
	public static void main(String[] args){
		int[] intSrc = {1, 2, 3, 4, 5};
		int[] intDest = new int[10];
		String[] strSrc = {"카이", "루한", "디오", "타오"};
		String[] strDest = new String[10];
		/*for(int i=0; i<intSrc.length; i++){
			intDest[i] = intSrc[i];
		}*/
		System.arraycopy(intSrc, 0, intDest, 0, intSrc.length);
		System.arraycopy(strSrc, 0, strDest, 0, strSrc.length);
		for(int value:intDest){
			System.out.println(value);
		}
		for(String value:strDest){
			System.out.println(value);
		}
	}
}
