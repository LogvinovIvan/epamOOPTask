package by.bsuir.oop.report;

import by.bsuir.oop.entity.planes.Plane;

import java.util.Set;

/**
 * Created by Иван on 24.02.2016.
 */
public class View {

    public static void showTotalCapacity(int totalCapacity) {
        System.out.println("Total capacity = " + String.valueOf(totalCapacity));
    }

    public static void showTotalCountOfSeats(int countOfSeats) {
        System.out.println("Total count of seats = " + String.valueOf(countOfSeats));
    }


    public static void showSortedSetOfPlanes(Set<Plane> planes) {
        for (Plane plane : planes) {
            System.out.println(plane.toString());
        }
    }

    public static void showFoundedPlanes(Set<Plane> planes) {
        for (Plane plane : planes) {
            System.out.println(plane.toString());
        }
    }
}
