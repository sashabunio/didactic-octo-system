import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileCreation.createFile();



        File file = new File("C:\\Users\\Asus\\my_new_file.txt");
        ArrayList<String> fileContents = new ArrayList<>();
        try {
        Scanner fileScanner = new Scanner (file);
        while (fileScanner.hasNext()) {
            fileContents.add(fileScanner.nextLine());
        }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found" + e.getMessage());
        }
        fileContents.forEach(System.out::println);
    }
}