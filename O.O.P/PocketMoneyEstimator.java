public class PocketMoneyEstimator{
	private int balance =0;
	private void add(int amount) {
		balance += amount;
		System.out.println("Balance  "+balance);
	}
	
	private void expenditure(int amount) {
		if(balance-amount <=0) {
			balance = 0
		}else{
			balance -= amount
		}
		
		System.out.println("Balance  "+balance);
		
	}
}