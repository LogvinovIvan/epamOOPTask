package by.bsuir.oop.parsers;

import by.bsuir.oop.entity.planes.Plane;
import by.bsuir.oop.exceptions.InvalidateXMLDataException;
import by.bsuir.oop.exceptions.XMLParserOfPlanesException;
import by.bsuir.oop.factory.PlaneFactory;
import by.bsuir.oop.validation.TypeOfPlanes;
import by.bsuir.oop.validation.ValidatorXMLData;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Иван on 28.02.2016.
 */
public class PlaneDomParser {

    static Logger logger = Logger.getLogger(PlaneDomParser.class);
    private Set<Plane> planes;
    private DocumentBuilder docBuilder;

    public PlaneDomParser() throws XMLParserOfPlanesException {
        this.planes = new HashSet<>();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            docBuilder = factory.newDocumentBuilder();
            logger.info("Parser configured");
        } catch (ParserConfigurationException e) {
            throw new XMLParserOfPlanesException("Error of parser configuration: ", e);
        }
    }

    public Set<Plane> getPlanes() {
        return planes;
    }

    public void buildSetStudents(String fileName) throws XMLParserOfPlanesException {
        int countPlanes = 1;
        Document doc;
        try {
            doc = docBuilder.parse(fileName);
            Element root = doc.getDocumentElement();
            logger.info("Start of parsing");
            for (TypeOfPlanes typeOfPlane : TypeOfPlanes.values()) {
                NodeList planesList = root.getElementsByTagName(typeOfPlane.toString());
                for (int i = 0; i < planesList.getLength(); i++) {
                    Element planeElement = (Element) planesList.item(i);
                    try {
                        ValidatorXMLData.validateNode(planeElement);
                        Plane plane = buildPlane(planeElement);
                        planes.add(plane);
                        logger.info("Add " + String.valueOf(countPlanes) + " plane name = " + plane.getName());
                        countPlanes++;
                    } catch (InvalidateXMLDataException e) {
                        logger.error(e);
                    }

                }
                logger.info("End of parsing");
            }
        } catch (IOException e) {
            throw new XMLParserOfPlanesException("File error or I/O error: " + e);
        } catch (SAXException e) {
            throw new XMLParserOfPlanesException("Parsing failure: " + e);
        }
    }


    Plane buildPlane(Element planeElement) {
        switch (TypeOfPlanes.valueOf(planeElement.getTagName().toUpperCase())) {
            case TURBINE:
                return PlaneFactory.createTurbinePlane(planeElement);
            case SCREW:
                return PlaneFactory.createScrewPlane(planeElement);
            default:
                return null;
        }
    }


}
