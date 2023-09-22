package com.mypracticeofcorejava.filehandling;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Find common names available in two files

public class FileHandling8 {
	public static void main(String[] args) throws IOException {
		FileReader fr1=new FileReader("name1.txt");
		FileReader fr2=new FileReader("name2.txt");
		BufferedReader br1=new BufferedReader(fr1);
		BufferedReader br2=new BufferedReader(fr2);
		FileWriter fw=new FileWriter("commonNames.txt");
		
		String line2=br2.readLine();
		String [] names=new String[5];
		int i=0;
		while(line2!=null) {
			names[i]=line2;
			line2=br2.readLine();
			i++;
		}
		
		for(String line1=br1.readLine();line1!=null;line1=br1.readLine()) {
			for(int j=0;j<names.length;j++) {
				if(line1.equals(names[j])) {
					fw.write(line1+"\n");
					fw.flush();
					break;
				}
			}
		}
		
		br1.close();
		br2.close();
		fw.close();
	}
}
