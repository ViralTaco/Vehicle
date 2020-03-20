package be.capobianco.vehicle;

public class MotorBike extends Vehicle {

  public MotorBike() {
    super(0.5);
  }

  public MotorBike(final int passengers) {
    this();
    this.setPassengers(passengers);
  }
}
