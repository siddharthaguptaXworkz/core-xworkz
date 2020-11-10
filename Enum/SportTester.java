public class SportTester{
	public static void main(String[] args) {
		String sportCricket = "CRICKET";
		Sport convertedCricketFromSting=Sport.valueOf(sportCricket);
		System.out.println(convertedCricketFromSting);
		Sport[] allSports = Sport.values();
		for(int sportsIntitial=0;sportsIntitial<allSports.length;sportsIntitial++){
			System.out.println(" sportsIntitial "+allSports[sportsIntitial]);
		}
		
	}
	
}