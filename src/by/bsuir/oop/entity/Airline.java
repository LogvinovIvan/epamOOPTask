package by.bsuir.oop.entity;

import by.bsuir.oop.entity.planes.Plane;
import by.bsuir.oop.entity.planes.ScrewPlane;
import by.bsuir.oop.utilits.SortedByDistance;


import java.util.*;

/**
 * Created by Иван on 24.02.2016.
 */
public class Airline {

    private TreeSet<Plane> planes = new TreeSet<>(new SortedByDistance());

    public Set<Plane> getPlanes() {
        return (Set<Plane>) planes.clone();
    }

    public void setPlanes(Set<Plane> planes) {
        this.planes.addAll(planes);
    }


    public int getTotalCapacity() {
        int totalCapacity = 0;
        for (Plane plane : planes) {
            totalCapacity += plane.getCapacity();
        }
        return totalCapacity;
    }

    public int getTotalCountOfSeats(){
        int totalCountIfSeats = 0;
        for (Plane plane : planes){
            totalCountIfSeats+= plane.getCountSeats();
        }
        return totalCountIfSeats;
    }







}


