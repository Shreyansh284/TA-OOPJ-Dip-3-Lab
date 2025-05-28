import java.io.*;

public class BufferedReaderWriterDemo {
    public static void main(String[] args) {
        String text = "BufferedReader and BufferedWriter demo.";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("demo2.txt"));
            writer.write(text);
            writer.newLine();
            writer.write("Second line of text.");
            writer.close();
            System.out.println("Data written using BufferedWriter.");

            BufferedReader reader = new BufferedReader(new FileReader("demo2.txt"));
            String line;
            System.out.println("Data read using BufferedReader:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
