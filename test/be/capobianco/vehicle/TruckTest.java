package be.capobianco.vehicle;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TruckTest {

  private Truck actual;

  @BeforeEach
  void setUp() {
    this.actual = new Truck();
  }

  @Test
  void testGetAndSetSlotsWithValidValue() {
    assertDoesNotThrow(() -> this.actual.setSlots(Truck.maxSlots));
    assertEquals(Truck.maxSlots, this.actual.getSlots());
  }

  @Test
  void testSetSlotsThrowsWhenValueBiggerThanMax() {
    assertThrows(IllegalArgumentException.class,
        () -> this.actual.setSlots(Truck.maxSlots + 1.0)
    );
  }

  @Test
  void testSetSlotsThrowsWhenValueSmallerThanMin() {
    assertThrows(IllegalArgumentException.class,
        () -> this.actual.setSlots(Truck.minSlots - 1.0)
    );
  }

  @Test
  void testNewTruckWithInvalidValue() {
    assertThrows(IllegalArgumentException.class,
        () -> this.actual = new Truck(10.0),
        "Truck takes from 3 to 5 Vehicle slots");
  }

  @Test
  void testSetterWithValidValues() {
    this.actual.setPassengers(10);
    assertDoesNotThrow(() -> actual.setSlots(3.0));

    assertEquals(3.0, this.actual.getSlots());
    assertEquals(10, this.actual.getPassengers());
  }
}
