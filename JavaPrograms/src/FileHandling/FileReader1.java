package FileHandling;

import java.io.*;

public class FileReader1 {

    public static void main(String[] args) {
        FileReader fr = null;

        try {
            fr = new FileReader("D:\\java\\pradnyan.txt");

            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
