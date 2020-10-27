public class Main{
	public static void main(String args[]) {
		Toy toy = new Toy(args[0],Float.parseFloat(args[1]));
		System.out.println("toy with name "+toy.getName()+" "+toy.getPrice());
		Pubg pubg = new Pubg(args[2]);
		System.out.println("pubg with name "+pubg.getVersion());
	}

}