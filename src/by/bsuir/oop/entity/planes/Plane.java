package by.bsuir.oop.entity.planes;

/**
 * Created by Иван on 24.02.2016.
 */
public class Plane {


    protected int countSeats;
    protected int capacity;
    protected int fuelConsumption;
    protected int rangeFlight;
    protected String name;

    public Plane(){

    }

    public Plane(int countSeats, int capacity, int fuelConsumption, int rangeFlight, String name ){
        this.capacity = capacity;
        this.countSeats = countSeats;
        this.fuelConsumption = fuelConsumption;
        this.name = name;
        this.rangeFlight = rangeFlight;
    }



    public int getRangeFlight() {
        return rangeFlight;
    }

    public int getCountSeats() {
        return countSeats;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCountSeats(int countSeats) {
        this.countSeats = countSeats;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setRangeFlight(int rangeFlight) {
        this.rangeFlight = rangeFlight;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plane plane = (Plane) o;

        if (countSeats != plane.countSeats) return false;
        if (capacity != plane.capacity) return false;
        if (fuelConsumption != plane.fuelConsumption) return false;
        if (rangeFlight != plane.rangeFlight) return false;
        return name.equals(plane.name);

    }

    @Override
    public int hashCode() {
        int result = countSeats;
        result = 31 * result + capacity;
        result = 31 * result + fuelConsumption;
        result = 31 * result + rangeFlight;
        result = 31 * result + name.hashCode();
        return result;
    }
}
