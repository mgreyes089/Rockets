import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Rocket>rockets = createRockets();
        System.out.println(rockets);



    }

    private static List<Rocket> createRockets() {

        List<Rocket>rocketsList = new ArrayList<>();

        rocketsList.add(new Rocket("32WESSDS", 3 ));
        rocketsList.add(new Rocket("LDSFJA32", 6 ));

        return rocketsList;
    }

}
