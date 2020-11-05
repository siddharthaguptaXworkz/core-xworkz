public class CarBrandTest{
	public static void main(String[] args) {
		String[] brands = CarBrand.getBrands();
		for (int i =0;i<brands.length;i++){
			System.out.println("brands["+i+"]"+brands[i]);
		}
	}
	
}