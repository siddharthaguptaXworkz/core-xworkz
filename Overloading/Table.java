public class Table{
	public static void hold(String item) {
		
		System.out.println("table now holds "+item);
		
	}
	
	public static void hold(String item, int numItems) {
		
		System.out.println("table now holds "+numItems+" "+item);
	}
	
	public static void hold(int numItems, String item) {
		System.out.println("table now holds "+numItems+" "+item);
	}
}