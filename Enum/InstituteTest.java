public class InstituteTest{
	public static void main(String[] args){
		System.out.println("invoked main, doing switch and enum");
		System.out.println("EXIT :: main, doing swith and enum");
		InstituteFinder.lowestAndBestUsingString("whatever");
		String instituteName = "XWORKZ";
		Institute enumInstituteName = Institute.valueOf(instituteName);
		System.out.println(enumInstituteName);
		System.out.println("EXIT :: main, doing switch and enum");
	}
	
}