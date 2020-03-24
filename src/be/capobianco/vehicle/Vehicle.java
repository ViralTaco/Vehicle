package be.capobianco.vehicle;

import be.capobianco.vehicle.exception.TruckException;

import static java.lang.Double.NaN;

/**
 * @author Capobianco Anthony
 */
public abstract class Vehicle {

  private double slots;
  private int passengers;

  public Vehicle() {
    this.slots = NaN;
    this.passengers = 0;
  }
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