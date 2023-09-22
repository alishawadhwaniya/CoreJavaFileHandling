package com.mypracticeofcorejava.filehandling;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling5 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("writingfile.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
		fr.close();
	}
}
