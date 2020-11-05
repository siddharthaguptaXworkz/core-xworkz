public class Address{
	private int doorNo;
	private String city;
	private String street;
	private String pincode;
	
	public Address(int doorNo,String city,String street,String pincode) {
		System.out.println("default doorNo "+this.doorNo+" city "+this.city+" street "+this.street+" pincode "+this.pincode);
		this.doorNo = doorNo;
		this.city = city;
		this.street = street;
		this.pincode = pincode;
	}
	
	public int getDoorNo() {
		return doorNo;
	}
	
	public String getCity() {
		return city;
		
	}
	
	public String getStreet() {
		return street;
	}
	
	
	public String getPincode() {
		return pincode;
	}
	
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public String toString() {
		return "DoorNo "+doorNo+" city "+city+" street "+street+" pincode "+pincode;
	}

}