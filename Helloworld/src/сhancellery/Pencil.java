package сhancellery;

public class Pencil extends Chancellery {
    private boolean containsEraser;
    private String refillColor;

    public Pencil (boolean containsEraser, String refillColor, double price, String firm) {
        this.containsEraser = containsEraser;
        this.refillColor = refillColor;
        this.price = price;
        this.firm = firm;
    }

    public boolean getContainsEraser() {
        return containsEraser;
    }

    public String getRefillColor () {
        return refillColor;
    }
}
