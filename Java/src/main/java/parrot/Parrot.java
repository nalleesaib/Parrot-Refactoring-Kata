package parrot;

/*
1. identifier les pbs du code (en terme de violation des principes de SOLID)
    -Non Respect du Single (S)
    -Non Respect du O
2. refactorer lorsque c'est nécessaire
3. Pouvoir ajouter un Parrot sans "beaucoup d'effort"
 */
public abstract  class Parrot {

    SpeedCalculator speedCalculator ;

    protected int numberOfCoconuts;
    protected double voltage;
    protected boolean isNailed;

    public Parrot() {
    }

    public Parrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public abstract  double getSpeed();


    protected double getBaseSpeed(double voltage) {

        return speedCalculator.calculate(voltage,getBaseSpeed());
    }

    protected double getLoadFactor() {
        return 9.0;
    }

    protected double getBaseSpeed() {
        return 12.0;
    }

    public void setSpeedCalculator(SpeedCalculator speedCalculator) {
        this.speedCalculator = speedCalculator;
    }
}
