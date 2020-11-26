public class Mobile {
    private String company;
    private String model;
    private String color;
    public static enum OPERATING_SYSTEM {
            ANDROID, IPHONE
    };
    private OPERATING_SYSTEM operating_system;

    public Mobile(String company, String model, String color, OPERATING_SYSTEM operating_system) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.operating_system = operating_system;
    }

    public void displayInfo() {
        System.out.println("company = " + company);
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("operating_system = " + operating_system);
    }
}
