package com.mypracticeofcorejava.filehandling;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//read data from 2 files and write it in 3rd file

public class FileHandling7 {
	public static void main(String[] args) throws IOException {
		FileReader fr1=new FileReader("java.txt");
		FileReader fr2=new FileReader("writingfile.txt");
		BufferedReader br1=new BufferedReader(fr1);
		BufferedReader br2=new BufferedReader(fr2);
		FileWriter fw=new FileWriter("twoFilesDataAppend.txt");
		String line1=br1.readLine();
		while(line1!=null) {
			fw.write(line1);
			fw.write("\n");
			fw.flush();
			line1=br1.readLine();
		}
		String line2=br2.readLine();
		while(line2!=null) {
			fw.write(line2);
			fw.write("\n");
			fw.flush();
			line2=br2.readLine();
		}
		br1.close();
		br2.close();
		fw.close();
	}
}
