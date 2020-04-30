package parrot;

public class NorwegianParrot extends Parrot {

    public NorwegianParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(numberOfCoconuts,voltage,isNailed);
    }

    @Override
    public double getSpeed() {
        return (this.isNailed) ? 0 : getBaseSpeed(this.voltage);
    }
}
