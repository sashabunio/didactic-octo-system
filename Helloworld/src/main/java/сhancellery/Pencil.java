package сhancellery;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Pencil extends Chancellery {
    private boolean containsEraser;
    private String refillColor;

    public Pencil(boolean containsEraser, String refillColor, double price, String firm) {
        this.containsEraser = containsEraser;
        this.refillColor = refillColor;
        this.price = price;
        this.firm = firm;
    }


    public boolean getContainsEraser() {
        return containsEraser;
    }

    public void setContainEraser() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i == 1) {
            this.containsEraser = true;
        } else if (i == 2) {
            this.containsEraser = false;
        } else {
                System.out.println("Please enter 1 or 2!");
                int userInput = scanner.nextInt();
            }
    }

    public static boolean negativeTest (int a, int b) {
        boolean d = a < b;
        return d;
    }

    public static double positiveTest (int a, int b) {
        int c = (a * b)/1000;
        return c;
    }

    public String getRefillColor () {
        return refillColor;
    }


    public String setRefillColor () {
        System.out.println("Please enter your pencil color:\n");
            return refillColor = new Scanner(System.in).nextLine();
    }
}



