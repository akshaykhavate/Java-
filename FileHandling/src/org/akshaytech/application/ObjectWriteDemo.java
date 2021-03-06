package org.akshaytech.application;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteDemo {
	public static void main(String[] args) {
		UserInfo ui = new UserInfo();
		ui.fname = "Akshay";
		ui.lname = "Khavate";
		ui.contact = 9980040686l;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("userinfo.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ui);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fos!=null)
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}	
		}
	}
}
