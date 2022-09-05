import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File f = new File("file.txt");

        if (!f.exists()){
            System.out.println("The file does not exist");
        }

        if (f.createNewFile()){
            System.out.println("File created!");
        }
        else {
            System.out.println("File could not be created.");
        }
    }
}

