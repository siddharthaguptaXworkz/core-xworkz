public class TheaterTester{
	public static void main(String[] args){
		System.out.println("invoked main, doing switch and enum");
		System.out.println("EXIT :: main, doing swith and enum");
		TheaterFinder.lowestAndBestUsingString("whatever");
		String theaterName = "MARATHA_MANDIR";
		Theater enumTheaterName = Theater.valueOf(theaterName);
		System.out.println("theaterName "+enumTheaterName);
		System.out.println("EXIT :: main, doing switch and enum");
	}
	
}