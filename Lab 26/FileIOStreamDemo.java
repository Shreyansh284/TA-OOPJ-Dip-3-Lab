import java.io.*;

public class FileIOStreamDemo {
    public static void main(String[] args) {
        String data = "This is a demo of FileOutputStream and FileInputStream.";

        try {
            FileOutputStream fos = new FileOutputStream("demo1.txt");
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Data written to file using FileOutputStream.");

            FileInputStream fis = new FileInputStream("demo1.txt");
            int ch;
            System.out.print("Data read from file: ");
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
