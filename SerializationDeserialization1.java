package com.mypracticeofcorejava.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDeserialization1 implements Serializable {
	
	int id;
	String name;
	
	public static void main(String[] args) throws Exception {
		SerializationDeserialization1 p=new SerializationDeserialization1();
		p.id=101;
		p.name="Raju";
		System.out.println("=====SERIALIZATION START========");
		FileOutputStream fos=new FileOutputStream("person.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.flush();
		oos.close();
		System.out.println("=====SERIALIZATION END==========");
		System.out.println("=====DESERIALIZATION START========");
		FileInputStream fis=new FileInputStream("person.ser");
		ObjectInputStream ois =new ObjectInputStream(fis);
	    Object object = ois.readObject();
	    SerializationDeserialization1 p1= (SerializationDeserialization1) object;
	    System.out.println("ID:-"+ p.id);
	    System.out.println("Name:-"+p.name);
	    ois.close();
	    System.out.println("=====DESERIALIZATION END==========");
	    
	    
	}
}
