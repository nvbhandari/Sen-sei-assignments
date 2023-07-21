package Practice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) throws IOException {
        write();
        read();
    }
    public static void write() {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\Naveen Bhandariwar\\Desktop\\Poem.txt");
            try {
                fw.write("I am your pumpkin pumpkin,\n hello Hunny Bunny! \n I am your Dumpling Dumpling \n, hello Hunny Bunny..!");
            } finally {
                fw.close();
                System.out.println("File Written Successfully..!");
            }
        } catch (IOException e) {
            System.out.println("Exception Handled..!");
        }
    }

    public static void read() {
        try {
            FileReader fr = new FileReader("C:\\Users\\Naveen Bhandariwar\\Desktop\\Poem.txt");
          //  StringBuffer sb =  new StringBuffer(fe);
            try {
                int i;
                while ((i = fr.read()) != -1) {
                    System.out.print((char) i);
                }
            } finally {
                fr.close();
                System.out.println("File Closed..!");
            }
        } catch (IOException e) {
            System.out.println("Exception Handled..!");
        }


    }

}
