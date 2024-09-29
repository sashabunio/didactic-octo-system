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

        String infoAboutMe = String.format("My age: %s , My gender: %s , My name: %s , My surname: %s ",
                myAge, myGender, myName, mySurname); // как обозначать дробное число?
        System.out.println(infoAboutMe);
        System.out.println ("My Gender is " + myGender + " " + ", My name is " + myName + " "  + ", My Surname is "
                + mySurname + " " + ", My Age is " + myAge +  " " + ", My Height is " + myHeight);
        StringBuffer buffer = new StringBuffer();
        buffer.append("My Gender is " + myGender + " " + ", My name is " + myName + " "  + ", My Surname is "
                + mySurname + " " + ", My Age is " + myAge +  " " + ", My Height is " + myHeight);
        System.out.println(buffer);
        System.out.println ("My name is Aliaksandra: " + myNameIsAliaksandra);



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
















    }
}