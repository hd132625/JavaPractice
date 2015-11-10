package org.dimigo.io;

import java.util.*;
import java.io.*;

public class BufferedReaderWriter {
	public static void main(String[] args){
		try(Reader reader = new FileReader("files/miku.png");
			Writer writer = new FileWriter("files/miku2.png");
				BufferedReader br = new BufferedReader(reader);
				BufferedWriter bw = new BufferedWriter(writer);){
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
