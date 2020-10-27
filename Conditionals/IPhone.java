public class IPhone{
	public static boolean isOn = False;
	public static void pressPowerButton(){
		IPhone.isOn = !IPhone.isOn;
		if(IPhone.isOn){
			System.out.println("Phone is Turned On ");
		}else {
			System.out.println("Phone is Turned Off");
		}
	}
	
	public static void message(String message) {
		if(iPhone.isOn) {
		System.out.println("message "+message);
		}
	}
	
	public static String powerStatus(byte charge){
		if(iPhone.isOn) {
			if(charge <20){
			return "LOW BATTERY";
			}
		else if(charge == 100){
			reurn "FULLY CHARGED";
		}
		else if(charge > 90){
			return "HIGHLY CHARGED";
		}else {
			return "CHARGED";
		}
		}
		
	}
}