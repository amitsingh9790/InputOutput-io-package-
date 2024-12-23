package com.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIOStreamEx {
	public static void writeObj() {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("objectdata.dat"))){
			Student s = new Student(1,"Raj","CSE");
			out.writeObject(s);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void readObj() {
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp.data"))){
			Employee e = (Employee)in.readObject();
			System.out.println(e);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String []args) {
//		writeObj();
		readObj();
		
	}
	

}
