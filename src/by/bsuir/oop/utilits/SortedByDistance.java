package by.bsuir.oop.utilits;

import by.bsuir.oop.entity.planes.Plane;

import java.util.Comparator;

/**
 * Created by Иван on 27.02.2016.
 */
public class SortedByDistance implements Comparator<Plane> {
    @Override
    public int compare(Plane plane1, Plane plane2) {
        int maxDistance1 = plane1.getRangeFlight();
        int maxDistance2 = plane2.getRangeFlight();

        if (maxDistance1 > maxDistance2) {
            return 1;
        } else if (maxDistance1 < maxDistance2) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public Comparator<Plane> reversed() {
        return null;
    }


}
