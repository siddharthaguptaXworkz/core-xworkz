public class PocketMoneyEstimatorTest {
	public static void main(String[] args){
		PocketMoneyEstimator pocketMoneyEstimator = new PocketMoneyEstimator();
		pocketMoneyEstimator.add(Integer.parseInt(args[0]);
		System.out.println(pocketMoneyEstimator.getBalance());
		pocketMoneyEstimator.expenditure(Integer.parseInt(args[0]));
		System.out.println(pocketMoneyEstimator.getBalance());
		
	}
	
}