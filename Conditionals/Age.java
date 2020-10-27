public class Age{
	public static String ageDefinition(byte age){
		if (age<13){
			return "Kid"
		}
		else if(age<19){
			return "Teen";
		}
		else if (age<60){
			return "Adult";
		}else {
			return "Old";
		}
	}		
}