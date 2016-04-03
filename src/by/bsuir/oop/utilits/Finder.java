package by.bsuir.oop.utilits;

import by.bsuir.oop.entity.planes.Plane;


import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Иван on 27.02.2016.
 */
public class Finder {

    public static Set<Plane> findPlaneByFuelConsumption(int maxValue, int minValue, Set<Plane> planes){
        Set<Plane> newPlanes = planes.stream().filter(plane -> plane.getFuelConsumption() < maxValue && plane.getFuelConsumption() > minValue).collect(Collectors.toSet());
        return newPlanes;
    }
}
