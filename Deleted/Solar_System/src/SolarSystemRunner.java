public class SolarSystemRunner {
    public static void main(String[] args) {
        SolarSystem system1 = new SolarSystem();

        String starName = "Sun";
        int numberOfPlanets = 8;
        SolarSystem system2 = new SolarSystem(starName, numberOfPlanets);
        system2.info();

        starName = "Proxima Centauri";
        numberOfPlanets = 3;
        int numberOfMoons = 1;
        double solarMass = 0.123;
        SolarSystem system3 = new SolarSystem(starName, numberOfPlanets, numberOfMoons, solarMass);
        system3.info();

        starName = "Alpha Centauri A";
        numberOfPlanets = 5;
        numberOfMoons = 2;
        solarMass = 1.1;
        double averageTemperature = 5778;
        double ageInBillionYears = 4.5;
        SolarSystem system4 = new SolarSystem(starName, numberOfPlanets, numberOfMoons, solarMass, averageTemperature, ageInBillionYears);
        system4.info();

        starName = "TRAPPIST-1";
        numberOfPlanets = 7;
        numberOfMoons = 0;
        solarMass = 0.08;
        averageTemperature = 255;
        ageInBillionYears = 7.6;
        boolean hasAsteroidBelt = true;
        int numberOfDwarfPlanets = 2;
        double lightYearDistanceFromGalaxyCenter = 39.46;
        boolean hasLifeSupportingPlanet = true;
        SolarSystem system5 = new SolarSystem(starName, numberOfPlanets, numberOfMoons, solarMass, averageTemperature, ageInBillionYears, hasAsteroidBelt, numberOfDwarfPlanets, lightYearDistanceFromGalaxyCenter, hasLifeSupportingPlanet);
        system5.info();
    }
}
