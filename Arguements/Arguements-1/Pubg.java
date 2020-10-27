public class Pubg{
	private String version;
		
		public Pubg(String version) {
			
			this.version = version;
		}
		
		public String getVersion() {
			return version;
		}
		
		
		public void play() {
			System.out.println("Playing on "+version);
		}

}