package com.mypracticeofcorejava.filehandling;


import java.io.FileReader;
import java.io.IOException;

public class FileHandling4 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("writingfile.txt");
		int i=fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
		fr.close();
	}
}
