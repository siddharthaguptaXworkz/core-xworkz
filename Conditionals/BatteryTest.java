public class BatteryTest{
	public static void main(String[] args){
		IPhone.pressPowerButton();
		System.out.println(IPhone.powerStatus(55));
	}
}