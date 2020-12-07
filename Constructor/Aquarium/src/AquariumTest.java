import java.lang.reflect.AccessibleObject;

public class AquariumTest {
    public static void main(String[] args) {
        Aquarium vancouverAcquarium = new Aquarium("Vancouver Aquarium");
        vancouverAcquarium.toPrint();
        Aquarium richmondAcquarium = new Aquarium("Azalea Aquariums","Richmond"," 5112 Richmond Henrico Turnpike A, Richmond, VA 23227, United States",100);
        richmondAcquarium.toPrint();
        Aquarium delhiAcquarium = new Aquarium("Fish Point","Delhi","162 - A, 1st Floor, Sarojini Nagar Market, New Delhi, Delhi 110023");
        delhiAcquarium.toPrint();
        Aquarium bangaloreAcquarium = new Aquarium("Government Aquarium","Bangalore");
        bangaloreAcquarium.toPrint();

    }
}
