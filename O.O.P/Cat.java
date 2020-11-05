public class Cat{
	private String name;
	private String breed;
	private short age;
	private short weight;
	private String origin;
	
	public Cat(String name,String breed,short age, short weight,String origin) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.weight = weight;
		this.origin = origin;
	}
	
	public String toString() {
			return "Name: "+name+" Breed: "+breed+" Age: "+age+" Weight "+weight+" Origin "+origin;
	}
	
}