public class TableTester{
	public static void main(String[] args) {
		Table.hold(args[0]);
		Table.hold(args[0],Integer.parseInt(args[1]));
		Table.hold(Integer.parseInt(args[1],args[0]));
	}
	
}