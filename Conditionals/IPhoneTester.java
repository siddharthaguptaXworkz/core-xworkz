public class IPhoneTester{
	public static void main(String[] args){
		IPhone.pressPowerButton();
		System.out.println("IPhoneTester "+IPhone.message(args[0]));
	}
}