import java.io.*;

public class CopyFileDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("source.txt");
            FileWriter fw = new FileWriter("copy.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
                System.out.print((char) ch);
            }
            fr.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
