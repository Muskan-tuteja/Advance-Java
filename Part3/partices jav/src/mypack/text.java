package mypack;

import java.io.*;

public class text {
	public static void check()throws IOException{
		throw new IOException("File error");
	}
	public static void main(String [] args) {
		try {
			check();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	
	}

}
