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
        currentPower -= 10;
        if (currentPower < 0) {
            currentPower=0;
        }
    }

    public void accelerate() {
        currentPower += 10;
        if (currentPower > maxPower) {
            currentPower=maxPower;
        }
    }


    @Override
    public String toString() {
        return " " +
                " " + maxPower +
                " ";
    }
}