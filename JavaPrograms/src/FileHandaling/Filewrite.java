package FileHandaling;

import java.io.*;

public class Filewrite {

	public static void main(String[] args) throws IOException {
		FileWriter f =new FileWriter("D:\\java\\Pradnyan.txt");
		f.write("i am wrinting in file..");
		f.close();
		System.out.println("Writting done successfully..");
		
	}

}
