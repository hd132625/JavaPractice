package org.dimigo.io;

import java.io.*;

public class FileTest {
	public static void main(String[] args){
		File f1 = new File("files/output3.txt");
		File f2 = new File("files/output5.txt");
		
		try(BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1, false));
			BufferedWriter bw2 = new BufferedWriter(new FileWriter(f2, true));
				BufferedReader br1 = new BufferedReader(new FileReader(f1));
				BufferedReader br2 = new BufferedReader(new FileReader(f2));){
			bw1.write("첫번째 파일!!");
			bw2.write("저녁은 뭘까?");
			bw1.flush();
			bw2.flush();
			String result;
			
			System.out.println("<< 첫번째 파일 내용 >>");
			while((result = br1.readLine())!=null){
				System.out.println(result);
			}
			
			System.out.println("<< 두번째 파일 내용 >>");
			while((result = br2.readLine())!=null){
				System.out.println(result);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
