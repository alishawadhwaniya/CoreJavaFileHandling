package com.mypracticeofcorejava.filehandling;

import java.io.IOException;
import java.io.PrintWriter;

//PrintWriter to write data in file
//we can use both printwriter or filewriter to write data in file...the diff is printwriter will send everything at a time and the filewriter will write character by character

public class FileHandling10 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("f1.txt");
		pw.write("Hi f1 txt");
		pw.flush();
		pw.close();
	}
}
