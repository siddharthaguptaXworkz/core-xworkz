import java.util.ArrayList;

public class Country {
    private String name;
    private String continent;
    private String capital;
    private ArrayList<Country> neighbours;
    private ArrayList<String> cities;
    private float gdp;
    private float population;
    private float areaTotal;

    public Country(String name, String continent, String capital, float gdp, float population, float areaTotal) {
        this.name = name;
        this.continent = continent;
        this.capital = capital;
        this.gdp = gdp;
        this.population = population;
        this.areaTotal = areaTotal;
        this.neighbours = new ArrayList<Country>();
        this.cities = new ArrayList<String>();
    }

    public void addNeighbour(Country country) {
        this.neighbours.add(country);
    }

    public void addCity(String city) {
        this.cities.add(city);
    }

    public void displayInfo() {
        System.out.println("name = " + name);
        System.out.println("continent = " + continent);
        System.out.println("capital = " + capital);
        System.out.println("neighbours = " + neighbours);
        System.out.println("cities = " + cities);
        System.out.println("gdp = " + gdp);
        System.out.println("population = " + population);
        System.out.println("areaTotal = " + areaTotal);
    }

}
