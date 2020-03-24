package be.capobianco.vehicle;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import be.capobianco.vehicle.exception.TruckException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TruckTest {
  private Truck actual;

  @Test
  void testGetAndSetSlotsWithValidValue() {
    assertDoesNotThrow(() -> this.actual = new Truck(Truck.minSlots));
    assertEquals(Truck.minSlots, actual.getSlots());
    assertDoesNotThrow(() -> this.actual.setSlots(Truck.maxSlots));
    assertEquals(Truck.maxSlots, this.actual.getSlots());
  }

  @Test
  void testSetSlotsThrowsWhenValueIsNotInRange() {
    // above
    assertDoesNotThrow(() -> this.actual = new Truck(3.0));
    assertThrows(TruckException.class,
        () -> this.actual.setSlots(Truck.maxSlots + 1.0)
    );
    // below
    assertDoesNotThrow(() -> this.actual = new Truck(3.0));
    assertThrows(TruckException.class,
        () -> this.actual.setSlots(Truck.minSlots - 1.0)
    );
    // nan
    assertThrows(TruckException.class,
                 () -> this.actual = new Truck(Double.NaN));
    assertThrows(TruckException.class,
        () -> this.actual.setSlots(Double.NaN)
    );
  }

  @Test
  void testNewTruckWithInvalidValue() {
    assertThrows(TruckException.class,
        () -> this.actual = new Truck(Truck.minSlots - 1.0));
    assertThrows(TruckException.class,
        () -> this.actual = new Truck(Truck.maxSlots + 1.0));
  }

  @Test
  void testSetterWithValidValues() {
    assertDoesNotThrow(() -> this.actual = new Truck(3.0));
    this.actual.setPassengers(10);
    assertEquals(10, this.actual.getPassengers());

    assertDoesNotThrow(() -> this.actual.setSlots(3.0));
    assertEquals(3.0, this.actual.getSlots());

  }
}
