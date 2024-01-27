package FileHandaling;
import java.io.*;

//displaying file information
public class FieDemo {

	public static void main(String[] args) {
		 
		File obj=new File("D:\\java\\Pradnya.txt");
		
		if(obj.exists()){
			System.out.println("FileName:"+obj.getName());
			System.out.println("File Location:"+obj.getAbsolutePath());
			System.out.println("File Size:"+obj.length());
			System.out.println("File write:"+obj.canWrite());
			
			
		}
		else{
			System.out.println("File Not   Found");
		}

	}


}