package org.dimigo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class SaveImageFromUrl {
	public static void main(String[] args){
		String imageURL = "http://static.zerochan.net/Kousaka.Kirino.full.1822010.jpg";
		try {
			URL url = new URL(imageURL);
			try(InputStream is = url.openStream()){
				OutputStream os = new FileOutputStream("files/kirino.jpg");
				byte[] buf = new byte[100];
				int result;
				while((result = is.read(buf))!=-1){
					os.write(buf, 0, result);
				}
				os.close();
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				
			}
		} 
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
