package org.akshaytech.application;

/*import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DateMettl {
	public static void main(String[] args) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("E://Jspiders//FileHandling//src//file.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		        System.out.println(line);
		    }
		    String everything = sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		String line;
		while((line = br.readLine()) != null)
		{
		    System.out.println(line);
		}
		finally {
		    try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class DateMettl{
	
	public static void main(String[] input)
	{
		String fname;
		Scanner scan = new Scanner(System.in);

		/* enter filename with extension to open and read its content */

		System.out.print("Enter File Name to Open (with extension like file.txt) : ");
		fname = scan.nextLine();

		/* this will reference only one line at a time */

		String line = null;
		try
		{
			/* FileReader reads text files in the default encoding */
			FileReader fileReader = new FileReader(fname);

			/* always wrap the FileReader in BufferedReader */
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while((line = bufferedReader.readLine()) != null)
			{
				System.out.println(line);
				if(bufferedReader.readLine(fileReader))>=48 || bufferedReader.readLine(fileReader)<=57 || bufferedReader.readLine(fileReader)==45){
					
				}
			}
			List<Integer> integers = new ArrayList<>();
			while (scan.hasNext()) {
			    if (scan.hasNextInt()) {
			        integers.add(scan.nextInt());
			        System.out.println(integers);
			    } else {
			        scan.next();
			    }
			}

			/* always close the file after use */
			bufferedReader.close();
		}
		catch(IOException ex)
		{
			System.out.println("Error reading file named '" + fname + "'");
		}
	}
}