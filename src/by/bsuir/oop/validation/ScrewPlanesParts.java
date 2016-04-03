package by.bsuir.oop.validation;

/**
 * Created by Иван on 28.02.2016.
 */


public enum ScrewPlanesParts {
    COUNT_SEATS("countSeats"),
    CAPACITY("capacity"),
    FUEL_CONSUMPTION("fuelConsumption"),
    RANGE_FLIGHT("rangeFlight"),
    NAME("name"),
    COUNT_SCREW("countScrew");

    private final String text;


     ScrewPlanesParts(final String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        return text;
    }
    }
