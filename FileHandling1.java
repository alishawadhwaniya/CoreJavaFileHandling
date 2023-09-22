package com.mypracticeofcorejava.filehandling;

import java.io.IOException;
import java.io.File;

public class FileHandling1 {
	public static void main(String[] args) throws IOException{
		File f=new File("ashokit.txt");
		boolean fstatus = f.createNewFile();
		System.out.println(fstatus);
		
		File f1=new File("java.txt");
		boolean f1status = f1.createNewFile();
		System.out.println(f1status);
		
		File f2=new File("mywork");
		boolean f2status = f2.mkdir();
		System.out.println(f2status);
		
		File f3=new File("data");
		f3.mkdir();
		
		File f4=new File(f3,"test.txt");
		f4.createNewFile();
	}
}
