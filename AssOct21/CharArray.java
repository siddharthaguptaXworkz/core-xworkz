public class CharArray{
	public static void main(String args[]) {
		CharArray.print();
	}
	
	public static void print() {
		char[] letters = {'A','B','C','D','E','F','G','H','I','J'};
		for(int i=0;i<10;i++){
			System.out.println(i+" "+letters[i]);
		}
	}
}