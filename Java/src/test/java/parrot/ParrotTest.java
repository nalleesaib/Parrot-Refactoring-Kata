package parrot;

import org.junit.Before;
import org.junit.Test;

import java.util.function.BiFunction;

import static org.junit.Assert.assertEquals;

public class ParrotTest {

    private SpeedCalculator speedCalculator;

    @Before
    public void setup(){
       // BiFunction<>
         speedCalculator = (double voltage, double baseSpeed) ->   Math.min(24.0, voltage * baseSpeed);
    }

    @Test
    public void getSpeedOfEuropeanParrot() {
        Parrot parrot = new EuropeanParrot(0, 0, false);
        parrot.setSpeedCalculator(this.speedCalculator);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
        Parrot parrot = new AfricanParrot( 1, 0, false);
        parrot.setSpeedCalculator(this.speedCalculator);
        assertEquals(3.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
        Parrot parrot = new AfricanParrot( 2, 0, false);
        parrot.setSpeedCalculator(this.speedCalculator);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
        Parrot parrot = new AfricanParrot( 0, 0, false);
        parrot.setSpeedCalculator(this.speedCalculator);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_nailed() {
        Parrot parrot = new NorwegianParrot( 0, 1.5, true);
        parrot.setSpeedCalculator(this.speedCalculator);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed() {
        Parrot parrot = new NorwegianParrot(0, 1.5, false);
        parrot.setSpeedCalculator(this.speedCalculator);
        assertEquals(18.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
        Parrot parrot = new NorwegianParrot( 0, 4, false);
        parrot.setSpeedCalculator(this.speedCalculator);
        assertEquals(24.0, parrot.getSpeed(), 0.0);
    }

}
