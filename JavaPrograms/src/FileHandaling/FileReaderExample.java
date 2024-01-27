package FileHandaling;

import java.io.*;

public class FileReaderExample {

    public static void main(String[] args) {
        File f = null;
        try {
            File f1 = new File("D:\\java\\pradnyan.txt");

            FileReader fr = new FileReader(f1);

            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
