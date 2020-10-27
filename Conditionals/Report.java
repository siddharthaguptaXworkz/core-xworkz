public class Report{
	public static String report(double percentage) {
		if(percentage<=39.99){
			return "F";
		}else if(percentage<45){
			return "P";
		}else if(percentage<60){
			return "D";
		}else if(percentage<70){
			return "C"
		}else if(percentage<75){
			return "B";
		}else if(percentage<80){
			return "A";
		}else {
			return "O";
		}
		
	}
}