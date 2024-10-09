package Chancellery;

public class Eraser extends Chancellery {
    private String eraserColor;
    private String eraserShape;
    private double eraserLength;

    public Eraser (String eraserColor, String eraserShape, double eraserLength, String firm, double price) {
        this.eraserColor = eraserColor;
        this.eraserShape = eraserShape;
        this.eraserLength = eraserLength;
        this.firm = firm;
        this.price = price;
    }

    public String getEraserColor() {
        return eraserColor;
    }

    public String getEraserShape() {
        return eraserShape;
    }

    public double getEraserLength() {
        return eraserLength;
    }
}
