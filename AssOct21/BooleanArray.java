public class BooleanArray{
	public static void main(String args[]) {
		BooleanArray.print();
	}
	
	public static void print() {
		boolean[] isMale = {false,false,false,false,false,true,true,true,true,true};
		for(int i=0;i<10;i++){
			System.out.println(i+" "+isMale[i]);
		}
	}
}