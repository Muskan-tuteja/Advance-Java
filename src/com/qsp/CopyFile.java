package com.qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) throws IOException {
    	
    	
    	FileOutputStream f1 = new FileOutputStream("C1.txt");
        String data = "Hello World";
        f1.write(data.getBytes());
        f1.close();

        FileInputStream fis = new FileInputStream("C1.txt");
        
        FileOutputStream fos = new FileOutputStream("C2.txt");

        int i;

        while ((i = fis.read()) != -1) {
            fos.write(i);
        }

        fis.close();
        fos.close();

    }
}
