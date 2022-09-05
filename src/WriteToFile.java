import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter myWriter = new FileWriter("file.txt");
        try {
            myWriter.write("This is a new line!");
            myWriter.close();
            System.out.println("This has written to file!");
        } catch (IOException e) {
            System.out.println("An error has occurred!");
            e.printStackTrace();
        }

    }
}
