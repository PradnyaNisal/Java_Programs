package FileHandaling;
import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\java\\Pradnyan.txt");
		
		if(f.createNewFile()) {
			
			System.out.println("File is Created....!!!!!!");
	
		}
		else
			System.out.println("file not found");
	}

}
