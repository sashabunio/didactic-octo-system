package сhancellery;

import java.util.Scanner;
public class Chancellery {
        protected String firm;
        protected double price;

        public String getFirm() {
            return firm;
        }

        public void setFirm (){
            this.firm = new Scanner(System.in).nextLine();
        }

        public double getPrice() {
            return price;
        }

        public void setPrice() {
            this.price = new Scanner(System.in).nextInt();
        }
    }
