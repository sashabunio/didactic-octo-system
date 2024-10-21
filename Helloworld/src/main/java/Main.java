import program.File;
import program.Menu;
import сhancellery.*;
import сhancellery.pen.Corpus;
import сhancellery.pen.Pen;
import сhancellery.pen.Refill;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");

//        int myAge = 25;
//        char myGender = 'F';
//        double myHeight = 1.64;
//        boolean myNameIsAliaksandra = true;
//        String myName = "Aliaksanda";
//        String mySurname = "Shabunio";
//
//        String infoAboutMe = String.format("My age: %s , My gender: %s , My name: %s , My surname: %s , My Height : %f ",
//                myAge, myGender, myName, mySurname, myHeight);
//        System.out.println(infoAboutMe);
//        System.out.println("My Gender is " + myGender + " , My name is " + myName + " , My Surname is "
//                + mySurname + " , My Age is " + myAge + " , My Height is " + myHeight);
//        StringBuffer buffer = new StringBuffer();
//        buffer.append("My Name is: ");
//        buffer.append(myName);
//        buffer.append("\nMy Surname is: ");
//        buffer.append(mySurname);
//        buffer.append("\nMy Age is: ");
//        buffer.append(myAge);
//        buffer.append("\nMy Height is: ");
//        buffer.append(myHeight);
//        buffer.append("\nMy Gender is: ");
//        buffer.append(myGender);
//        System.out.println(buffer);
//        System.out.println("My name is Aliaksandra: " + myNameIsAliaksandra); // jar file запустился, но в консоли последняя строка эта. Почему?
//
//        Scanner scanner = new Scanner(System.in);
//        String myString = scanner.nextLine();
//
//        int stringLength = myString.length();
//        int length = 10;
//        boolean myStringLengthComparison = stringLength == length;
//        System.out.println(myStringLengthComparison);
//        boolean stringisEmpty = myString.isEmpty();
//        System.out.println(stringisEmpty);
//        char charNr8 = myString.charAt(8);
//        System.out.println(charNr8);
//        String stringforComparison = "my new string";
//        boolean stringsareEqual = myString.equals(stringforComparison);
//        boolean stringsareEqualCaseSensetive = myString.equalsIgnoreCase(stringforComparison);
//        System.out.println(stringsareEqual);
//        System.out.println(stringsareEqualCaseSensetive);
//        boolean myStringStartsWith = myString.startsWith("My");
//        System.out.println(myStringStartsWith);
//        boolean myStringContains = myString.contains("test");
//        System.out.println(myStringContains);
//        boolean myStringEndsWith = myString.endsWith("ing");
//        System.out.println(myStringEndsWith);
//        String updatedString = myString.replace('s', 'S');
//        System.out.println(updatedString);
//
//
//        // Дз 30.09
////        Scanner scanner = new Scanner(System.in);
//        System.out.println("Пожалуйста введите свою оценку: ");
//        int userInput = new Scanner(System.in).nextInt();
//        while (userInput < 0 || userInput > 100) {
//            System.out.println("Пожалуйста введите корректное значение (0-100): ");
//            userInput = scanner.nextInt();
//        }
//        if (userInput >= 70) {
//            System.out.println("Congrats! You passed the test!");
//        } else {
//            System.out.println("You failed the test!");
//        }
//
//
//        String userInput1 = "";
////        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            if (userInput1.equals("Exit")) {
//                break;
//            }
//            System.out.println("Please enter something");
//            userInput1 = scanner.nextLine();
//        }
//
////        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter a number: ");
//        int x = scanner.nextInt();
//        int sum = 0;
//        if (x < 0) {
//            for (int i = 0; i >= x; i--) {
//                sum += i;
//            }
//        } else if (x > 0) {
//            for (int i = 0; i <= x; i++) {
//                sum += i;
//            }
//        }
//        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);
//
//        String[] channels = new String[5];
//        channels[0] = "SDF";
//        channels[1] = "TNT";
//        channels[2] = "MuzTV";
//        channels[3] = "MirTV";
//        channels[4] = "ONT";
//        int i;
//        do {
//            System.out.print("\nВведите номер канала: ");
//            i = new Scanner(System.in).nextInt();
//            if (i == 0) {
//                break;
//            }
//            System.out.printf("Номер канала: %d, название канала: %s", i, channels[i - 1]);
//        }
//        while (i > 0 && i < channels.length);
//
//        // дз 02.10
//        Apples redApple = new Apples("small", "red", "sweet", "nora", 4.5, 1.2, 9.3);
//        Apples greenApple = new Apples("small", "green", "sour", "bella", 6.9, 1.7, 11.5);
//        redApple.appleInfo();
//        greenApple.setSalePrice(12.3);
//        System.out.println(greenApple.getSalePrice());
//        Apples.describeAppleSorts();
//
//
//        // дз 07.10
//        Refill blueRefill = new Refill(0.4, "синий");
//        Corpus pinkCorpus = new Corpus(1, 9, "розовый", false,
//                "пластик");
//        Pen hellit = new Pen("hellit", 1.50, blueRefill, pinkCorpus);
//        hellit.printInfo();

        Pencil greyPencil = new Pencil(true, "grey", 2.2, "levin");
//        Eraser circleEraser = new Eraser("white", "circle", 12, "Lol", 1.20);
//        System.out.println(circleEraser.getEraserColor());
//
//        greyPencil.setContainEraser();
//        System.out.println(greyPencil.getContainsEraser());

        // дз 09.10
        Menu.showMenu();
    }
}