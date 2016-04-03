package by.bsuir.oop.validation;

/**
 * Created by Иван on 28.02.2016.
 */
public enum TypeOfPlanes {
    TURBINE("turbine"),
    SCREW("screw");

    private final String text;


    TypeOfPlanes(final String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        return text;
    }

}
