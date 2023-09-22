package com.mypracticeofcorejava.filehandling;

import java.io.File;

public class FileHandling2 {
	public static void main(String[] args) {
		File f1=new File("E:\\alishabooks");
		File f2=new File(f1,"test");
		f2.mkdir();
		String[] list=f1.list();
		for(String name:list) {
			File f3=new File(f1,name);
			if(f3.isFile()) {
				System.out.println("File::"+f3.getName());
			}
			if(f3.isDirectory()) {
				System.out.println("Directory::"+f3.getName());
			}
		}
	}
}
