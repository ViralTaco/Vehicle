package be.capobianco.vehicle.exception;

import be.capobianco.vehicle.Truck;

public class TruckException extends RuntimeException {
    private static final String slotRange = /// %.0f <- don't show decimals.
        String.format("Truck expects a number of slots between %.0f and %.0f.",
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
