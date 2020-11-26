public class Speaker {
    private String company;
    private String productName;

    public Speaker(String company, String productName) {
        this.company = company;
        this.productName = productName;
    }

    public void displayInfo() {
        System.out.println("company = " + company);
        System.out.println("productName = " + productName);
    }

}
