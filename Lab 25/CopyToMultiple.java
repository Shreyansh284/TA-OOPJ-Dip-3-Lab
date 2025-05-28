import java.io.*;

public class CopyToMultiple {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("original.txt");
            FileWriter fw1 = new FileWriter("copy1.txt");
            FileWriter fw2 = new FileWriter("copy2.txt");

            int ch;
            while ((ch = fr.read()) != -1) {
                fw1.write(ch);
                fw2.write(ch);
            }

            fr.close();
            fw1.close();
            fw2.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
