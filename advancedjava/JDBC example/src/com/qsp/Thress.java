package com.qsp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Thress {

	public static void main(String[] args) throws IOException {
		File a = new File("a.txt");
		a.createNewFile();
		
		
		File a1 = new File("a1.txt");
		a1.createNewFile();
		
		FileInputStream fi = new FileInputStream(a1);
		char i =(char) fi.read();
		while (i!=-1) {
			System.out.println((char)i);
			i=(char) fi.read();
			
		}
		System.out.println(i);
		
		File a2 = new File("a2.txt");
		a2.createNewFile();
		
		
//		FileOutputStream m1 = new FileOutputStream(a,true);
//		
//		String s = "world";
//		m1.write(s.getBytes());		
//		m1.flush();
		
		

	}

}
