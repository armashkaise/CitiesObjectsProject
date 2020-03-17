import fuckup.*;
import fuckup.utils.AreaCalculator;
import fuckup.utils.StreetProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        City city = new City();

        Set<Street> streets = city.getStreets();
        streets.add(new Street("Республики", 1000, 8));
        streets.add(new Street("Ленина", 2000, 5));
        streets.add(new Street("Сталина", 3000, 10));

        Set<Park> parks = city.getParks();
        parks.add(new Park("28 панфиловцев", 10, 20));
        parks.add(new Park("Победы", 20, 30));

        int areaOfStreets = AreaCalculator.calcArea(streets);
        int areaOfParks = AreaCalculator.calcArea(parks);

        Set<? extends AreaSize> areaSize = city.getAllAreaSizeble();

        City kostanay = new City();
        kostanay.addStreet(new Street("Аль-фараби", 1000, 8));
        kostanay.addStreet(new Street("Интернационалистов", 1000, 8));
        kostanay.addStreet(null);

        List<City> cities = List.<City>of(city, kostanay);
        Set<AreaSize> allStreets = StreetProcessing.findAllStreets(cities);

        int i = AreaCalculator.calcAreaForMainStreets(kostanay.getStreets(), 10000);
        System.out.println(i);
    }

}

