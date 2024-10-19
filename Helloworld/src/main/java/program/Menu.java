package program;

import сhancellery.Pencil;

import java.util.Scanner;


public class Menu {

    public static void createNewPencil() {
        Pencil userPencil = new Pencil(true, "grey", 2.2, "levin");
        PencilContainsEraser.pencilContainsEraserInput();//задает инфу про колпачок. Как привязать к объекту?
        userPencil.setRefillColor(); //задает инфу о цвете грифа
        userPencil.setFirm();
        userPencil.setPrice();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
         do {
             System.out.println("Please enter 1 if you want to create a new pencil, enter 2 if you want to see info about " +
                     "your pencil, enter 0 if you want to exit:\n");
             i = scanner.nextInt();
             if (i == 1) {
                 createNewPencil();
             } else if (i == 2) {
                 File.readFromFile();
             } else if (i == 0) {
                 break;
             }
         }
            while (i == 1 || i == 2 || i == 0);
        }
    }


