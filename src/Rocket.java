import java.util.ArrayList;
import java.util.List;

public class Rocket {
    protected String codeRocket;
    protected List<Propeller> propellers = new ArrayList<>();

    public Rocket(String codeRocket) {
        this.codeRocket = codeRocket;

    }

    public List<Propeller>getPropellerList (){
        return propellers;
    }

    public void addPropeller (int powerPropeller) throws Exception {
        Propeller propeller = new Propeller (powerPropeller);
        propellers.add(propeller);
    }

    public int getCurrentPower (){
        int result = 0;
        for (Propeller propeller: propellers)     {
            result += propeller.getCurrentPower();
        }
        return result;
    }

    public void slowDown(){
        for(Propeller propeller: propellers ){
            propeller.slowDown();
        }

    }
    public void accelerate(){
        for(Propeller propeller: propellers ){
            propeller.accelerate();
        }

    }




    @Override
    public String toString() {
        return " " +
                " " + codeRocket + '\'' +
                ": " + propellers +
                " ";
    }
}