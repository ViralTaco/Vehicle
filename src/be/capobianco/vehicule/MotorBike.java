package be.capobianco.vehicule;

public class MotorBike extends Vehicule {
    public MotorBike() {
        super(0.5);
    }

    public MotorBike(final int passengers) {
        this();
        this.setPassengers(passengers);
    }
}
