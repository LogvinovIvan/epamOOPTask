package by.bsuir.oop;

import by.bsuir.oop.entity.Airline;
import by.bsuir.oop.exceptions.CreatorException;
import by.bsuir.oop.report.View;
import by.bsuir.oop.utilits.CreatorOfAirline;
import by.bsuir.oop.utilits.Finder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class Start {

    static {
        new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
    }
    static Logger logger = Logger.getLogger(Start.class);

    public static void main(String[] args) {
	// write your code here

        Airline airline = new Airline();

        CreatorOfAirline creatorOfAirline = new CreatorOfAirline();
        try {
            airline.setPlanes(creatorOfAirline.initAirline("planes.xml"));

            View.showSortedSetOfPlanes(airline.getPlanes());

            View.showTotalCapacity(airline.getTotalCapacity());
            View.showTotalCountOfSeats(airline.getTotalCountOfSeats());

            View.showFoundedPlanes(Finder.findPlaneByFuelConsumption(21,8, airline.getPlanes()));
        } catch (CreatorException e) {
           logger.error(e);
        }

    }
}
