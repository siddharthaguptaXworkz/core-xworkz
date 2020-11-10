public class VegetableTester{
	public static void main(String[] args) {
		String vegetablePotato = "POTATO";
		Vegetable convertedPotatoFromSting=Sport.valueOf(vegetablePotato);
		System.out.println(convertedPotatoFromSting);
		Vegetable[] allVegetables = Vegetable.values();
		for(int vegetableIntitial=0;vegetableIntitial<allVegetables.length;vegetableIntitial++){
			System.out.println(" sportsIntitial "+allVegetables[vegetableIntitial]);
		}
		
	}
}