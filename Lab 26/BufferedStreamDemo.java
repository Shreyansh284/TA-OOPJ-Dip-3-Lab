import java.io.*;

public class BufferedStreamDemo {
    public static void main(String[] args) {
        String data = "BufferedInputStream and BufferedOutputStream demo.";

        try {
            // Writing using BufferedOutputStream
            FileOutputStream fos = new FileOutputStream("demo3.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(data.getBytes());
            bos.close();
            System.out.println("Data written using BufferedOutputStream.");

            // Reading using BufferedInputStream
            FileInputStream fis = new FileInputStream("demo3.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int ch;
            System.out.print("Data read using BufferedInputStream: ");
            while ((ch = bis.read()) != -1) {
                System.out.print((char) ch);
            }
            bis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
