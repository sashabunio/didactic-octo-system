package сhancellery;

import java.util.Scanner;
public class Chancellery {
        protected String firm;
        protected double price;

        public String getFirm() {
            return firm;
        }

        public void setFirm (){
            System.out.println("Please enter the firm of your pencil:\n");
            this.firm = new Scanner(System.in).nextLine();
        }

        public double getPrice() {
            return price;
        }

        public void setPrice() { // кидает ошибку если ввожу десятичное число, не понимаю почему. С целым все ок.
            System.out.println("Please enter the price of your pencil:\n");
            this.price = new Scanner(System.in).nextDouble();
        }
    }
