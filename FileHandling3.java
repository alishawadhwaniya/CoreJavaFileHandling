package com.mypracticeofcorejava.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandling3 {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("writingfile.txt");
		fw.write("Hello,How are you?");
		fw.write("\n");
		fw.write("checking file writing");
		fw.flush();
		fw.close();
	}
}
