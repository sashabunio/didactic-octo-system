package program;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class File {

    public static void createFile() {
        try {
            FileWriter file = new FileWriter("C:\\Users\\Asus\\user_input.txt", false);
        } catch (IOException e) {
            System.out.println("Sorry, can't open this file" + e.getMessage());
        }
    }

        public static void readFromFile () {
            java.io.File file = new java.io.File("C:\\Users\\Asus\\user_input.txt");
            ArrayList<String> fileContents = new ArrayList<>();
            try {
                Scanner fileScanner = new Scanner(file);
                while (fileScanner.hasNext()) {
                    fileContents.add(fileScanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
            fileContents.forEach(System.out::println);
        }
    }

