public class AirRefreshener{
	private String company;
	private String scent;
	private String isbn;
	private String manufacturer;
	private String marketer;
	private int price;
	
	public AirRefreshener(String company,String scent,String isbn,String manufacturer,int price, String marketer) {
		
		this.company = company;
		this.scent = scent;
		this.isbn = isbn;
		this.manufacturer = marketer;
		this.marketer = marketer;
		this.price = price;
	}
	
	
	public String toString() {
		return "The company "+company+" "+"sells scent "+scent+" "+"with isbn "+isbn+" \n. Manufacturer is "+manufacturer+". \n "+" Marketer is"+marketer+". "+" \n Price is "+price;
	}
	
}