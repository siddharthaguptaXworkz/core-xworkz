public class Vehicle {
    private String company;
    private String model;
    private float price;

    public Vehicle(String company, String model, float price) {
        this.company = company;
        this.model = model;
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("company = " + company);
        System.out.println("model = " + model);
        System.out.println("price = " + price);
    }
}
