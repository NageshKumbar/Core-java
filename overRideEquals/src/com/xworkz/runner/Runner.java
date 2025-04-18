package com.xworkz.runner;

import com.xworkz.internal.*;

public class Runner {
    public static void main(String[] args) {
        // Blender Test
        Blender blender1 = new Blender("Vitamix", 1200, 64, true);
        Blender blender2 = new Blender("Vitamix", 1200, 64, true);
        Blender blender3 = new Blender("Ninja", 1000, 72, false);
        boolean blenderMatch = blender1.equals(blender2);
        boolean blenderNotMatch = blender2.equals(blender3);
        System.out.println("Blender Match: " + blenderMatch);
        System.out.println("Blender Not Match: " + blenderNotMatch);

// Umbrella Test
        Umbrella umbrella1 = new Umbrella("Golf", "Black", true, true);
        Umbrella umbrella2 = new Umbrella("Golf", "Black", true, true);
        Umbrella umbrella3 = new Umbrella("Compact", "Blue", false, false);
        boolean umbrellaMatch = umbrella1.equals(umbrella2);
        boolean umbrellaNotMatch = umbrella2.equals(umbrella3);
        System.out.println("Umbrella Match: " + umbrellaMatch);
        System.out.println("Umbrella Not Match: " + umbrellaNotMatch);

// Mouse Test
        Mouse mouse1 = new Mouse("Logitech", 1600, true, 6);
        Mouse mouse2 = new Mouse("Logitech", 1600, true, 6);
        Mouse mouse3 = new Mouse("Razer", 3200, true, 9);
        boolean mouseMatch = mouse1.equals(mouse2);
        boolean mouseNotMatch = mouse2.equals(mouse3);
        System.out.println("Mouse Match: " + mouseMatch);
        System.out.println("Mouse Not Match: " + mouseNotMatch);

// Monitor Test
        Monitor monitor1 = new Monitor("Dell", 27.0, "4K", false);
        Monitor monitor2 = new Monitor("Dell", 27.0, "4K", false);
        Monitor monitor3 = new Monitor("Samsung", 32.0, "QHD", true);
        boolean monitorMatch = monitor1.equals(monitor2);
        boolean monitorNotMatch = monitor2.equals(monitor3);
        System.out.println("Monitor Match: " + monitorMatch);
        System.out.println("Monitor Not Match: " + monitorNotMatch);

// Jacket Test
        Jacket jacket1 = new Jacket("Nylon", "M", true, true);
        Jacket jacket2 = new Jacket("Nylon", "M", true, true);
        Jacket jacket3 = new Jacket("Polyester", "L", false, false);
        boolean jacketMatch = jacket1.equals(jacket2);
        boolean jacketNotMatch = jacket2.equals(jacket3);
        System.out.println("Jacket Match: " + jacketMatch);
        System.out.println("Jacket Not Match: " + jacketNotMatch);

// Sofa Test
        Sofa sofa1 = new Sofa("Leather", "Brown", 3, true);
        Sofa sofa2 = new Sofa("Leather", "Brown", 3, true);
        Sofa sofa3 = new Sofa("Fabric", "Gray", 2, false);
        boolean sofaMatch = sofa1.equals(sofa2);
        boolean sofaNotMatch = sofa2.equals(sofa3);
        System.out.println("Sofa Match: " + sofaMatch);
        System.out.println("Sofa Not Match: " + sofaNotMatch);

// Fan Test
        Fan fan1 = new Fan("Ceiling", 3, true, true);
        Fan fan2 = new Fan("Ceiling", 3, true, true);
        Fan fan3 = new Fan("Table", 2, false, false);
        boolean fanMatch = fan1.equals(fan2);
        boolean fanNotMatch = fan2.equals(fan3);
        System.out.println("Fan Match: " + fanMatch);
        System.out.println("Fan Not Match: " + fanNotMatch);

// GamingConsole Test
        GamingConsole console1 = new GamingConsole("PlayStation", 1000, "5", true);
        GamingConsole console2 = new GamingConsole("PlayStation", 1000, "5", true);
        GamingConsole console3 = new GamingConsole("Xbox", 512, "Series X", true);
        boolean consoleMatch = console1.equals(console2);
        boolean consoleNotMatch = console2.equals(console3);
        System.out.println("Console Match: " + consoleMatch);
        System.out.println("Console Not Match: " + consoleNotMatch);

// AirPurifier Test
        AirPurifier purifier1 = new AirPurifier("Dyson", 500, "HEPA", true);
        AirPurifier purifier2 = new AirPurifier("Dyson", 500, "HEPA", true);
        AirPurifier purifier3 = new AirPurifier("Honeywell", 300, "Carbon", false);
        boolean purifierMatch = purifier1.equals(purifier2);
        boolean purifierNotMatch = purifier2.equals(purifier3);
        System.out.println("Purifier Match: " + purifierMatch);
        System.out.println("Purifier Not Match: " + purifierNotMatch);

// Drone Test
        Drone drone1 = new Drone("DJI", "4K", 30, true);
        Drone drone2 = new Drone("DJI", "4K", 30, true);
        Drone drone3 = new Drone("Parrot", "1080p", 15, false);
        boolean droneMatch = drone1.equals(drone2);
        boolean droneNotMatch = drone2.equals(drone3);
        System.out.println("Drone Match: " + droneMatch);
        System.out.println("Drone Not Match: " + droneNotMatch);

// Suitcase Test
        Suitcase suitcase1 = new Suitcase("Polycarbonate", "Medium", true, true);
        Suitcase suitcase2 = new Suitcase("Polycarbonate", "Medium", true, true);
        Suitcase suitcase3 = new Suitcase("Nylon", "Large", false, false);
        boolean suitcaseMatch = suitcase1.equals(suitcase2);
        boolean suitcaseNotMatch = suitcase2.equals(suitcase3);
        System.out.println("Suitcase Match: " + suitcaseMatch);
        System.out.println("Suitcase Not Match: " + suitcaseNotMatch);

// Toaster Test
        Toaster toaster1 = new Toaster("Cuisinart", 2, 6, true);
        Toaster toaster2 = new Toaster("Cuisinart", 2, 6, true);
        Toaster toaster3 = new Toaster("Black+Decker", 4, 4, false);
        boolean toasterMatch = toaster1.equals(toaster2);
        boolean toasterNotMatch = toaster2.equals(toaster3);
        System.out.println("Toaster Match: " + toasterMatch);
        System.out.println("Toaster Not Match: " + toasterNotMatch);

// HairDryer Test
        HairDryer dryer1 = new HairDryer("Dyson", 1600, 3, true);
        HairDryer dryer2 = new HairDryer("Dyson", 1600, 3, true);
        HairDryer dryer3 = new HairDryer("Revlon", 1875, 2, false);
        boolean dryerMatch = dryer1.equals(dryer2);
        boolean dryerNotMatch = dryer2.equals(dryer3);
        System.out.println("Hair Dryer Match: " + dryerMatch);
        System.out.println("Hair Dryer Not Match: " + dryerNotMatch);

// Vacuum Test
        Vacuum vacuum1 = new Vacuum("Shark", "Upright", true, true);
        Vacuum vacuum2 = new Vacuum("Shark", "Upright", true, true);
        Vacuum vacuum3 = new Vacuum("Dyson", "Stick", true, false);
        boolean vacuumMatch = vacuum1.equals(vacuum2);
        boolean vacuumNotMatch = vacuum2.equals(vacuum3);
        System.out.println("Vacuum Match: " + vacuumMatch);
        System.out.println("Vacuum Not Match: " + vacuumNotMatch);

// Calculator Test
        Calculator calculator1 = new Calculator("Texas Instruments", "Scientific", true, true);
        Calculator calculator2 = new Calculator("Texas Instruments", "Scientific", true, true);
        Calculator calculator3 = new Calculator("Casio", "Basic", false, false);
        boolean calculatorMatch = calculator1.equals(calculator2);
        boolean calculatorNotMatch = calculator2.equals(calculator3);
        System.out.println("Calculator Match: " + calculatorMatch);
        System.out.println("Calculator Not Match: " + calculatorNotMatch);

// Flashlight Test
        Flashlight flashlight1 = new Flashlight("Maglite", 1000, true, true);
        Flashlight flashlight2 = new Flashlight("Maglite", 1000, true, true);
        Flashlight flashlight3 = new Flashlight("Fenix", 1200, false, true);
        boolean flashlightMatch = flashlight1.equals(flashlight2);
        boolean flashlightNotMatch = flashlight2.equals(flashlight3);
        System.out.println("Flashlight Match: " + flashlightMatch);
        System.out.println("Flashlight Not Match: " + flashlightNotMatch);

// Thermos Test
        Thermos thermos1 = new Thermos("Stainless Steel", 24.0, true, true);
        Thermos thermos2 = new Thermos("Stainless Steel", 24.0, true, true);
        Thermos thermos3 = new Thermos("Plastic", 16.0, false, false);
        boolean thermosMatch = thermos1.equals(thermos2);
        boolean thermosNotMatch = thermos2.equals(thermos3);
        System.out.println("Thermos Match: " + thermosMatch);
        System.out.println("Thermos Not Match: " + thermosNotMatch);

// BoardGame Test
        BoardGame game1 = new BoardGame("Catan", 4, "10+", false);
        BoardGame game2 = new BoardGame("Catan", 4, "10+", false);
        BoardGame game3 = new BoardGame("Pandemic", 5, "8+", true);
        boolean gameMatch = game1.equals(game2);
        boolean gameNotMatch = game2.equals(game3);
        System.out.println("Board Game Match: " + gameMatch);
        System.out.println("Board Game Not Match: " + gameNotMatch);

// FryingPan Test
        FryingPan pan1 = new FryingPan("Stainless Steel", 12.0, true, true);
        FryingPan pan2 = new FryingPan("Stainless Steel", 12.0, true, true);
        FryingPan pan3 = new FryingPan("Cast Iron", 10.0, false, false);
        boolean panMatch = pan1.equals(pan2);
        boolean panNotMatch = pan2.equals(pan3);
        System.out.println("Frying Pan Match: " + panMatch);
        System.out.println("Frying Pan Not Match: " + panNotMatch);

// AlarmClock Test
        AlarmClock clock1 = new AlarmClock("Sony", "Digital", true, true);
        AlarmClock clock2 = new AlarmClock("Sony", "Digital", true, true);
        AlarmClock clock3 = new AlarmClock("Emerson", "Analog", false, false);
        boolean clockMatch = clock1.equals(clock2);
        boolean clockNotMatch = clock2.equals(clock3);
        System.out.println("Alarm Clock Match: " + clockMatch);
        System.out.println("Alarm Clock Not Match: " + clockNotMatch);

// YogaMat Test
        YogaMat mat1 = new YogaMat("PVC", 0.25, "Textured", true);
        YogaMat mat2 = new YogaMat("PVC", 0.25, "Textured", true);
        YogaMat mat3 = new YogaMat("Rubber", 0.5, "Smooth", false);
        boolean matMatch = mat1.equals(mat2);
        boolean matNotMatch = mat2.equals(mat3);
        System.out.println("Yoga Mat Match: " + matMatch);
        System.out.println("Yoga Mat Not Match: " + matNotMatch);

// WaterBottle Test
        WaterBottle waterBottle1 = new WaterBottle("Stainless Steel", 32.0, true, true);
        WaterBottle waterBottle2 = new WaterBottle("Stainless Steel", 32.0, true, true);
        WaterBottle waterBottle3 = new WaterBottle("Plastic", 24.0, false, false);
        boolean waterBottleMatch = waterBottle1.equals(waterBottle2);
        boolean waterBottleNotMatch = waterBottle2.equals(waterBottle3);
        System.out.println("Water Bottle Match: " + waterBottleMatch);
        System.out.println("Water Bottle Not Match: " + waterBottleNotMatch);

// Toolbox Test
        Toolbox toolbox1 = new Toolbox("Metal", "Large", 3, true);
        Toolbox toolbox2 = new Toolbox("Metal", "Large", 3, true);
        Toolbox toolbox3 = new Toolbox("Plastic", "Medium", 2, false);
        boolean toolboxMatch = toolbox1.equals(toolbox2);
        boolean toolboxNotMatch = toolbox2.equals(toolbox3);
        System.out.println("Toolbox Match: " + toolboxMatch);
        System.out.println("Toolbox Not Match: " + toolboxNotMatch);

// Perfume Test
        Perfume perfume1 = new Perfume("Chanel", "Floral", 3.4, "Eau de Parfum");
        Perfume perfume2 = new Perfume("Chanel", "Floral", 3.4, "Eau de Parfum");
        Perfume perfume3 = new Perfume("Dior", "Woody", 1.7, "Eau de Toilette");
        boolean perfumeMatch = perfume1.equals(perfume2);
        boolean perfumeNotMatch = perfume2.equals(perfume3);
        System.out.println("Perfume Match: " + perfumeMatch);
        System.out.println("Perfume Not Match: " + perfumeNotMatch);

// Lamp Test
        Lamp lamp1 = new Lamp("Desk", "LED", true, true);
        Lamp lamp2 = new Lamp("Desk", "LED", true, true);
        Lamp lamp3 = new Lamp("Floor", "Incandescent", false, false);
        boolean lampMatch = lamp1.equals(lamp2);
        boolean lampNotMatch = lamp2.equals(lamp3);
        System.out.println("Lamp Match: " + lampMatch);
        System.out.println("Lamp Not Match: " + lampNotMatch);

// Notebook Test
        Notebook notebook1 = new Notebook(200, "A5", true, true);
        Notebook notebook2 = new Notebook(200, "A5", true, true);
        Notebook notebook3 = new Notebook(100, "A4", false, false);
        boolean notebookMatch = notebook1.equals(notebook2);
        boolean notebookNotMatch = notebook2.equals(notebook3);
        System.out.println("Notebook Match: " + notebookMatch);
        System.out.println("Notebook Not Match: " + notebookNotMatch);

// Basketball Test
        Basketball basketball1 = new Basketball("Spalding", "Official", "Leather", true);
        Basketball basketball2 = new Basketball("Spalding", "Official", "Leather", true);
        Basketball basketball3 = new Basketball("Wilson", "Intermediate", "Rubber", false);
        boolean basketballMatch = basketball1.equals(basketball2);
        boolean basketballNotMatch = basketball2.equals(basketball3);
        System.out.println("Basketball Match: " + basketballMatch);
        System.out.println("Basketball Not Match: " + basketballNotMatch);

// Tent Test
        Tent tent1 = new Tent(4, "3-season", 8.5, true);
        Tent tent2 = new Tent(4, "3-season", 8.5, true);
        Tent tent3 = new Tent(2, "4-season", 5.0, false);
        boolean tentMatch = tent1.equals(tent2);
        boolean tentNotMatch = tent2.equals(tent3);
        System.out.println("Tent Match: " + tentMatch);
        System.out.println("Tent Not Match: " + tentNotMatch);

    }
}
