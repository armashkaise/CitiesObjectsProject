package fuckup.utils;

import fuckup.AreaSize;
import fuckup.Street;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Stream;

final public class AreaCalculator {

    private AreaCalculator() {
    }

    public static int calcArea(Collection<? extends AreaSize> areaSizes) {
        int areaResult = 0;
        for (AreaSize areaSize : areaSizes) {
            areaResult += calcArea(areaSize);
        }
        return areaResult;
    }

    public static int calcAreaForMainStreets(Collection<Street> streets, int maxLentgh) {

        Stream<Street> stream = streets.stream();
        int i = stream
                .filter(Objects::nonNull)
                .filter(Street::inMain)
                .filter(street -> street.getLenght() <= maxLentgh)
                .mapToInt(AreaCalculator::calcArea)
                .sum();
        return i;
    }

    public static int calcArea(AreaSize areaSize) {
        return areaSize.getLenght() * areaSize.getWidth();
    }

}
