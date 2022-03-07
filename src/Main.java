import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws Exception{
        List<Rocket>rockets = createRockets();
        System.out.println(rockets);

        acelerate(rockets.get(0),3);
        acelerate(rockets.get(1),3);
        showTotalPower (rockets);

    }

    private static List<Rocket> createRockets() throws Exception{

        List<Rocket>rocketsList = new ArrayList<>();

        Rocket rocket1 = new Rocket("32WESSDS");
        Rocket rocket2 = new Rocket("LDSFJA32" );

        initPropellerRocket1 (rocket1);
        initPropellerRocket2(rocket2);
        rocketsList.add(rocket1);
        rocketsList.add(rocket2);

        return rocketsList;

    }
    private static void showTotalPower (Rocket rocket){
        System.out.println("La potencia total actual es: "+ rocket.getCurrentPower());
    }


    private static void initPropellerRocket2(Rocket rocket2) throws Exception{
        rocket2.addPropeller(30);
        rocket2.addPropeller(40);
        rocket2.addPropeller(50);
        rocket2.addPropeller(50);
        rocket2.addPropeller(30);
        rocket2.addPropeller(10);
    }

    private static void initPropellerRocket1(Rocket rocket1) throws Exception{
        rocket1.addPropeller(10);
        rocket1.addPropeller(30);
        rocket1.addPropeller(80);
    }

    private static void acelerate (Rocket rocket, int timesToAcelerate){
        for (int i = 0; i < timesToAcelerate; i++) {
            rocket.accelerate();
        }

    }
   /* private static void slowDown (Rocket rocket, int timesToSlowDown){
        for (int i = 0; i < timesToSlowDown; i++) {
        rocket.slowDown();
    }*/

}
