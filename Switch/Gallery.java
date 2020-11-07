public class Gallery{
	public static void main(String[] photos) {
		String storeIn = "Private";
		switch(storeIn) {
			case "Private":
				System.out.println("store images in private function");
				System.out.println("stored on Nov 7");
				break;
			case "Public":
				System.out.println("store images in public function");
				System.out.println("stored on Nov 7");
				break;
			case "Cloud":
				System.out.println("store images in cloud");
				System.out.println("stored on Nov 7");
				break;
			default:
				System.out.println("cannot store images");
		}
		
		
	}
	
}