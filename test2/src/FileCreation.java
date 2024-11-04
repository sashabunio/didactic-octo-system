import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {
    public static void createFile() {
        try {
            FileWriter file = new FileWriter("C:\\Users\\Asus\\user_input.txt", false);
            file.close();
        } catch (IOException e) {
            System.out.println("Sorry, can't open this file" + e.getMessage());
        }

    }
}
