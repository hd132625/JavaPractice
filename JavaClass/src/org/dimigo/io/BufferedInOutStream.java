package org.dimigo.io;

import java.io.*;

public class BufferedInOutStream {
	public static void main(String[] args){
		try(InputStream is = new FileInputStream(".\\files\\miku.png");
			OutputStream os = new FileOutputStream(".\\files\\miku_copy.png");
				BufferedInputStream bis = new BufferedInputStream(is);
				BufferedOutputStream bos = new BufferedOutputStream(os);){
				int result;
				
				long start = System.currentTimeMillis();
				while((result = is.read())!=-1){
					os.write(result);
				}
				
				long end = System.currentTimeMillis();
				System.out.println("걸린 시간 : "+(end-start));
				
				start = System.currentTimeMillis();
				while((result = bis.read())!=-1){
					bos.write(result);
				}
				end = System.currentTimeMillis();
				
				System.out.println("걸린 시간 : "+(end-start));
				
			}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
