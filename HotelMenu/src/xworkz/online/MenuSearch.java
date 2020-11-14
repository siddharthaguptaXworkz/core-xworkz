package xworkz.online;

public class MenuSearch {
	private final static String[] hotels = {"Hilton","Fairmont"};

	public static void search(String hotel) {
		boolean isFound = false;
		for(int i =0;i<hotels.length;i++) {
			if(hotels[i].equals(hotel)) {
				isFound = true;
				break;
			}
		}
		if(isFound) {
			System.out.println("Found "+hotel);
		}else {
			System.out.println("Not Found "+hotel);
		}
	}
	public String[] getHotels() {
		return  hotels;
	}
}
