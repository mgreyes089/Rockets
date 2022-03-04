import java.util.Objects;

public class Rocket {
    protected String codeRocket;
    protected int numPropellers;

    public Rocket(String codeRocket, int numPropellers) {
        this.codeRocket = codeRocket;
        this.numPropellers = numPropellers;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "codeRocket='" + codeRocket + '\'' +
                ", numPropellers=" + numPropellers +
                '}';
    }


}
