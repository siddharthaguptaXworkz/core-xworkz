public class Car{
	private String company;
	private String model;
	private String fuelType;
	private short numCylinders;
	private double price;
	
	public Car(String company, String model,String fuelType, short numCylinders,double price) {
		this.company = company;
		this.model = model;
		this.fuelType = fuelType;
		this.numCylinders = numCylinders;
		this.price = price;
	}
	
	public String toString() {
		return "Company: "+company+" Model: "+model+" FuelType: "+fuelType+" NumCylinders: "+numCylinders+" Price: "+price;
	}
	
}