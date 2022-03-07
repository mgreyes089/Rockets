public class Propeller {
    private int maxPower;
    private int currentPower = 0;


    public Propeller(int powerPropeller) throws Exception {
        checkValidPowerPropeller(powerPropeller);
        this.maxPower = powerPropeller;
    }

    private void checkValidPowerPropeller(int powerPropeller) throws Exception {
        if(powerPropeller<=0) throw new Exception("La potencia máxima debe ser mayor a cero");
    }

    public int getMaxPower() {
        return maxPower;
    }


    public int getCurrentPower() {
        return currentPower;
    }


    public void slowDown() {
        if ((currentPower + 10) > 0) {
            currentPower -= 10;
        }
    }

    public void accelerate() {
        if ((currentPower + 10) <= maxPower) {
            currentPower += 10;
        }
    }


    @Override
    public String toString() {
        return " " +
                " " + maxPower +
                " ";
    }
}