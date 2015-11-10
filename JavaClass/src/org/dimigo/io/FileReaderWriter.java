package org.dimigo.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileReaderWriter {
	public static void main(String[] args){
		try(Reader reader = new FileReader("files\\input.txt")){
			Writer writer = new FileWriter("files\\input_2.txt");
			char[] buf = new char[100];
			int result;
			
			while((result = reader.read(buf))!=-1){
				writer.write(buf, 0, result);
			}
			writer.close();
			System.out.println("파일 복사 완료!!");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
