package xworkz.online;

public class BusPlaces {
	private final static String[] places = {"6048222371","+(1)77851236534","+(52)5583166689","+(1)776811659","7766360987","+17783252566"};

	public static void search(String place) {
		boolean isFound = false;
		for(int i =0;i<places.length;i++) {
			if(places[i].equals(place)) {
				isFound = true;
				break;
			}
		}
		if(isFound) {
			System.out.println("Found "+place);
		}else {
			System.out.println("Not Found "+place);
		}
	}
	public String[] getPlaces() {
		return places;
	}
}
