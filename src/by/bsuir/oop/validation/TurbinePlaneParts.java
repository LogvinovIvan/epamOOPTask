package by.bsuir.oop.validation;

/**
 * Created by Иван on 28.02.2016.
 */
public enum TurbinePlaneParts {

    COUNT_SEATS("countSeats"),
    CAPACITY("capacity"),
    FUEL_CONSUMPTION("fuelConsumption"),
    RANGE_FLIGHT("rangeFlight"),
    NAME("name"),
    POWER_TURBINE("powerTurbine");

    private final String text;


    private TurbinePlaneParts(final String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        return text;
    }
}
