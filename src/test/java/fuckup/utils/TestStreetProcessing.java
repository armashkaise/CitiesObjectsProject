package fuckup.utils;

import fuckup.AreaSize;
import fuckup.City;
import fuckup.Street;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestStreetProcessing {
    List<City> cities = null;

    @Before
    public void setCity() {
        City city1 = new City();
        City city2 = new City();


        city1.addStreet(new Street("Республики", 1000, 8));
        city1.addStreet(new Street("Ленина", 2000, 5));
        city1.addStreet(new Street("Сталина", 3000, 10));

        city2.addStreet(new Street("Аль-фараби", 1000, 8));
        city2.addStreet(new Street("Интернационалистов", 1000, 8));
        city2.addStreet(null);
        cities = List.<City>of(city1, city2);
    }

    @Test
    public void testFindAllStreets() {
        Set<AreaSize> allFindStreets = StreetProcessing.findAllStreets(cities);

        Set<Street> resultSetStreets = new HashSet<>();
        for (City city : cities) {
            Set<Street> streets = city.getStreets();
            for (Street street : streets) {
                resultSetStreets.add(street);
            }
        }
        Assert.assertEquals(resultSetStreets, allFindStreets);
    }
}
