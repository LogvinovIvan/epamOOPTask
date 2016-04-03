package by.bsuir.oop.factory;

import by.bsuir.oop.entity.planes.ScrewPlane;
import by.bsuir.oop.entity.planes.Plane;
import by.bsuir.oop.entity.planes.TurbinePlane;
import by.bsuir.oop.validation.ScrewPlanesParts;
import by.bsuir.oop.validation.TurbinePlaneParts;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Created by Иван on 28.02.2016.
 */
public class PlaneFactory {
    public static Plane createTurbinePlane(Element planeElement) {
        TurbinePlane plane = new TurbinePlane();
        plane.setCountSeats(Integer.parseInt(getElementTextContent(planeElement, TurbinePlaneParts.COUNT_SEATS.toString())));
        plane.setPowerTurbine(Integer.parseInt(getElementTextContent(planeElement, TurbinePlaneParts.POWER_TURBINE.toString())));
        plane.setCapacity(Integer.parseInt(getElementTextContent(planeElement, TurbinePlaneParts.CAPACITY.toString())));
        plane.setFuelConsumption(Integer.parseInt(getElementTextContent(planeElement, TurbinePlaneParts.FUEL_CONSUMPTION.toString())));
        plane.setRangeFlight(Integer.parseInt(getElementTextContent(planeElement, TurbinePlaneParts.RANGE_FLIGHT.toString())));
        plane.setName(getElementTextContent(planeElement, TurbinePlaneParts.NAME.toString()));
        return plane;
    }

    public static Plane createScrewPlane(Element planeElement) {
        ScrewPlane plane = new ScrewPlane();
        plane.setCountSeats(Integer.parseInt(getElementTextContent(planeElement, ScrewPlanesParts.COUNT_SEATS.toString())));
        plane.setCountScrew(Integer.parseInt(getElementTextContent(planeElement, ScrewPlanesParts.COUNT_SCREW.toString())));
        plane.setCapacity(Integer.parseInt(getElementTextContent(planeElement, ScrewPlanesParts.CAPACITY.toString())));
        plane.setFuelConsumption(Integer.parseInt(getElementTextContent(planeElement, ScrewPlanesParts.FUEL_CONSUMPTION.toString())));
        plane.setRangeFlight(Integer.parseInt(getElementTextContent(planeElement, ScrewPlanesParts.RANGE_FLIGHT.toString())));
        plane.setName(getElementTextContent(planeElement, ScrewPlanesParts.NAME.toString()));
        return plane;
    }

    protected static String getElementTextContent(Element element, String elementName) {
        NodeList nList = element.getElementsByTagName(elementName);
        Node node = nList.item(0);
        String text = node.getTextContent();
        return text;
    }
}
