public class Aquarium {
    private String name;
    private String city;
    private String address;
    private int numAnimals;

    public Aquarium(String name, String city, String address, int numAnimals) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.numAnimals = numAnimals;
    }
    public Aquarium(String name) {
        this.name = name;
    }
    public Aquarium(String name,String city) {
        this.name = name;
        this.city = city;
    }

    public Aquarium(String name,String city,String address) {
        this.name = name;
        this.city = city;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumAnimals() {
        return numAnimals;
    }

    public void setNumAnimals(int numAnimals) {
        this.numAnimals = numAnimals;
    }

    public void toPrint() {
        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("address = " + address);
        System.out.println("numAnimals = " + numAnimals);
    }
}
