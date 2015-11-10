package org.dimigo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInOutStream {
	public static void main(String[] args) {
		try(InputStream is = new FileInputStream(".\\files\\miku.png")){
			OutputStream os = new FileOutputStream(".\\files\\miku_copy.png");
			int result;
			
			/*while((result = is.read()) != -1){
				os.write(result);
			}*/
			
			byte buf[] = new byte[100];
			while((result = is.read(buf)) !=  -1){
				os.write(buf, 0, result);
			}
			os.close();
			System.out.println("파일 생성 완료!!");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
