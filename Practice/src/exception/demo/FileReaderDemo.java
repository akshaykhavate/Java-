package exception.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		System.out.println("App start");
		File f = new File("result.txt");
		FileReader reader = null;
		try {
			reader = new FileReader(f);
		} catch (FileNotFoundException e) {
			System.out.println("File not present");
			e.printStackTrace();
		}
		if(reader!=null){
			try {
				reader.read();
			} catch (IOException e) {
				System.out.println("Some issue while reading the data");
				e.printStackTrace();
			}
			System.out.println("App ends");
		}
	}

}
