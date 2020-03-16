package fuckup.utils;

public class StartAllTest {
    public static void main(String[] args) {
        TestAreaCalculator testAreaCalculator = new TestAreaCalculator();
        testAreaCalculator.setStreets();
        testAreaCalculator.testCalcArea();
        testAreaCalculator.testCalcAreaForMainStreets();

        TestStreetProcessing testStreetProcessing = new TestStreetProcessing();
        testStreetProcessing.setCity();
        testStreetProcessing.testFindAllStreets();

    }
}
