public class Converter{
	
	public static void main(String args[]) {
		int integer1 = Int.parseInt(args[0]);
		float float1 = Float.parseFloat(args[1]);
		double double1 = Double.parseDouble(args[2]);
		byte byte1 = Byte.parseByte(args[3]);
		short short1 = Short.parseShort(args[4]);
		long long1 = Long.parseLong(args[5]);
		char char1 = Char.parseChar(args[6]);
		boolean bool1 = Boolean.parseBoolean(args[7]);
		System.out.println("interger1 "+integer1);
		System.out.println("float1 "+float1);
		System.out.println("double1 "+double1);
		System.out.println("byte1 "+byte1);
		System.out.println("short1 "+short1);
		System.out.println("long1 "+long1);
		System.out.println("char1 "+char1);
		System.out.println("bool1 "+bool1);
	}
}