public class Apples {
    String size;
    String color;
    String taste;
    String sort;
    double price;
    double weight;
    private double salePrice;

    public Apples(String size, String color, String taste, String sort, double price, double weight, double salePrice) {
        this.size = size;
        this.color = color;
        this.taste = taste;
        this.sort = sort;
        this.price = price;
        this.weight = weight;
        this.salePrice = salePrice;
    }

        public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void appleInfo() {
        System.out.printf("Apple size: %s\n Apple color: %s\n Apple taste: %s\n Apple sort: %s\n Apple price: %f\n Apple weight: %f\n",
                size, color, taste, sort, price, weight);
    }

    public static void describeAppleSorts () {
        System.out.println("We have 2 apple sorts: Nora and Bella!");
    }
}