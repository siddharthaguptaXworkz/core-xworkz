public class CountryTest {
    public static void main(String[] args) {
        Country india = new Country("India","Asia","New Delhi",2.602e12f, 1326093247f,3287263f);
        Country bangladesh = new Country("Bangladesh","Asia","Dhaka",261.5e9f, 162650853f,148460f);
        india.addCity("Bangalore");
        india.addNeighbour(bangladesh);
        india.displayInfo();

    }
}
