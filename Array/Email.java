public class Email{
	public static void main(String[] args) {
		Email.printEmails();
	}
	
	public static void printEmails() {
		String[] familyEmail = {"dad@family.com", "me@family.com", "brother@family.com", "mother@family.com"};
		for(int i= 0;i<familyEmail.length;i++){
			System.out.println(i+" "+familyEmail[i]);
		}
	}
	
}