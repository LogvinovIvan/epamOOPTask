package by.bsuir.oop.entity.planes;

/**
 * Created by Иван on 24.02.2016.
 */
public class TurbinePlane extends Plane {

    private int powerTurbine;

    public void setPowerTurbine(int powerTurbine) {
        this.powerTurbine = powerTurbine;
    }

    public int getPowerTurbine() {
        return powerTurbine;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TurbinePlane turbinePlane = (TurbinePlane) o;

        if (countSeats != turbinePlane.countSeats) return false;
        if (capacity != turbinePlane.capacity) return false;
        if (fuelConsumption != turbinePlane.fuelConsumption) return false;
        if (rangeFlight != turbinePlane.rangeFlight) return false;
        if (powerTurbine != turbinePlane.powerTurbine) return false;
        return name.equals(turbinePlane.name);

    }

    @Override
    public int hashCode() {
        int result = countSeats;
        result = 31 * result + capacity;
        result = 31 * result + fuelConsumption;
        result = 31 * result + rangeFlight;
        result = 31 * result + powerTurbine;
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
                ", powerTurbine=" + powerTurbine +
                '\'' +
                '}';
    }
}
