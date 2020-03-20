package be.capobianco.vehicle;

/**
 * @author Capobianco Anthony
 */
public abstract class Vehicle {

  private double slots;
  private int passengers;

  /**
   * @param slots The number of slots taken by the Vehicle in a Boat.
   */
  public Vehicle(final double slots) {
    this.slots = slots;
  }

  public double getSlots() {
    return this.slots;
  }

  public void setSlots(final double slots) {
    this.slots = slots;
  }

  public int getPassengers() {
    return this.passengers;
  }

  public void setPassengers(final int passengers) {
    this.passengers = passengers;
  }

}