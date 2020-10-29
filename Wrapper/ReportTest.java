public class ReportTest{
	public static void main(String args[]) {
		System.out.println("25.99% ", Report.report(Double.parseDouble("25.99")));
		System.out.println("40.2% ", Report.report(Double.parseDouble("40.2")));
		System.out.println("50.5% ", Report.report(Double.parseDouble("50.5")));
		System.out.println("65.59% ", Report.report(Double.parseDouble("65.59")));
		System.out.println("73.35% ", Report.report(Double.parseDouble("73.35")));
		System.out.println("77.35% ", Report.report(Double.parseDouble("77.35")));
		System.out.println("99% ", Report.report(Double.parseDouble("77.35")));
		
	}
}