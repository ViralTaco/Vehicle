package be.capobianco.vehicle.exception;

import be.capobianco.vehicle.Truck;

public class TruckException extends RuntimeException {
    private static final String slotRange =
        String.format("Truck expects a number of slots between %d and %d.",
                      Truck.minSlots,
                      Truck.maxSlots);

    public TruckException() {
        super(TruckException.slotRange);
    }

    public TruckException(double actual) {
        super(String.format("%s But received %f.",
                            TruckException.slotRange,
                            actual));
    }
}
