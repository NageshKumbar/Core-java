public class SolarSystem {
    String starName;
    int numberOfPlanets;
    int numberOfMoons;
    double solarMass;
    double averageTemperature;
    double ageInBillionYears;
    boolean hasAsteroidBelt;
    int numberOfDwarfPlanets;
    double lightYearDistanceFromGalaxyCenter;
    boolean hasLifeSupportingPlanet;

    public SolarSystem() {
        System.out.println("No parameter Constructor called.");
    }

    public SolarSystem(String starName, int numberOfPlanets) {
        this.starName = starName;
        this.numberOfPlanets = numberOfPlanets;
    }

    public SolarSystem(String starName, int numberOfPlanets, int numberOfMoons, double solarMass) {
        this(starName, numberOfPlanets);
        this.numberOfMoons = numberOfMoons;
        this.solarMass = solarMass;
    }

    public SolarSystem(String starName, int numberOfPlanets, int numberOfMoons, double solarMass, double averageTemperature, double ageInBillionYears) {
        this(starName, numberOfPlanets, numberOfMoons, solarMass);
        this.averageTemperature = averageTemperature;
        this.ageInBillionYears = ageInBillionYears;
    }

    public SolarSystem(String starName, int numberOfPlanets, int numberOfMoons, double solarMass, double averageTemperature, double ageInBillionYears, boolean hasAsteroidBelt, int numberOfDwarfPlanets, double lightYearDistanceFromGalaxyCenter, boolean hasLifeSupportingPlanet) {
        this(starName, numberOfPlanets, numberOfMoons, solarMass, averageTemperature, ageInBillionYears);
        this.hasAsteroidBelt = hasAsteroidBelt;
        this.numberOfDwarfPlanets = numberOfDwarfPlanets;
        this.lightYearDistanceFromGalaxyCenter = lightYearDistanceFromGalaxyCenter;
        this.hasLifeSupportingPlanet = hasLifeSupportingPlanet;
    }

    public void info(){
        System.out.println("Star Name: " + starName +
                ", Number of Planets: " + numberOfPlanets +
                ", Number of Moons: " + numberOfMoons +
                ", Solar Mass: " + solarMass +
                ", Average Temperature: " + averageTemperature +
                ", Age in Billion Years: " + ageInBillionYears +
                ", Has Asteroid Belt: " + hasAsteroidBelt +
                ", Number of Dwarf Planets: " + numberOfDwarfPlanets +
                ", Light Year Distance: " + lightYearDistanceFromGalaxyCenter +
                ", Has Life Supporting Planet: " + hasLifeSupportingPlanet);
    }
}
