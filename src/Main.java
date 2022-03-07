import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Rocket>rockets = createRockets();
        System.out.println(rockets);
    }

    private static List<Rocket> createRockets() {

        List<Rocket>rocketsList = new ArrayList<>();

        Rocket rocket1 = new Rocket("32WESSDS");
        Rocket rocket2 = new Rocket("LDSFJA32" );

        rocket1.addPropeller(10);
        rocket1.addPropeller(30);
        rocket1.addPropeller(80);
        rocket2.addPropeller(30);
        rocket2.addPropeller(40);
        rocket2.addPropeller(50);
        rocket2.addPropeller(50);
        rocket2.addPropeller(30);
        rocket2.addPropeller(10);

        rocketsList.add(rocket1);
        rocketsList.add(rocket2);

        return rocketsList;


    }
}
