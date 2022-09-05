import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File f = new File("file.txt");
        // It would be better to check with the user
        // before deleting the file.

        if (f.delete()) {
            System.out.println("Deleted the file: " + f.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }

    }
}
