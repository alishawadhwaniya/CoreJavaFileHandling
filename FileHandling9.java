package com.mypracticeofcorejava.filehandling;

import java.io.PrintWriter;

//Print data on console without using System.out.println:-

public class FileHandling9 {
	public static void main(String[] args) {
		PrintWriter pw=new PrintWriter(System.out);
		pw.print("Hello World");
		pw.flush();
		pw.close();
	}
}
