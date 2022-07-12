package BufferedReader;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\dev\\Schulprojekte\\starting with java\\src\\BufferedReader\\test.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        String ausgabe = "Das hier ist ein Testtext";
        writer.write(ausgabe);
        writer.close();
        System.out.println(reader.readLine());
    }
}
