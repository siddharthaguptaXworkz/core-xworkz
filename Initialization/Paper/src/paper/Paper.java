package paper;
public class Paper {
    private String brand="ClassMate";
    private double width;
    private double height;
    private String color;

    public Paper(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;

    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void print() {
        System.out.println("brand = " + brand);
        System.out.println("width = " + width);
        System.out.println("height = " + height);
        System.out.println("color = " + color);
    }
}
