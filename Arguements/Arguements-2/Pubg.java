public class Pubg{
	private String version;
	private String[] players;
		
		public Toy(String version, String players) {
			
			this.version = version;
			this.players = players;
		}
		
		public String getVersion() {
			return version;
		}
		
		public String[] getPlayers() {
			return players;
		}
		
		
		public void setPlayers(String[] players) {
			this.players = players;
		}
		
		public void play() {
			System.out.println("Playing on "+version+" Players: "+players);
		}

}