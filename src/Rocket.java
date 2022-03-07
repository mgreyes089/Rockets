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

    public void addPropeller (int powerPropeller){
        Propeller propeller = new Propeller (powerPropeller);
        propellers.add(propeller);
    }

    @Override
    public String toString() {
        return " " +
                " " + codeRocket + '\'' +
                ": " + propellers +
                " ";
    }
}