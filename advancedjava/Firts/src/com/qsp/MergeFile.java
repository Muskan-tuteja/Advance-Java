package com.qsp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MergeFile {

    public static void main(String[] args) throws IOException {

    	
        FileOutputStream f1 = new FileOutputStream("M1.txt");
        
        f1.write("HELLO".getBytes());
        
        f1.close();

        FileOutputStream f2 = new FileOutputStream("M2.txt");
        
        f2.write(" WORLD".getBytes());
        
        f2.close();

        
        System.out.println("M1 exists: " + new File("M1.txt").exists());
        
        
        
        System.out.println("M2 exists: " + new File("M2.txt").exists());

        
        FileInputStream f4 = new FileInputStream("M1.txt");
        
        
        FileInputStream f5 = new FileInputStream("M2.txt");

        
        FileOutputStream f3 = new FileOutputStream("M3.txt");

        int i;

        
        System.out.print("Reading M1: ");
        while ((i = f4.read()) != -1) {
            System.out.print((char) i); 
            f3.write(i);
        }

        

        
        System.out.print("\nReading M2: ");
        while ((i = f5.read()) != -1) {
            System.out.print((char) i);
            f3.write(i);
        }

        
        f3.close();
        f4.close();
        f5.close();

    }
}

