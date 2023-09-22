package com.mypracticeofcorejava.filehandling;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//find how many characters,words,lines available in the file

public class FileHandling6 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("writingfile.txt");
		BufferedReader br=new BufferedReader(fr);
		
		int noOfChar=0;
		int noOfWords=0;
		int noOflines=0;
		
		String line=br.readLine();
		while(line!=null) {
			noOflines++;

			char[] arr=line.toCharArray();
			noOfChar=noOfChar+arr.length;
			if(!line.isEmpty()) {
				String[] arr2=line.split("[, ]+");
				noOfWords=noOfWords+arr2.length;
			}
			
			line=br.readLine();
		}
		br.close();
		System.out.println(noOfChar);
		System.out.println(noOfWords);
		System.out.println(noOflines);
	}
}
