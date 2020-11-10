public class FruitTester{
	public static void main(String[] args) {
		String fruitApple = "APPLE";
		Sport convertedAppleFromSting=Sport.valueOf(fruitApple);
		System.out.println(convertedAppleFromSting);
		Fruit[] allFruits = Fruit.values();
		for(int fruitsIntitial=0;fruitsIntitial<allFruits.length;fruitsIntitial++){
			System.out.println(" sportsIntitial "+allFruits[fruitsIntitial]);
		}
		
	}
}