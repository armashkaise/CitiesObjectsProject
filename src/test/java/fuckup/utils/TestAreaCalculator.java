package fuckup.utils;

import fuckup.Street;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestAreaCalculator {
    Set<Street> streets = new HashSet<>();
    @Before
    public void setStreets(){
        streets.add(new Street("Республики", 1000, 8));
        streets.add(new Street("Ленина", 2000, 5));
        streets.add(new Street("Сталина", 3000, 10));
    }

    @Test
    public void testCalcArea(){
        Assert.assertEquals(48000, AreaCalculator.calcArea(streets));
    }

    @Test
    public void testCalcAreaForMainStreets() {
        int maxLentgh = 2_000;
        Assert.assertEquals(18_000, AreaCalculator.calcAreaForMainStreets(streets, maxLentgh));
    }
}
