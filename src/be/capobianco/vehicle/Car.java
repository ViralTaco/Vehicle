package be.capobianco.vehicle;

public class Car extends Vehicle {

  public Car() {
    super(1.0);
  }

  public Car(final int passengers) {
    this();
    this.setPassengers(passengers);
  }
}
