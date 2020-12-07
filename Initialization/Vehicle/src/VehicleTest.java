import java.util.Date;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle hyundai = new Vehicle("Hyundai","S223232323232",new Date(24223232L));
        hyundai.setColor("Green");
        hyundai.setOwnerName("R.C.Sproul");
        hyundai.print();

    }
}
