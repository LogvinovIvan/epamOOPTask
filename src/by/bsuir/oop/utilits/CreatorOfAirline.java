package by.bsuir.oop.utilits;

import by.bsuir.oop.entity.planes.Plane;
import by.bsuir.oop.exceptions.CreatorException;
import by.bsuir.oop.exceptions.XMLParserOfPlanesException;
import by.bsuir.oop.parsers.PlaneDomParser;

import java.util.Set;

/**
 * Created by Иван on 28.02.2016.
 */
public class CreatorOfAirline {

    public Set<Plane> initAirline(String fileName) throws CreatorException {
        try {
            PlaneDomParser parser = new PlaneDomParser();
            parser.buildSetStudents("planes.xml");
            return parser.getPlanes();
        } catch (XMLParserOfPlanesException e) {
            throw new CreatorException(e);
        }

    }
}
