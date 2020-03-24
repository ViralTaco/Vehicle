package be.capobianco.vehicle;

import be.capobianco.vehicle.exception.TruckException;

public class Truck extends Vehicle {
  /** Minimum slots taken by a Truck on a Vehicle. */
  public static final double minSlots = 3.;
  /** Maximum slots taken by a Truck on a Vehicle. */
  public static final double maxSlots = 5.;

  private Truck() {
    super();
  }

  /**
   * @param slots The number of slots taken by the Truck in a Boat.
   * @throws TruckException if number of Truck.minSlots > slots > Truck.maxSlots
   */
  public Truck(final double slots) throws TruckException {
    this();
    this.setSlots(slots);
  }

  /**
   * @param slots      The number of slots taken by the Truck in a Boat.
   * @param passengers The number of passengers
   * @throws TruckException if number of Truck.minSlots > slots > Truck.maxSlots
   */
  public Truck(final double slots, final int passengers)
  throws TruckException {
    this(slots);
    this.setPassengers(passengers);
  }

  /**
   * Sets super.slots
   *
   * @param slots The number of slots taken by the Truck in a Boat.
   * @throws TruckException if number of Truck.minSlots > slots > Truck.maxSlots
   */
  public void setSlots(final double slots) throws TruckException {
    if (slots < Truck.minSlots || slots > Truck.maxSlots) {
      throw new TruckException(slots);
    } else if (!Double.isFinite(slots)) {
      throw new TruckException();
    }

    super.setSlots(slots);
  }
}