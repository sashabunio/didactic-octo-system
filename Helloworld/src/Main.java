import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");

        int myAge = 25;
        char myGender = 'F';
        double myHeight = 1.64;
        boolean myNameIsAliaksandra = true;
        String myName = "Aliaksanda";
        String mySurname = "Shabunio";

        String infoAboutMe = String.format("My age: %s , My gender: %s , My name: %s , My surname: %s , My Height : %f ",
                myAge, myGender, myName, mySurname, myHeight);
        System.out.println(infoAboutMe);
        System.out.println("My Gender is " + myGender + " , My name is " + myName + " , My Surname is "
                + mySurname + " , My Age is " + myAge + " , My Height is " + myHeight);
        StringBuffer buffer = new StringBuffer();
        buffer.append("My Name is: ");
        buffer.append(myName);
        buffer.append("\nMy Surname is: ");
        buffer.append(mySurname);
        buffer.append("\nMy Age is: ");
        buffer.append(myAge);
        buffer.append("\nMy Height is: ");
        buffer.append(myHeight);
        buffer.append("\nMy Gender is: ");
        buffer.append(myGender);
        System.out.println(buffer);
        System.out.println("My name is Aliaksandra: " + myNameIsAliaksandra);

        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();

        int stringLength = myString.length();
        int length = 10;
        boolean myStringLengthComparison = stringLength == length;
        System.out.println(myStringLengthComparison);
        boolean stringisEmpty = myString.isEmpty();
        System.out.println(stringisEmpty);
        char charNr8 = myString.charAt(8);
        System.out.println(charNr8);
        String stringforComparison = "my new string";
        boolean stringsareEqual = myString.equals(stringforComparison);
        boolean stringsareEqualCaseSensetive = myString.equalsIgnoreCase(stringforComparison);
        System.out.println(stringsareEqual);
        System.out.println(stringsareEqualCaseSensetive);
        boolean myStringStartsWith = myString.startsWith("My");
        System.out.println(myStringStartsWith);
        boolean myStringContains = myString.contains("test");
        System.out.println(myStringContains);
        boolean myStringEndsWith = myString.endsWith("ing");
        System.out.println(myStringEndsWith);
        String updatedString = myString.replace('s', 'S');
        System.out.println(updatedString);



        // Дз 30.09
        Scanner scanner = new Scanner(System.in);
        int score = 0; // не понимаю какое значение нужно подставить в score. Программа не работает, но у меня закончились варианты.
        while (score < 0 && score > 100) {
            System.out.println("Please enter your score: ");
            score = scanner.nextInt();
            System.out.println("Please enter correct score (0-100)");
            score = scanner.nextInt();
        }
        System.out.println("Success!");


        String userInput = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (userInput.equals("Exit")) {
                break;
            }
            System.out.println("Please enter something");
            userInput = scanner.nextLine();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i >= x; i--){
            sum +=i;
        }
        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);

        String[] channels = new String[5];
        channels[0] = "Exit";
        channels[1] = "TNT";
        channels[2] = "MuzTV";
        channels[3] = "MirTV";
        channels[4] = "ONT";
        for (int i=1; i < channels.length; ) {
            System.out.print("\nВведите номер канала: ");
            i = new Scanner(System.in).nextInt();
            if (i == 0) {
                break;
            }
            System.out.printf("Номер канала: %d, название канала: %s", i, channels[i]);
        }
    }
}