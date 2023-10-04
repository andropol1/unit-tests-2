package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {
    private Car car1;
    private Motorcycle moto1;
    @BeforeEach
    public void setUp(){
        car1 = new Car("Audi", "A8", 2005);
        moto1 = new Motorcycle("BMW", "M1", 1998);
    }
    @Test
    public void testCarIsOffspringOfVehicle() {
        assertTrue(car1 instanceof Vehicle);
    }

    @Test
    public void testCarHas4Wheels() {
        assertEquals(4, car1.getNumWheels(), "У данного объекта не 4 колеса!");
    }

    @Test
    public void testMotocycleHas2Wheels() {
        assertEquals(2, moto1.getNumWheels(), "У данного объекта не 2 колеса!");
    }

    @Test
    public void testCarSpeedTestDrive(){
        int expectedSpeed = 60;
        car1.testDrive();
        assertEquals(expectedSpeed, car1.getSpeed(), "Данная машина не развивает скорость 60!");
    }
    @Test
    public void testMotoSpeedTestDrive(){
        int expectedSpeed = 75;
        moto1.testDrive();
        assertEquals(expectedSpeed, moto1.getSpeed(), "Данный мотоцикл не развивает скорость 75!");
    }
    @Test
    public void testCarPark(){
        car1.testDrive();
        car1.park();
        int expectedSpeed = 0;
        assertEquals(expectedSpeed, car1.getSpeed(), "Машина не припаркована!");
    }

    @Test
    public void testMotoPark(){
        moto1.testDrive();
        moto1.park();
        int expectedSpeed = 0;
        assertEquals(expectedSpeed, moto1.getSpeed(), "Мотоцикл не припаркован!");
    }

}