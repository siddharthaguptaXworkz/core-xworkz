import java.util.Date;

public class Vehicle {
    private String company;
    private String chasisNo;
    private Date mfgDate;
    private String color;
    private String ownerName;

    public Vehicle(String company, String chasisNo, Date mfgDate) {
        this.company = company;
        this.chasisNo = chasisNo;
        this.mfgDate = mfgDate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCompany() {
        return company;
    }

    public String getChasisNo() {
        return chasisNo;
    }

    public Date getMfgDate() {
        return mfgDate;
    }

    public String getColor() {
        return color;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void print() {
        System.out.println("company = " + company);
        System.out.println("chasisNo = " + chasisNo);
        System.out.println("mfgDate = " + mfgDate);
        System.out.println("color = " + color);
        System.out.println("ownerName = " + ownerName);
    }
}
