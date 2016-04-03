package by.bsuir.oop.validation;


import by.bsuir.oop.exceptions.InvalidateXMLDataException;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Иван on 28.02.2016.
 */
@SuppressWarnings("Duplicates")
public class ValidatorXMLData {

    public static void validateNode(Element element) throws InvalidateXMLDataException {
        String nameOfNode = element.getNodeName();

        TypeOfPlanes plane = TypeOfPlanes.valueOf(nameOfNode.toUpperCase());

        switch (plane) {
            case TURBINE: {
                validateTurbinePlane(element);
                break;
            }
            case SCREW:
                validateScrewPlane(element);
                break;

            default:
                throw new InvalidateXMLDataException("Invalidate node in document");

        }
    }


    private static boolean validateTurbinePlane(Element element) throws InvalidateXMLDataException {
        NodeList childElement = null;

        for (TurbinePlaneParts part : TurbinePlaneParts.values()) {
            childElement = element.getElementsByTagName(part.toString());
            if (childElement.getLength() != 1) {
                throw new InvalidateXMLDataException("Absent tag in node");
            }

            if (!checkDataIntoTagsTurbine((Element) childElement.item(0), part)) {
                throw new InvalidateXMLDataException("Invalidate data in tag");
            }
        }

        return true;
    }


    private static void validateScrewPlane(Element element) throws InvalidateXMLDataException {
        NodeList childElement = null;

        for (ScrewPlanesParts part : ScrewPlanesParts.values()) {
            childElement = element.getElementsByTagName(part.toString());

            if (childElement.getLength() != 1) {
                int i = childElement.getLength();
                throw new InvalidateXMLDataException("Absent tag in node");
            }

            if (!checkDataIntoTagsScrew((Element) childElement.item(0), part)) {
                throw new InvalidateXMLDataException("Invalidate data in tag");
            }
        }


    }

    private static boolean checkDataIntoTagsTurbine(Element planeElement, TurbinePlaneParts planePart) {
        Pattern pattern;
        Matcher matcher;

        switch (planePart) {
            case NAME:
                pattern = Pattern.compile("^[A-Za-z0-9_-]+");
                matcher = pattern.matcher(planeElement.getTextContent());
                return matcher.matches();

            default:
                pattern = Pattern.compile("^[0-9]+");
                matcher = pattern.matcher(planeElement.getTextContent());
                return matcher.matches();
        }
    }


    private static boolean checkDataIntoTagsScrew(Element planeElement, ScrewPlanesParts planePart) {
        Pattern pattern;
        Matcher matcher;

        switch (planePart) {
            case NAME:
                pattern = Pattern.compile("^[A-Za-z0-9_-]+");
                matcher = pattern.matcher(planeElement.getTextContent());
                return matcher.matches();

            default:
                pattern = Pattern.compile("^[0-9]+");
                matcher = pattern.matcher(planeElement.getTextContent());
                return matcher.matches();
        }

    }
}
