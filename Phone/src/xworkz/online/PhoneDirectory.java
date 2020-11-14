package xworkz.online;

public class PhoneDirectory {
	private final static String[] phoneNumbers = {"6048222371","+(1)77851236534","+(52)5583166689","+(1)776811659","7766360987","+17783252566"};

	public static void search(String phoneNumber) {
		boolean isFound = false;
		for(int i =0;i<phoneNumbers.length;i++) {
			if(phoneNumbers[i].equals(phoneNumber)) {
				isFound = true;
				break;
			}
		}
		if(isFound) {
			System.out.println("Found "+phoneNumber);
		}else {
			System.out.println("Not Found "+phoneNumber);
		}
	}
	public String[] getPhoneNumbers() {
		return phoneNumbers;
	}
	
}
