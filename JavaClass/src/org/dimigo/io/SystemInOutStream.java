package org.dimigo.io;

import java.io.*;

public class SystemInOutStream {
	public static void main(String[] args){
		try(PrintStream os = System.out;
			InputStream is = System.in;
			Reader reader = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(reader);){
			
			os.print("문자열을 입력하세요 =>");
			int result;
			/*while((result = is.read()) != '\n'){
				os.print(result + " : "+(char)result+"\n");
			}*/
			/*while((result = reader.read())!='\n'){
				os.print(result + " : "+(char)result+"\n");
			}*/
			os.print(br.readLine());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
