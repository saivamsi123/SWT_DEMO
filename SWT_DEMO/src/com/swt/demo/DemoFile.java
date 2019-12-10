package com.swt.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class DemoFile{
	
	static Scanner sc = new Scanner(System.in);
	public static void write(Object[] arr) throws FileNotFoundException, IOException
	{
		File file = new File("file.txt");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(arr);
		System.out.println("File contents added successfully.....");
		oos.close();
	}
	
	public static void read() throws FileNotFoundException, IOException, ClassNotFoundException {
		Object[] arr = null;
		File file = new File("file.txt");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		arr = (Object[])ois.readObject();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("File contents reading successfully.....");
		ois.close();
	}
	public static boolean writeContentsToFile() throws IOException{
		boolean flag = false;
		String str = "I'm a File";
		try {
			File file = new File("file.txt");
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(str);
			oos.close();
			flag = true;
			return flag;
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}
		flag = false;
		return flag;
	}
	
	public static String readContentsFromFile() throws IOException, ClassNotFoundException{
		String str = null;
		try {
			File file = new File("file.txt");
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			str = (String) ois.readObject();
			ois.close();
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}
		return str;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, IOException 
	{
		UserDAO userDao = new UserDAO();
//		try {
//			if(writeContentsToFile())
//			{
//				System.out.println("File created successfully....");
//			}
//			else
//			{
//				System.out.println("File not created");
//			}
//		}catch(Exception ex)
//		{
//			ex.printStackTrace();
//		}
//		System.out.println("Reading contents from file.......");
//		System.out.println(readContentsFromFile());
     System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("Enter name: ");
		String name = sc.next();
		//sc.nextLine();
		System.out.println("Enter dept: ");
		String dept = sc.next();
		
		userDao.setId(id);
		userDao.setName(name);
		userDao.setType(dept);
		
		Object[] arr = new Object[10];
		for(int i = 0;i < arr.length;i++)
		{
			arr[i] = new UserDAO(userDao.getId(), userDao.getName(), userDao.getType());
		}
		write(arr);
		read();
	}
}
