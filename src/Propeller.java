public class Propeller {
    private int powerPropeller;
    private int currentPower= 0;



    public Propeller(int powerPropeller) {
        this.powerPropeller = powerPropeller;
    }

    public int getPowerPropeller() {
        return powerPropeller;
    }

    public void setPowerPropeller(int powerPropeller) {
        this.powerPropeller = powerPropeller;
    }

    @Override
    public String toString() {
        return " " +
                " " + powerPropeller +
                " ";
    }
}