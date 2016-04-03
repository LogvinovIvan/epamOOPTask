package by.bsuir.oop.entity.planes;

/**
 * Created by Иван on 24.02.2016.
 */
public class ScrewPlane extends Plane {
    private int countScrew;

    public void setCountScrew(int countScrew) {
        this.countScrew = countScrew;
    }

    public int getCountScrew() {
        return countScrew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScrewPlane screwPlane = (ScrewPlane) o;

        if (countSeats != screwPlane.countSeats) return false;
        if (capacity != screwPlane.capacity) return false;
        if (fuelConsumption != screwPlane.fuelConsumption) return false;
        if (rangeFlight != screwPlane.rangeFlight) return false;
        if (countScrew != screwPlane.countScrew) return false;
        return name.equals(screwPlane.name);

    }

    @Override
    public int hashCode() {
        int result = countSeats;
        result = 31 * result + capacity;
        result = 31 * result + fuelConsumption;
        result = 31 * result + rangeFlight;
        result = 31 * result + countScrew;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "countSeats=" + countSeats +
                ", capacity=" + capacity +
                ", fuelConsumption=" + fuelConsumption +
                ", rangeFlight=" + rangeFlight +
                ", name='" + name +
                ", countScrew="+ countScrew +
                '\'' +
                '}';
    }
}
