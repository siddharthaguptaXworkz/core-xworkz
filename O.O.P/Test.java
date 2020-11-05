public class Test{
	public static void main(String[] args) {
		Address address = new Address(3000,"Thane","Mandapada ","MH020022");
		System.out.println(address);
		AirRefreshener refreshener = new AirRefreshener("odonil","Jasmine","8901297503177","Asian Aerosol",200,"Dabur India Ltd.");
		System.out.println(refreshener);
		Car car = new Car("Maruti Suzuki", "V9600","Petroleum",(short) 5,200000d);
		System.out.println(car);
		Cat cat = new Cat("Meow Meow","Persian cat",(short) 10,(short) 25,"Iran");
		System.out.println(cat);
		Country country = new Country("India","Asia",(Double) 2.6*10e12,(Double) 1380004385d,"Republic Of India");
		System.out.println(country);
	}
	
}