public class InstituteFinder{
	
	public static void lowestAndBestUsingString(String instituteName) {
		System.out.println("invoked lowestAndBestUsingString");
		System.out.println("arg 1 instiuteName "+instituteName);
		switch(instituteName) {
			case "Xworkz":
				System.out.println("case is "+instituteName);
				System.out.println("Enteprise developement");
				System.out.println("cost is 20k");
				break;
			case "ABC":
				System.out.println("case is "+instituteName);
				System.out.println("Java");
				System.out.println("cost is 30k");
				break;
			case "Pentagon":
				System.out.println("case is "+instituteName);
				System.out.println("Python");
				System.out.println("cost is 50k");
				break;
			case "Jspiders":
				System.out.println("case is "+instituteName);
				System.out.println("java and fee");
				System.out.println("cost is 32k");
				break;
			case "SOCKEXPERTS":
				System.out.println("case is "+instituteName);
				System.out.println("CYBER SECURITY");
				System.out.println("cost is 40k");
			default: 
				System.out.println("no institute matched");
			
		}
		
	}
}