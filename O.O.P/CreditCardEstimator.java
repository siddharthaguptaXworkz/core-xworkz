public class CreditCardEstimator{
	private int balance =0;
	private int limit=1000;
	private void add(int amount) {
		balance += amount;
		System.out.println("Balance  "+balance);
	}
	
	private void expenditure(int amount) {
		if (amount> limit) {
			if(balance-limit <=0) {
				balance = 0
			}else{
				balance -= limit;
			}
		} else {
			if(balance-amount <=0) {
				balance = 0
			}else{
				balance -= amount 
			}
		}
		
		
		System.out.println("Balance  "+balance);
		
	}
}