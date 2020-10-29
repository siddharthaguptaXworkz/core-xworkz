public class PlaceFinder{
	public static String[] places = ["Thane ", "Mumbai ", "Pune","Nagpur","Nashik","Aurangabad","Solapur","Kolhapur","Amravati","Pimpri-Chinchiwad","Kalyan","Akola","Bhiwandi","Jalgaon","Ahmednagar"];
	public static String finder(int fromDistance) {
		if (fromDistance<=15) {
			return PlaceFinder.places[0];
		}else if (fromDistance <= 24) {
			return PlaceFinder.places[1];
		}else if(fromDistance <=120) {
			return PlaceFinder.places[2];
		}else if(fromDistance <= 240) {
			return PlaceFinder.places[3];
		}else if (fromDistance <= 360) {
			return PlaceFinder.places[4];
		}else if (fromDistance <= 480) {
			return PlaceFinder.places[5];
		}else if(fromDistance<=1000) {
			return PlaceFinder.places[6];
		}else if(fromDistance<=1200) {
			return PlaceFinder.places[7];
		}else if(fromDistance<=1400) {
			return PlaceFinder.places[8];
		}else if(fromDistance<=1600) {
			return PlaceFinder.places[9];
		}else if(fromDistance<=1800) {
			return PlaceFinder.places[10];
		}else if(fromDistance<=1900) {
			return PlaceFinder.places[11];
		}else if(fromDistance<=2000){
			return PlaceFinder.places[12];
		}else if(fromDistance<=2100) {
			return PlaceFinder.places[13];
		}else {
			return PlaceFinder.places[14];
		}
		
	}
	
	public static String finder(int fromDistance, int toDistance) {
		if (fromDistance<=15){
			if (toDistance<=15) {
				return PlaceFinder.places[0];
			}else {
				return PlaceFinder.places[1];
			}
		}else if(fromDistance<=24) {
			if(toDistance<=15) {
				return PlaceFinder.places[0];
			}else if(toDistance<=24){
				return PlaceFinder.places[1];
			}else{
				return PlaceFinder.places[2];
			}
		} else if(fromDistance<=120) {
			if(toDistance>= 24 && toDistance <=240){
				return PlaceFinder.places[2];
			}else if(toDistance <24) {
				return PlaceFinder.places[1];
			}else if(toDistance >120) {
				return PlaceFinder.places[3];
			}
		} else if(fromDistance<=240) {
			if(toDistance >= 120 && toDistance <= 360){
				return PlaceFinder.places[3];
			}else if(toDistance<120) {
				return PlaceFinder.places[2];
			}else if(toDistance>360) {
				return PlaceFinder.places[4];
			}
		} else if(fromDistance<=360) {
			if(toDistance >= 240 && toDistance <= 480){
				return PlaceFinder.places[4];
			}else if(toDistance<240) {
				return PlaceFinder.places[3];
			}else if(toDistance>360) {
				return PlaceFinder.places[5];
			}
		}else if(fromDistance<=480) {
			if(toDistance >= 360 && toDistance <= 1000){
				return PlaceFinder.places[5];
			}else if(toDistance<360) {
				return PlaceFinder.places[4];
			}else if(toDistance>1000) {
				return PlaceFinder.places[6];
			}
		}else if(fromDistance<=1000) {
			if(toDistance >= 480 && toDistance <= 1200){
				return PlaceFinder.places[6];
			}else if(toDistance<480) {
				return PlaceFinder.places[5];
			}else if(toDistance>1200) {
				return PlaceFinder.places[7];
			}
		}else if(fromDistance<=1200) {
			if(toDistance >= 1000 && toDistance <= 1400){
				return PlaceFinder.places[7];
			}else if(toDistance<1000) {
				return PlaceFinder.places[6];
			}else if(toDistance>1400) {
				return PlaceFinder.places[8];
			}
		}else if(fromDistance<=1400) {
			if(toDistance >= 1200 && toDistance <= 1600){
				return PlaceFinder.places[8];
			}else if(toDistance<1200) {
				return PlaceFinder.places[7];
			}else if(toDistance>1600) {
				return PlaceFinder.places[9];
			}
		}else if(fromDistance<=1600) {
			if(toDistance >= 1400 && toDistance <= 1800){
				return PlaceFinder.places[9];
			}else if(toDistance<1400) {
				return PlaceFinder.places[8];
			}else if(toDistance>1800) {
				return PlaceFinder.places[10];
			}
		}else if(fromDistance<=1800) {
			if(toDistance >= 1600 && toDistance <= 2000){
				return PlaceFinder.places[10];
			}else if(toDistance<1200) {
				return PlaceFinder.places[9];
			}else if(toDistance>1600) {
				return PlaceFinder.places[11];
			}
		}
		else if(fromDistance<=2000) {
			if(toDistance >= 1800 && toDistance <= 2100){
				return PlaceFinder.places[11];
			}else if(toDistance<1800) {
				return PlaceFinder.places[10];
			}else if(toDistance>2100) {
				return PlaceFinder.places[12];
			}
		}
		else if(fromDistance<=2100) {
			if(toDistance >= 2000 && toDistance <= 2100){
				return PlaceFinder.places[12];
			}else if(toDistance<1200) {
				return PlaceFinder.places[11];
			}else if(toDistance>1600) {
				return PlaceFinder.places[13];
			}
		}else {
			return PlaceFinder.places[13];
			
		}
			
				
		
	}
}
}