public class TheaterFinder{
	
	public static void lowestAndBestUsingString(String theaterName) {
		System.out.println("invoked lowestAndBestUsingString");
		System.out.println("arg 1 theaterName "+theaterName);
		switch(theaterName) {
			case "Maratha Mandir Theatre":
				System.out.println("case is "+theaterName);
				System.out.println("Rs.109");
				break;
			case "Regal Cinema":
				System.out.println("case is "+theaterName);
				System.out.println("Rs. 200");
				break;
			case "Tata Theatre":
				System.out.println("case is "+theaterName);
				System.out.println("Rs. 175");
				break;
			case "The Royal Opera":
				System.out.println("case is "+theaterName);
				System.out.println("Rs. 220");
				break;
			case "Shri Shivaji":
				System.out.println("case is "+theaterName);
				System.out.println("Rs. 230");
				break;
			case "Experimental":
				System.out.println("case is "+theaterName);
				System.out.println("Rs. 250");
				break;
			case "Jamshed Bhabha":
				System.out.println("case is "+theaterName);
				System.out.println("Rs. 275");
				break;
			default: 
				System.out.println("no institute matched");
			
		}
		
	}
}