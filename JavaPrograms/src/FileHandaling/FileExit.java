package FileHandaling;

import java.io.File;

public class FileExit {

	public static void main(String[] args) {
		File f=new File("D:\\java\\Pradnyan.txt");
				if(f.exists()) {
					System.out.println(""+f.getName());
					System.out.println(""+f.length());
					System.out.println(""+f.getAbsolutePath());
					System.out.println(""+f.canRead());
					System.out.println(""+f.list());
					System.out.println(""+f.canWrite());
				}

	}

}
