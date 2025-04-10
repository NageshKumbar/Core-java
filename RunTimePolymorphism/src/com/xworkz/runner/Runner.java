package com.xworkz.runner;

import com.xworkz.internal.*;

public class Runner {
    public static void main(String[] args) {

        TV tv=new TV();
        tv.usetv();
        TV ptv=new ProTv();
        ptv.usetv();
        ProTv proTv=new ProTv();
        proTv.usetv();
        proTv.maintaintv();
        System.out.println("===============================================================");

        Laptop laptop=new Laptop();
        laptop.uselaptop();
        Laptop laptop1=new SmartLaptop();
        laptop1.uselaptop();
        SmartLaptop smartLaptop=new SmartLaptop();
        smartLaptop.maintainlaptop();
        smartLaptop.uselaptop();
        System.out.println("===============================================================");

        SmartPhone smartPhone=new SmartPhone();
        smartPhone.usesmartphone();
        SmartPhone smartPhone1=new MaxSmartphone();
        smartPhone1.usesmartphone();
        MaxSmartphone maxSmartphone=new MaxSmartphone();
        maxSmartphone.maintainsmartphone();
        maxSmartphone.usesmartphone();
        System.out.println("===============================================================");

        Camera camera=new Camera();
        camera.usecamera();
        Camera camera1=new MaxCamera();
        camera1.usecamera();
        MaxCamera maxCamera=new MaxCamera();
        maxCamera.usecamera();
        maxCamera.maitaincamera();
        System.out.println("===============================================================");

        Refrigerator refrigerator=new Refrigerator();
        refrigerator.useref();
        Refrigerator refrigerator1=new UltraRefrigerator();
        refrigerator1.useref();
        UltraRefrigerator ultraRefrigerator=new UltraRefrigerator();
        ultraRefrigerator.useref();
        ultraRefrigerator.maintainRef();
        System.out.println("===============================================================");

        WashingMachine washingMachine=new WashingMachine();
        washingMachine.usewashmachine();
        WashingMachine washingMachine1=new EliteWashingMachine();
        washingMachine1.usewashmachine();
        EliteWashingMachine eliteWashingMachine=new EliteWashingMachine();
        eliteWashingMachine.usewashmachine();
        eliteWashingMachine.maintainwashingmachine();
        System.out.println("===============================================================");

        AirConditioner airConditioner=new AirConditioner();
        airConditioner.useaircondtioner();
        AirConditioner airConditioner1=new MaxAirConditioner();
        airConditioner1.useaircondtioner();
        MaxAirConditioner maxAirConditioner=new MaxAirConditioner();
        maxAirConditioner.useaircondtioner();
        maxAirConditioner.maintianairconditioner();
        System.out.println("===============================================================");

        Microwave microwave=new Microwave();
        microwave.usemicrowave();
        Microwave microwave1=new UltraMicrowave();
        microwave1.usemicrowave();
        UltraMicrowave ultraMicrowave=new UltraMicrowave();
        ultraMicrowave.usemicrowave();
        ultraMicrowave.maintainmicrowave();
        System.out.println("===============================================================");

        Printer printer=new Printer();
        printer.useprinter();
        Printer printer1=new MaxPrinter();
        printer1.useprinter();
        MaxPrinter maxPrinter=new MaxPrinter();
        maxPrinter.useprinter();
        maxPrinter.mainprinter();
        System.out.println("===============================================================");

        Speaker speaker=new Speaker();
        speaker.useseaker();
        Speaker speaker1=new ProSpeaker();
        speaker1.useseaker();
        ProSpeaker proSpeaker=new ProSpeaker();
        proSpeaker.useseaker();
        proSpeaker.mainseaker();
        System.out.println("===============================================================");

        SmartWatch smartWatch=new SmartWatch();
        smartWatch.usesmartwatch();
        SmartWatch smartWatch1=new EliteSmartWatch();
        EliteSmartWatch eliteSmartWatch=new EliteSmartWatch();
        eliteSmartWatch.usesmartwatch();
        eliteSmartWatch.mainsmartwatch();
        System.out.println("===============================================================");

        Router router=new Router();
        router.userouter();
        Router router1=new MaxRouter();
        router1.userouter();
        MaxRouter maxRouter=new MaxRouter();
        maxRouter.userouter();
        maxRouter.mainrouter();
        System.out.println("===============================================================");

        Tablet tablet=new Tablet();
        tablet.usetablet();
        Tablet tablet1=new SmartTablet();
        tablet1.usetablet();
        SmartTablet smartTablet=new SmartTablet();
        smartTablet.usetablet();
        smartTablet.maintablet();
        System.out.println("===============================================================");

        Drone drone=new Drone();
        drone.usedrone();
        Drone drone1=new UltraDrone();
        UltraDrone ultraDrone=new UltraDrone();
        ultraDrone.usedrone();
        ultraDrone.maindrone();
        System.out.println("===============================================================");

        Projector projector=new Projector();
        projector.useprojector();
        Projector projector1=new ProProjector();
        projector1.useprojector();
        ProProjector projector2=new ProProjector();
        projector2.useprojector();
        projector2.mainprojector();
        System.out.println("===============================================================");

        VacuumCleaner vacuumCleaner=new VacuumCleaner();
        vacuumCleaner.usevaccum();
        VacuumCleaner vacuumCleaner1=new SmartVacuumCleaner();
        vacuumCleaner1.usevaccum();
        SmartVacuumCleaner smartVacuumCleaner=new SmartVacuumCleaner();
        smartVacuumCleaner.usevaccum();
        smartVacuumCleaner.mainvaccumn();
        System.out.println("===============================================================");

        SmartLight smartLight=new SmartLight();
        smartLight.usesmartlight();
        SmartLight smartLight1=new EliteSmartLight();
        smartLight1.usesmartlight();
        EliteSmartWatch eliteSmartWatch1=new EliteSmartWatch();
        eliteSmartWatch1.usesmartwatch();
        eliteSmartWatch1.mainsmartwatch();
        System.out.println("===============================================================");

        CoffeeMaker coffeeMaker=new CoffeeMaker();
        coffeeMaker.usecoffe();
        CoffeeMaker coffeeMaker1=new UltraCoffeeMaker();
        coffeeMaker1.usecoffe();
        UltraCoffeeMaker ultraCoffeeMaker=new UltraCoffeeMaker();
        ultraCoffeeMaker.usecoffe();
        ultraCoffeeMaker.maincoffee();
        System.out.println("===============================================================");

        Oven oven=new Oven();
        oven.useoven();
        Oven oven1=new MaxOven();
        oven1.useoven();
        MaxOven maxOven=new MaxOven();
        maxOven.useoven();
        maxOven.mainoven();
        System.out.println("===============================================================");

        Toaster toaster=new Toaster();
        toaster.usetoaster();
        Toaster toaster1=new ProToaster();
        toaster1.usetoaster();
        ProToaster proToaster=new ProToaster();
        proToaster.usetoaster();
        proToaster.maintoster();
        System.out.println("===============================================================");

        Blender blender=new Blender();
        blender.useblender();
        Blender blender1=new UltraBlender();
        blender1.useblender();
        UltraBlender ultraBlender=new UltraBlender();
        ultraBlender.useblender();
        ultraBlender.mainbleder();
        System.out.println("===============================================================");

        ElectricKettle electricKettle=new ElectricKettle();
        electricKettle.usekettle();
        ElectricKettle electricKettle1=new SmartElectricKettle();
        electricKettle1.usekettle();
        SmartElectricKettle smartElectricKettle=new SmartElectricKettle();
        smartElectricKettle.usekettle();
        smartElectricKettle.mainkettle();
        System.out.println("===============================================================");

        HairDryer hairDryer=new HairDryer();
        hairDryer.usehairdryer();
        HairDryer hairDryer1=new MaxHairDryer();
        hairDryer1.usehairdryer();
        MaxHairDryer maxHairDryer=new MaxHairDryer();
        maxHairDryer.mainhairdryer();
        maxHairDryer.usehairdryer();
        System.out.println("===============================================================");

        Heater heater=new Heater();
        heater.useheater();
        Heater heater1=new EliteHeater();
        heater1.useheater();
        EliteHeater eliteHeater=new EliteHeater();
        eliteHeater.useheater();
        eliteHeater.mainheater();
        System.out.println("===============================================================");

        GameConsole gameConsole=new GameConsole();
        gameConsole.useconsole();
        GameConsole gameConsole1=new SmartGameConsole();
        gameConsole1.useconsole();
        SmartGameConsole smartGameConsole=new SmartGameConsole();
        smartGameConsole.mainconsole();
        smartGameConsole.useconsole();
        System.out.println("===============================================================");

        Monitor monitor=new Monitor();
        monitor.usemonitor();
        Monitor monitor1=new UltraMonitor();
        monitor1.usemonitor();
        UltraMonitor ultraMonitor=new UltraMonitor();
        ultraMonitor.usemonitor();
        ultraMonitor.mainmonitor();
        System.out.println("===============================================================");

        FitnessTracker fitnessTracker=new FitnessTracker();
        fitnessTracker.usetracker();
        FitnessTracker fitnessTracker1=new MaxFitnessTracker();
        fitnessTracker1.usetracker();
        MaxFitnessTracker maxFitnessTracker=new MaxFitnessTracker();
        maxFitnessTracker.usetracker();
        maxFitnessTracker.maintracker();
        System.out.println("===============================================================");

        Fan fan=new Fan();
        fan.usefan();
        Fan fan1=new SmartFan();
        fan1.usefan();
        SmartFan smartFan=new SmartFan();
        smartFan.usefan();
        smartFan.mainfan();
        System.out.println("===============================================================");

        Iron iron=new Iron();
        iron.useiron();
        Iron iron1=new ProIron();
        iron1.useiron();
        ProIron proIron=new ProIron();
        proIron.useiron();
        proIron.mainiron();
        System.out.println("===============================================================");

        SmartDoorbell smartDoorbell=new SmartDoorbell();
        smartDoorbell.usrdoorbell();
        SmartDoorbell smartDoorbell1=new EliteSmartDoorbell();
        smartDoorbell1.usrdoorbell();
        EliteSmartDoorbell eliteSmartDoorbell=new EliteSmartDoorbell();
        eliteSmartDoorbell.usrdoorbell();
        eliteSmartDoorbell.maindoorbell();
        System.out.println("===============================================================");

        SecurityCamera securityCamera=new SecurityCamera();
        securityCamera.usesecuritycamere();
        SecurityCamera securityCamera1=new UltraSecurityCamera();
        securityCamera1.usesecuritycamere();
        UltraSecurityCamera ultraSecurityCamera=new UltraSecurityCamera();
        ultraSecurityCamera.usesecuritycamere();
        ultraSecurityCamera.mainsecuritycamera();
        System.out.println("===============================================================");

        Ebike ebike=new Ebike();
        ebike.useebike();
        Ebike ebike1=new MaxEbike();
        ebike1.useebike();
        MaxEbike maxEbike=new MaxEbike();
        maxEbike.useebike();
        maxEbike.mainebike();
        System.out.println("===============================================================");

        LawnMower lawnMower=new LawnMower();
        lawnMower.uselawnmover();
        LawnMower lawnMower1=new SmartLawnMower();
        lawnMower1.uselawnmover();
        SmartLawnMower smartLawnMower=new SmartLawnMower();
        smartLawnMower.uselawnmover();
        smartLawnMower.mainlawnover();
        System.out.println("===============================================================");

        RobotPet robotPet=new RobotPet();
        robotPet.userobotpet();
        RobotPet robotPet1=new ProRobotPet();
        robotPet1.userobotpet();
        ProRobotPet proRobotPet=new ProRobotPet();
        proRobotPet.userobotpet();
        proRobotPet.mainrobotpet();
        System.out.println("===============================================================");

        ThreedPrinter threedPrinter=new ThreedPrinter();
        threedPrinter.usethreedprinter();
        ThreedPrinter threedPrinter1=new EliteThreedPrinter();
        threedPrinter1.usethreedprinter();
        EliteThreedPrinter eliteThreedPrinter=new EliteThreedPrinter();
        eliteThreedPrinter.usethreedprinter();
        eliteThreedPrinter.mainthreedprinter();
        System.out.println("===============================================================");

        SmartMirror smartMirror=new SmartMirror();
        smartMirror.usemirror();
        SmartMirror smartMirror1=new UltraSmartMirror();
        smartMirror1.usemirror();
        UltraSmartMirror ultraSmartMirror=new UltraSmartMirror();
        ultraSmartMirror.usemirror();
        ultraSmartMirror.mainmirror();
        System.out.println("===============================================================");

        Dishwasher dishwasher=new Dishwasher();
        dishwasher.usedishwasher();
        Dishwasher dishwasher1=new MaxDishwasher();
        dishwasher1.usedishwasher();
        MaxDishwasher maxDishwasher=new MaxDishwasher();
        maxDishwasher.usedishwasher();
        maxDishwasher.maindishwasher();
        System.out.println("===============================================================");

        SteamMop steamMop=new SteamMop();
        steamMop.usemop();
        SteamMop steamMop1=new SmartSteamMop();
        SmartSteamMop smartSteamMop=new SmartSteamMop();
        smartSteamMop.usemop();
        smartSteamMop.mainmop();
        System.out.println("===============================================================");

        BluetoothTracker bluetoothTracker=new BluetoothTracker();
        bluetoothTracker.useblue();
        BluetoothTracker bluetoothTracker1=new ProBluetoothTracker();
        bluetoothTracker1.useblue();
        ProBluetoothTracker proBluetoothTracker=new ProBluetoothTracker();
        proBluetoothTracker.useblue();
        proBluetoothTracker.mainblue();
        System.out.println("===============================================================");

        ElectricScooter electricScooter=new ElectricScooter();
        electricScooter.usescooter();
        ElectricScooter electricScooter1=new MaxElectricScooter();
        electricScooter1.usescooter();
        MaxElectricScooter maxElectricScooter=new MaxElectricScooter();
        maxElectricScooter.usescooter();
        maxElectricScooter.mainscooter();
        System.out.println("===============================================================");

        PowerBank powerBank=new PowerBank();
        powerBank.usepowerbank();
        PowerBank powerBank1=new UltraPowerBank();
        powerBank1.usepowerbank();
        UltraPowerBank ultraPowerBank=new UltraPowerBank();
        ultraPowerBank.usepowerbank();
        ultraPowerBank.mainusepowerbank();
        System.out.println("===============================================================");

        GraphicsTablet graphicsTablet=new GraphicsTablet();
        graphicsTablet.usetablet();
        GraphicsTablet graphicsTablet1=new ProGraphicsTablet();
        graphicsTablet1.usetablet();
        ProGraphicsTablet proGraphicsTablet=new ProGraphicsTablet();
        proGraphicsTablet.usetablet();
        proGraphicsTablet.maintablet();
        System.out.println("===============================================================");

        PortableAC portableAC=new PortableAC();
        portableAC.useportable();
        PortableAC portableAC1=new SmartPortableAC();
        portableAC1.useportable();
        SmartPortableAC smartPortableAC=new SmartPortableAC();
        smartPortableAC.useportable();
        smartPortableAC.mainportable();
        System.out.println("===============================================================");

        Dehumidifier dehumidifier=new Dehumidifier();
        dehumidifier.usemidifier();
        Dehumidifier dehumidifier1=new EliteDehumidifier();
        dehumidifier1.usemidifier();
        EliteDehumidifier eliteDehumidifier=new EliteDehumidifier();
        eliteDehumidifier.usemidifier();
        eliteDehumidifier.maindiffer();
        System.out.println("===============================================================");

        AirPurifier airPurifier=new AirPurifier();
        airPurifier.useair();
        AirPurifier airPurifier1=new UltraAirPurifier();
        airPurifier1.useair();
        UltraAirPurifier ultraAirPurifier=new UltraAirPurifier();
        ultraAirPurifier.useair();
        ultraAirPurifier.mainair();
        System.out.println("===============================================================");

        WaterPurifier waterPurifier=new WaterPurifier();
        waterPurifier.usepurifier();
        WaterPurifier waterPurifier1=new MaxWaterPurifier();
        waterPurifier1.usepurifier();
        MaxWaterPurifier maxWaterPurifier=new MaxWaterPurifier();
        maxWaterPurifier.usepurifier();
        maxWaterPurifier.mainpurifier();
        System.out.println("===============================================================");

        SmartLock smartLock=new SmartLock();
        smartLock.uselock();
        SmartLock smartLock1=new SmartSmartLock();
        smartLock1.uselock();
        SmartSmartLock smartSmartLock=new SmartSmartLock();
        smartSmartLock.mainlock();
        smartSmartLock.uselock();
        System.out.println("===============================================================");

        SmartGlasses smartGlasses=new SmartGlasses();
        smartGlasses.useglasses();
        SmartGlasses smartGlasses1=new ProSmartGlasses();
        smartGlasses1.useglasses();
        ProSmartGlasses proSmartGlasses=new ProSmartGlasses();
        proSmartGlasses.useglasses();
        proSmartGlasses.mainglasses();
        System.out.println("===============================================================");

        HomeTheater homeTheater=new HomeTheater();
        homeTheater.usetheater();
        HomeTheater homeTheater1=new EliteHomeTheater();
        homeTheater1.usetheater();
        EliteHomeTheater eliteHomeTheater=new EliteHomeTheater();
        eliteHomeTheater.usetheater();
        eliteHomeTheater.maintheater();
        System.out.println("===============================================================");

        BarcodeScanner barcodeScanner=new BarcodeScanner();
        barcodeScanner.usebar();
        BarcodeScanner barcodeScanner1=new MaxBarcodeScanner();
        barcodeScanner1.usebar();
        MaxBarcodeScanner maxBarcodeScanner=new MaxBarcodeScanner();
        maxBarcodeScanner.usebar();
        maxBarcodeScanner.mainbar();
        System.out.println("===============================================================");

        POSMachine posMachine=new POSMachine();
        posMachine.usemachine();
        POSMachine posMachine1=new SmartPOSMachine();
        posMachine1.usemachine();
        SmartPOSMachine smartPOSMachine=new SmartPOSMachine();
        smartPOSMachine.mainmachine();
        smartPOSMachine.usemachine();
        System.out.println("===============================================================");

        SmartThermostat smartThermostat=new SmartThermostat();
        smartThermostat.usesmart();
        SmartThermostat smartThermostat1=new ProSmartThermostat();
        smartThermostat1.usesmart();
        ProSmartThermostat proSmartThermostat=new ProSmartThermostat();
        proSmartThermostat.usesmart();
        proSmartThermostat.mainsmart();
        System.out.println("===============================================================");

        DashCam dashCam=new DashCam();
        dashCam.usedash();
        DashCam dashCam1=new UltraDashCam();
        dashCam1.usedash();
        UltraDashCam dashCam2=new UltraDashCam();
        dashCam2.usedash();
        dashCam2.maindash();
        System.out.println("===============================================================");

        Soundbar soundbar=new Soundbar();
        soundbar.usesounde();
        Soundbar soundbar1=new MaxSoundbar();
        soundbar1.usesounde();
        MaxSoundbar soundbar2=new MaxSoundbar();
        soundbar2.usesounde();
        soundbar2.mainsounder();
        System.out.println("===============================================================");

        WalkieTalkie walkieTalkie=new WalkieTalkie();
        walkieTalkie.usewalk();
        WalkieTalkie walkieTalkie1=new EliteWalkieTalkie();
        walkieTalkie1.usewalk();
        EliteWalkieTalkie eliteWalkieTalkie=new EliteWalkieTalkie();
        eliteWalkieTalkie.mainwalk();
        eliteWalkieTalkie.usewalk();
        System.out.println("===============================================================");

        Intercom intercom=new Intercom();
        intercom.useinter();
        Intercom intercom1=new ProIntercom();
        intercom1.useinter();
        ProIntercom proIntercom=new ProIntercom();
        proIntercom.useinter();
        proIntercom.maininter();
        System.out.println("===============================================================");

        RiceCooker riceCooker=new RiceCooker();
        riceCooker.userice();
        RiceCooker riceCooker1=new SmartRiceCooker();
        riceCooker1.userice();
        SmartRiceCooker smartRiceCooker=new SmartRiceCooker();
        smartRiceCooker.userice();
        smartRiceCooker.mainrice();
        System.out.println("===============================================================");

        SlowCooker slowCooker=new SlowCooker();
        slowCooker.usecook();
        SlowCooker slowCooker1=new UltraSlowCooker();
        slowCooker1.usecook();
        UltraSlowCooker ultraSlowCooker=new UltraSlowCooker();
        ultraSlowCooker.maincook();
        ultraSlowCooker.usecook();
        System.out.println("===============================================================");

        Juicer juicer=new Juicer();
        juicer.usejuice();
        Juicer juicer1=new ProJuicer();
        juicer1.usejuice();
        ProJuicer proJuicer=new ProJuicer();
        proJuicer.mainjuice();
        proJuicer.usejuice();
        System.out.println("===============================================================");

        AirFryer airFryer=new AirFryer();
        airFryer.useair();
        AirFryer airFryer1=new EliteAirFryer();
        airFryer1.useair();
        EliteAirFryer eliteAirFryer=new EliteAirFryer();
        eliteAirFryer.mainair();
        eliteAirFryer.useair();
        System.out.println("===============================================================");

        SandwichMaker sandwichMaker=new SandwichMaker();
        sandwichMaker.usesand();
        SandwichMaker sandwichMaker1=new MaxSandwichMaker();
        sandwichMaker1.usesand();
        MaxSandwichMaker sandwichMaker2=new MaxSandwichMaker();
        sandwichMaker2.mainand();
        sandwichMaker2.usesand();
        System.out.println("===============================================================");

        WaterHeater waterHeater=new WaterHeater();
        waterHeater.water();
        WaterHeater waterHeater1=new UltraWaterHeater();
        waterHeater1.water();
        UltraWaterHeater waterHeater2=new UltraWaterHeater();
        waterHeater2.mainwater();
        waterHeater2.water();
        System.out.println("===============================================================");

        Treadmill treadmill=new Treadmill();
        treadmill.usetread();
        Treadmill treadmill1=new SmartTreadmill();
        treadmill1.usetread();
        SmartTreadmill smartTreadmill=new SmartTreadmill();
        smartTreadmill.maintread();
        smartTreadmill.usetread();
        System.out.println("===============================================================");

        EllipticalTrainer ellipticalTrainer=new EllipticalTrainer();
        ellipticalTrainer.useelli();
        EllipticalTrainer ellipticalTrainer1=new ProEllipticalTrainer();
        ellipticalTrainer1.useelli();
        ProEllipticalTrainer proEllipticalTrainer=new ProEllipticalTrainer();
        proEllipticalTrainer.useelli();
        proEllipticalTrainer.mainelli();
        System.out.println("===============================================================");

        MassageChair massageChair=new MassageChair();
        massageChair.usemass();
        MassageChair massageChair1=new EliteMassageChair();
        massageChair1.usemass();
        EliteMassageChair eliteMassageChair=new EliteMassageChair();
        eliteMassageChair.usemass();
        eliteMassageChair.mainmass();
        System.out.println("===============================================================");

        SmartScale smartScale=new SmartScale();
        smartScale.usesmart();
        SmartScale smartScale1=new UltraSmartScale();
        smartScale1.usesmart();
        UltraSmartScale ultraSmartScale=new UltraSmartScale();
        ultraSmartScale.mainsmart();
        ultraSmartScale.usesmart();
        System.out.println("===============================================================");

        AirHumidifier airHumidifier=new AirHumidifier();
        airHumidifier.useair();
        AirHumidifier airHumidifier1=new MaxAirHumidifier();
        airHumidifier1.useair();
        MaxAirHumidifier maxAirHumidifier=new MaxAirHumidifier();
        maxAirHumidifier.mainair();
        maxAirHumidifier.useair();
        System.out.println("===============================================================");

        DigitalClock digitalClock=new DigitalClock();
        digitalClock.usedigital();
        DigitalClock digitalClock1=new SmartDigitalClock();
        digitalClock1.usedigital();
        SmartDigitalClock smartDigitalClock=new SmartDigitalClock();
        smartDigitalClock.usedigital();
        smartDigitalClock.maindigita();
        System.out.println("===============================================================");

        WeatherStation weatherStation=new WeatherStation();
        weatherStation.useweather();
        WeatherStation weatherStation1=new ProWeatherStation();
        weatherStation1.useweather();
        ProWeatherStation proWeatherStation=new ProWeatherStation();
        proWeatherStation.mainweather();
        proWeatherStation.useweather();
        System.out.println("===============================================================");

        SmartCurtain smartCurtain=new SmartCurtain();
        smartCurtain.usesmart();
        SmartCurtain smartCurtain1=new EliteSmartCurtain();
        smartCurtain1.usesmart();
        EliteSmartCurtain eliteSmartCurtain=new EliteSmartCurtain();
        eliteSmartCurtain.usesmart();
        eliteSmartCurtain.mainsmart();
        System.out.println("===============================================================");

        ElectricBlanket electricBlanket=new ElectricBlanket();
        electricBlanket.useele();
        ElectricBlanket electricBlanket1=new UltraElectricBlanket();
        electricBlanket1.useele();
        UltraElectricBlanket ultraElectricBlanket=new UltraElectricBlanket();
        ultraElectricBlanket.useele();
        ultraElectricBlanket.mainele();
        System.out.println("===============================================================");

        SmartSocket smartSocket=new SmartSocket();
        smartSocket.usesmart();
        SmartSocket smartSocket1=new MaxSmartSocket();
        smartCurtain1.usesmart();
        MaxSmartSocket maxSmartSocket=new MaxSmartSocket();
        maxSmartSocket.mainsmart();
        maxSmartSocket.usesmart();
        System.out.println("===============================================================");

        SmartRemote smartRemote=new SmartRemote();
        smartRemote.usesmart();
        SmartRemote smartRemote1=new SmartSmartRemote();
        smartRemote1.usesmart();
        SmartSmartRemote smartSmartRemote=new SmartSmartRemote();
        smartSmartRemote.mainsmart();
        smartSmartRemote.usesmart();
        System.out.println("===============================================================");

        SmartSprinkler smartSprinkler=new SmartSprinkler();
        smartSprinkler.usesmart();
        SmartSprinkler smartSprinkler1=new ProSmartSprinkler();
        smartSprinkler1.usesmart();
        ProSmartSprinkler proSmartSprinkler=new ProSmartSprinkler();
        proSmartSprinkler.mainsmart();
        proSmartSprinkler.usesmart();
        System.out.println("===============================================================");

        BabyMonitor babyMonitor=new BabyMonitor();
        babyMonitor.usebaby();
        BabyMonitor babyMonitor1=new EliteBabyMonitor();
        babyMonitor1.usebaby();
        EliteBabyMonitor eliteBabyMonitor=new EliteBabyMonitor();
        eliteBabyMonitor.mainbaby();
        eliteBabyMonitor.usebaby();
        System.out.println("===============================================================");

        GarageDoorOpener garageDoorOpener=new GarageDoorOpener();
        garageDoorOpener.usegarage();
        GarageDoorOpener garageDoorOpener1=new UltraGarageDoorOpener();
        garageDoorOpener1.usegarage();
        UltraGarageDoorOpener ultraGarageDoorOpener=new UltraGarageDoorOpener();
        ultraGarageDoorOpener.maingarage();
        ultraGarageDoorOpener.usegarage();
        System.out.println("===============================================================");

        SmartFaucet smartFaucet=new SmartFaucet();
        smartFaucet.usesmart();
        SmartFaucet smartFaucet1=new MaxSmartFaucet();
        smartFaucet1.usesmart();
        MaxSmartFaucet maxSmartFaucet=new MaxSmartFaucet();
        maxSmartFaucet.mainsmart();
        maxSmartFaucet.usesmart();
        System.out.println("===============================================================");

        SmartMat smartMat=new SmartMat();
        smartMat.usesmart();
        SmartMat smartMat1=new SmartSmartMat();
        sandwichMaker1.usesand();
        SmartSmartMat smartSmartMat=new SmartSmartMat();
        smartSmartMat.mainsmart();
        smartSmartMat.usesmart();
        System.out.println("===============================================================");

        SmartHelmet smartHelmet=new SmartHelmet();
        smartHelmet.usesmart();
        SmartHelmet smartHelmet1=new ProSmartHelmet();
        smartHelmet1.usesmart();
        ProSmartHelmet proSmartHelmet=new ProSmartHelmet();
        proSmartHelmet.mainsmart();
        proSmartHelmet.usesmart();
        System.out.println("===============================================================");

        VRHeadset vrHeadset=new VRHeadset();
        vrHeadset.usehead();
        VRHeadset vrHeadset1=new EliteVRHeadset();
        vrHeadset1.usehead();
        EliteVRHeadset eliteVRHeadset=new EliteVRHeadset();
        eliteVRHeadset.mainhead();
        eliteVRHeadset.usehead();
        System.out.println("===============================================================");

        DronePro dronePro=new DronePro();
        dronePro.usedrone();
        DronePro dronePro1=new UltraDronePro();
        dronePro1.usedrone();
        UltraDronePro ultraDronePro=new UltraDronePro();
        ultraDronePro.maindrone();
        ultraDronePro.usedrone();
        System.out.println("===============================================================");

        ActionCamera actionCamera=new ActionCamera();
        actionCamera.useaction();
        ActionCamera actionCamera1=new MaxActionCamera();
        actionCamera1.useaction();
        MaxActionCamera maxActionCamera=new MaxActionCamera();
        maxActionCamera.useaction();
        maxActionCamera.mainaction();
        System.out.println("===============================================================");

        ElectricGrill electricGrill=new ElectricGrill();
        electricGrill.useele();
        ElectricGrill electricGrill1=new SmartElectricGrill();
        electricGrill1.useele();
        SmartElectricGrill smartElectricGrill=new SmartElectricGrill();
        smartElectricGrill.useele();
        smartElectricGrill.mainele();
        System.out.println("===============================================================");

        ProjectorPro projectorPro=new ProjectorPro();
        projectorPro.usepro();
        ProjectorPro projectorPro1=new ProProjectorPro();
        projectorPro.usepro();
        ProProjectorPro proProjectorPro=new ProProjectorPro();
        proProjectorPro.usepro();
        proProjectorPro.mainpro();
        System.out.println("===============================================================");

        DigitalMicroscope digitalMicroscope=new DigitalMicroscope();
        digitalMicroscope.usedigital();
        DigitalMicroscope digitalMicroscope1=new EliteDigitalMicroscope();
        digitalMicroscope1.usedigital();
        EliteDigitalMicroscope eliteDigitalMicroscope=new EliteDigitalMicroscope();
        eliteDigitalMicroscope.usedigital();
        eliteDigitalMicroscope.maindigital();
        System.out.println("===============================================================");

        SmartNotebook smartNotebook=new SmartNotebook();
        smartNotebook.usesmart();
        SmartNotebook smartNotebook1=new UltraSmartNotebook();
        smartNotebook1.usesmart();
        UltraSmartNotebook ultraSmartNotebook=new UltraSmartNotebook();
        ultraSmartNotebook.usesmart();
        ultraSmartNotebook.mainsmart();
        System.out.println("===============================================================");

        BloodPressureMonitor bloodPressureMonitor=new BloodPressureMonitor();
        bloodPressureMonitor.useblood();
        BloodPressureMonitor bloodPressureMonitor1=new SmartBloodPressureMonitor();
        bloodPressureMonitor1.useblood();
        SmartBloodPressureMonitor smartBloodPressureMonitor=new SmartBloodPressureMonitor();
        smartBloodPressureMonitor.useblood();
        smartBloodPressureMonitor.mainblood();
        System.out.println("===============================================================");

        ECGMonitor ecgMonitor=new ECGMonitor();
        ecgMonitor.useecg();
        ECGMonitor ecgMonitor1=new ProECGMonitor();
        ecgMonitor1.useecg();
        ProECGMonitor proECGMonitor=new ProECGMonitor();
        proECGMonitor.useecg();
        proECGMonitor.mainecg();
        System.out.println("===============================================================");

        GlucoseMonitor glucoseMonitor=new GlucoseMonitor();
        glucoseMonitor.useglu();
        GlucoseMonitor glucoseMonitor1=new EliteGlucoseMonitor();
        glucoseMonitor1.useglu();
        EliteGlucoseMonitor eliteGlucoseMonitor=new EliteGlucoseMonitor();
        eliteGlucoseMonitor.mainglu();
        eliteGlucoseMonitor.useglu();
        System.out.println("===============================================================");

        SmartShoe smartShoe=new SmartShoe();
        smartShoe.usesmart();
        SmartShoe smartShoe1=new UltraSmartShoe();
        smartShoe1.usesmart();
        UltraSmartShoe ultraSmartShoe=new UltraSmartShoe();
        ultraSmartShoe.mainsmart();
        ultraSmartShoe.usesmart();
        System.out.println("===============================================================");

        SmartTrashCan smartTrashCan=new SmartTrashCan();
        smartTrashCan.usesmart();
        SmartTrashCan smartTrashCan1=new SmartSmartTrashCan();
        smartTrashCan1.usesmart();
        SmartSmartTrashCan smartSmartTrashCan=new SmartSmartTrashCan();
        smartSmartTrashCan.mainsmart();
        smartSmartTrashCan.usesmart();
        System.out.println("===============================================================");

        SmartPen smartPen=new SmartPen();
        smartPen.usepen();
        SmartPen smartPen1=new EliteSmartPen();
        smartPen1.usepen();
        EliteSmartPen eliteSmartPen=new EliteSmartPen();
        eliteSmartPen.usepen();
        eliteSmartPen.mainpen();
        System.out.println("===============================================================");

        WindowCleaner windowCleaner=new WindowCleaner();
        windowCleaner.usewindow();
        WindowCleaner windowCleaner1=new MaxWindowCleaner();
        windowCleaner1.usewindow();
        MaxWindowCleaner maxWindowCleaner=new MaxWindowCleaner();
        maxWindowCleaner.usewindow();
        maxWindowCleaner.mainwindow();
        System.out.println("===============================================================");

        SmartTowel smartTowel=new SmartTowel();
        smartTowel.usetowel();
        SmartTowel smartTowel1=new SmartSmartTowel();
        smartTowel1.usetowel();
        SmartSmartTowel smartSmartTowel=new SmartSmartTowel();
        smartSmartTowel.usetowel();
        smartSmartTowel.maintowel();
    }
}
