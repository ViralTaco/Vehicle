package be.capobianco.vehicule;

import java.util.function.Function;

public class Truck extends Vehicule {
    /**
     * Minimum slots taken by a Truck on a Vehicule.
     */
    public static final int minSlots = 3;
    /**
     * Maximum slots taken by a Truck on a Vehicule.
     */
    public static final int maxSlots = 5;
    private static final IllegalArgumentException invalidSlotCount =
        new IllegalArgumentException(
            String.format("Truck takes from %d to %d Vehicule slots",
                          minSlots, maxSlots));

    /**
     * This constructor assumes worst case scenario.
     * ie: this.slots == Truck.maxSlots;
     */
    public Truck() {
        super(maxSlots);
    }

    /**
     * @param slots The number of slots taken by the Truck in a Boat.
     * @throws IllegalArgumentException if number of Truck.minSlots > slots > Truck.maxSlots
     */
    public Truck(final double slots) throws IllegalArgumentException {
        this();
        this.setSlots(slots);
    }

    /**
     * @param slots The number of slots taken by the Truck in a Boat.
     * @param passengers The number of passengers
     * @throws IllegalArgumentException if number of Truck.minSlots > slots > Truck.maxSlots
     */
    public Truck(final double slots, final int passengers)
    throws IllegalArgumentException {
        this(slots);
        this.setPassengers(passengers);
    }

    /**
     * Sets super.slots
     * @param slots The number of slots taken by the Truck in a Boat.
     * @throws IllegalArgumentException if number of Truck.minSlots > slots > Truck.maxSlots
     */
    @Override public void setSlots(final double slots)
    throws IllegalArgumentException {
        if (slots < Truck.minSlots || slots > Truck.maxSlots) {
            throw Truck.invalidSlotCount;
        }
        super.setSlots(slots);
    }
}