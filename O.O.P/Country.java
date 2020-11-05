public class Country{
	private String name;
	private String continent;
	private double gdp;
	private double population;
	private String officialName;
	
	public Country(String name,String continent,double gdp,double population,String officialName) {
		this.name = name;
		this.continent = continent;
		this.gdp = gdp;
		this.population = population;
		this.officialName = officialName;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getContinent() {
		return this.continent;
	}
	
	public double getGDP() {
		return this.gdp;
	}
	
	public double getPopulation() {
		return this.population;
	}
	
	public String getOfficialName() {
		return this.officialName;
	}
	
	public String toString() {
			return "Name "+name+" Continent: "+continent+" Population: "+population+" OfficialName "+officialName;
	}
	

}