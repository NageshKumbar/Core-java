package com.xworkz.runner;

import com.xworkz.internal.*;

public class Runner {
    public static void main(String[] args) {
        Device device = new Device();
        Device laptopAsBase = new Laptop();
        device.powerOn();
        laptopAsBase.powerOn();
        Laptop laptop = new Laptop();
        laptop.powerOn();
        laptop.openLid();

        System.out.println("-----------");
        Animal animal = new Animal();
        Animal dog = new Dog();
        animal.eat();
        dog.eat();
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();

        System.out.println("-----------");
        Account account = new Account();
        Account savings = new SavingsAccount();
        account.deposit();
        savings.deposit();
        SavingsAccount mySavings = new SavingsAccount();
        mySavings.deposit();
        mySavings.calculateInterest();

        System.out.println("-----------");
        Shape shape = new Shape();
        Shape circle = new Circle();
        shape.draw();
        circle.draw();
        Circle myCircle = new Circle();
        myCircle.draw();
        myCircle.calculateRadius();

        System.out.println("-----------");
        Employee employee = new Employee();
        Employee manager = new Manager();
        employee.work();
        manager.work();
        Manager myManager = new Manager();
        myManager.work();
        myManager.manageTeam();

        System.out.println("-----------");
        Person person = new Person();
        Person student = new Student();
        person.introduce();
        student.introduce();
        Student myStudent = new Student();
        myStudent.introduce();
        myStudent.study();

        System.out.println("-----------");
        Product product = new Product();
        Product electronics = new Electronics();
        product.display();
        electronics.display();
        Electronics myElectronics = new Electronics();
        myElectronics.display();
        myElectronics.checkWarranty();

        System.out.println("-----------");
        Vehicle vehicle = new Vehicle();
        Vehicle airplane = new Airplane();
        vehicle.move();
        airplane.move();
        Airplane myPlane = new Airplane();
        myPlane.move();
        myPlane.takeOff();

        System.out.println("-----------");
        MedicalProfessional professional = new MedicalProfessional();
        MedicalProfessional doctor = new Doctor();
        professional.treatPatient();
        doctor.treatPatient();
        Doctor myDoctor = new Doctor();
        myDoctor.treatPatient();
        myDoctor.prescribeMedicine();

        System.out.println("-----------");
        FoodItem item = new FoodItem();
        FoodItem pizza = new Pizza();
        item.prepare();
        pizza.prepare();
        Pizza myPizza = new Pizza();
        myPizza.prepare();
        myPizza.addToppings();

        System.out.println("-----------");
        Item iteam = new Item();
        Item book = new Book();
        iteam.checkOut();
        book.checkOut();
        Book myBook = new Book();
        myBook.checkOut();
        myBook.read();

        System.out.println("-----------");
        Instrument instrument = new Instrument();
        Instrument guitar = new Guitar();
        instrument.play();
        guitar.play();
        Guitar myGuitar = new Guitar();
        myGuitar.play();
        myGuitar.tuneStrings();

        System.out.println("-----------");
        Game game = new Game();
        Game football = new Football();
        game.play();
        football.play();
        Football myFootball = new Football();
        myFootball.play();
        myFootball.scoreGoal();

        System.out.println("-----------");
        Phenomenon phenomenon = new Phenomenon();
        Phenomenon rain = new Rain();
        phenomenon.occur();
        rain.occur();
        Rain myRain = new Rain();
        myRain.occur();
        myRain.measureRainfall();

        System.out.println("-----------");
        Plant plant = new Plant();
        Plant flower = new Flower();
        plant.grow();
        flower.grow();
        Flower myFlower = new Flower();
        myFlower.grow();
        myFlower.bloom();

        System.out.println("-----------");
        Camera camera = new Camera();
        Camera dslr = new DSLRCamera();
        camera.capture();
        dslr.capture();
        DSLRCamera myDSLR = new DSLRCamera();
        myDSLR.capture();
        myDSLR.changeLens();

        System.out.println("-----------");
        Exercise exercise = new Exercise();
        Exercise lifting = new WeightLifting();
        exercise.perform();
        lifting.perform();
        WeightLifting myWorkout = new WeightLifting();
        myWorkout.perform();
        myWorkout.increaseWeight();

        System.out.println("-----------");
        Garment garment = new Garment();
        Garment shirt = new Shirt();
        garment.wear();
        shirt.wear();
        Shirt myShirt = new Shirt();
        myShirt.wear();
        myShirt.buttonUp();

        System.out.println("-----------");
        Building building = new Building();
        Building skyscraper = new Skyscraper();
        building.construct();
        skyscraper.construct();
        Skyscraper myTower = new Skyscraper();
        myTower.construct();
        myTower.installElevator();

        System.out.println("-----------");
        Investment investment = new Investment();
        Investment stock = new Stock();
        investment.grow();
        stock.grow();
        Stock myStock = new Stock();
        myStock.grow();
        myStock.trade();

        System.out.println("-----------");
        Course course = new Course();
        Course programming = new ProgrammingCourse();
        course.teach();
        programming.teach();
        ProgrammingCourse javaCourse = new ProgrammingCourse();
        javaCourse.teach();
        javaCourse.debugCode();

        System.out.println("-----------");
        CarPart part = new CarPart();
        CarPart engine = new Engine();
        part.function();
        engine.function();
        Engine myEngine = new Engine();
        myEngine.function();
        myEngine.checkOil();

        System.out.println("-----------");
        Gadget gadget = new Gadget();
        Gadget watch = new SmartWatch();
        gadget.operate();
        watch.operate();
        SmartWatch myWatch = new SmartWatch();
        myWatch.operate();
        myWatch.trackHeartRate();

        System.out.println("-----------");
        Crop crop = new Crop();
        Crop wheat = new Wheat();
        crop.grow();
        wheat.grow();
        Wheat myWheat = new Wheat();
        myWheat.grow();
        myWheat.harvest();

        System.out.println("-----------");
        Publication pub = new Publication();
        Publication magazine = new Magazine();
        pub.publish();
        magazine.publish();
        Magazine myMag = new Magazine();
        myMag.publish();
        myMag.flipPages();

        System.out.println("-----------");
        Show show = new Show();
        Show concert = new Concert();
        show.perform();
        concert.perform();
        Concert myConcert = new Concert();
        myConcert.perform();
        myConcert.playEncore();

        System.out.println("-----------");
        Systems sys = new Systems();
        Systems firewall = new Firewall();
        sys.protect();
        firewall.protect();
        Firewall myFirewall = new Firewall();
        myFirewall.protect();
        myFirewall.configureRules();

        System.out.println("-----------");
        Transport transport = new Transport();
        Transport truck = new Truck();
        transport.move();
        truck.move();
        Truck myTruck = new Truck();
        myTruck.move();
        myTruck.loadCargo();

        System.out.println("-----------");
        Service service = new Service();
        Service roomService = new RoomService();
        service.serve();
        roomService.serve();
        RoomService myService = new RoomService();
        myService.serve();
        myService.deliverFood();

        System.out.println("-----------");
        Property property = new Property();
        Property apartment = new Apartment();
        property.sell();
        apartment.sell();
        Apartment myApt = new Apartment();
        myApt.sell();
        myApt.signLease();

        System.out.println("-----------");
        Products products = new Products();
        Products widget = new Widget();
        products.make();
        widget.make();
        Widget myWidget = new Widget();
        myWidget.make();
        myWidget.qualityCheck();

        System.out.println("-----------");
        Services services = new Services();
        Services data = new MobileData();
        services.connect();
        data.connect();
        MobileData myData = new MobileData();
        myData.connect();
        myData.checkUsage();

        System.out.println("-----------");
        Source source = new Source();
        Source solar = new SolarPanel();
        source.generate();
        solar.generate();
        SolarPanel myPanels = new SolarPanel();
        myPanels.generate();
        myPanels.cleanPanels();

        System.out.println("-----------");
        Aircraft aircraft = new Aircraft();
        Aircraft heli = new Helicopter();
        aircraft.fly();
        heli.fly();
        Helicopter myHeli = new Helicopter();
        myHeli.fly();
        myHeli.rotateBlades();

        System.out.println("-----------");
        Vessel vessel = new Vessel();
        Vessel yacht = new Yacht();
        vessel.sail();
        yacht.sail();
        Yacht myYacht = new Yacht();
        myYacht.sail();
        myYacht.anchor();

        System.out.println("-----------");
        Equipment equipment = new Equipment();
        Equipment tank = new Tank();
        equipment.operate();
        tank.operate();
        Tank myTank = new Tank();
        myTank.operate();
        myTank.fireCannon();

        System.out.println("-----------");
        Vehicles vehicles = new Vehicles();
        Vehicles rocket = new Rocket();
        vehicles.launch();
        rocket.launch();
        Rocket myRocket = new Rocket();
        myRocket.launch();
        myRocket.stageSeparation();

        System.out.println("-----------");
        Itemz itemz = new Itemz();
        Itemz chair = new Chair();
        itemz.use();
        chair.use();
        Chair myChair = new Chair();
        myChair.use();
        myChair.adjustHeight();

        System.out.println("-----------");
        Piece piece = new Piece();
        Piece necklace = new Necklace();
        piece.wear();
        necklace.wear();
        Necklace myNecklace = new Necklace();
        myNecklace.wear();
        myNecklace.clasp();

        System.out.println("-----------");
        Toy toy = new Toy();
        Toy doll = new Doll();
        toy.play();
        doll.play();
        Doll myDoll = new Doll();
        myDoll.play();
        myDoll.changeClothes();

        System.out.println("-----------");
        Items items = new Items();
        Items notebook = new Notebook();
        items.use();
        notebook.use();
        Notebook myNotebook = new Notebook();
        myNotebook.use();
        myNotebook.turnPage();

        System.out.println("-----------");
        Drink drink = new Drink();
        Drink coffee = new Coffee();
        drink.consume();
        coffee.consume();
        Coffee myCoffee = new Coffee();
        myCoffee.consume();
        myCoffee.brew();

        System.out.println("-----------");
        Productz productz = new Productz();
        Productz cheese = new Cheese();
        productz.produce();
        cheese.produce();
        Cheese myCheese = new Cheese();
        myCheese.produce();
        myCheese.slice();

        System.out.println("-----------");
        Iteam item1 = new Iteam();
        Iteam bread = new Bread();
        item1.bake();
        bread.bake();
        Bread myBread = new Bread();
        myBread.bake();
        myBread.knead();

        System.out.println("-----------");
        Medicine med = new Medicine();
        Medicine painkiller = new Painkiller();
        med.treat();
        painkiller.treat();
        Painkiller myPills = new Painkiller();
        myPills.treat();
        myPills.checkDosage();

        System.out.println("-----------");
        Product1 product1 = new Product1();
        Product1 lipstick = new Lipstick();
        product1.apply();
        lipstick.apply();
        Lipstick myLipstick = new Lipstick();
        myLipstick.apply();
        myLipstick.twistUp();

        System.out.println("-----------");
        Supply supply = new Supply();
        Supply detergent = new Detergent();
        supply.clean();
        detergent.clean();
        Detergent myDetergent = new Detergent();
        myDetergent.clean();
        myDetergent.measure();

        System.out.println("-----------");
        Product2 product2 = new Product2();
        Product2 dogFood = new DogFood();
        product2.use();
        dogFood.use();
        DogFood myDogFood = new DogFood();
        myDogFood.use();
        myDogFood.measurePortion();

        System.out.println("-----------");
        Equipments equip = new Equipments();
        Equipments rod = new Rod();
        equip.use();
        rod.use();
        Rod myRod = new Rod();
        myRod.use();
        myRod.cast();

        System.out.println("-----------");
        Gear gear = new Gear();
        Gear tent = new Tent();
        gear.setup();
        tent.setup();
        Tent myTent = new Tent();
        myTent.setup();
        myTent.stakeDown();

        System.out.println("-----------");
        Part parts = new Part();
        Part bike = new Bicycle();
        parts.assemble();
        bike.assemble();
        Bicycle myBike = new Bicycle();
        myBike.assemble();
        myBike.adjustSeat();

        System.out.println("-----------");
        Equipmentz equiped = new Equipmentz();
        Equipmentz goggles = new Goggles();
        equiped.wear();
        goggles.wear();
        Goggles myGoggles = new Goggles();
        myGoggles.wear();
        myGoggles.adjustStrap();

        System.out.println("-----------");
        Gears gears = new Gears();
        Gears skis = new Skis();
        gears.use();
        skis.use();
        Skis mySkis = new Skis();
        mySkis.use();
        mySkis.wax();

        System.out.println("-----------");
        Technique tech = new Technique();
        Technique kick = new Kick();
        tech.perform();
        kick.perform();
        Kick myKick = new Kick();
        myKick.perform();
        myKick.stretch();

        System.out.println("-----------");
        Pose pose = new Pose();
        Pose downwardDog = new DownwardDog();
        pose.hold();
        downwardDog.hold();
        DownwardDog myPose = new DownwardDog();
        myPose.hold();
        myPose.stretchHamstrings();

        System.out.println("-----------");
        Move move = new Move();
        Move spin = new Spin();
        move.execute();
        spin.execute();
        Spin mySpin = new Spin();
        mySpin.execute();
        mySpin.spot();

        System.out.println("-----------");
        Performance perf = new Performance();
        Performance play = new Play();
        perf.present();
        play.present();
        Play myPlay = new Play();
        myPlay.present();
        myPlay.rehearse();

        System.out.println("-----------");
        Medium medium = new Medium();
        Medium oil = new OilPaint();
        medium.create();
        oil.create();
        OilPaint myPaint = new OilPaint();
        myPaint.create();
        myPaint.mixColors();

        System.out.println("-----------");
        Material mat = new Material();
        Material clay = new Clay();
        mat.shape();
        clay.shape();
        Clay myClay = new Clay();
        myClay.shape();
        myClay.wedge();

        System.out.println("-----------");
        Item3 item3 = new Item3();
        Item3 vase = new Vase();
        item3.form();
        vase.form();
        Vase myVase = new Vase();
        myVase.form();
        myVase.centerClay();

        System.out.println("-----------");
        Project proj = new Project();
        Project sweater = new Sweater();
        proj.knit();
        sweater.knit();
        Sweater mySweater = new Sweater();
        mySweater.knit();
        mySweater.seam();

        System.out.println("-----------");
        Projects project = new Projects();
        Projects table = new Table();
        project.build();
        table.build();
        Table myTable = new Table();
        myTable.build();
        myTable.sand();

        System.out.println("-----------");
        Project1 projects = new Project1();
        Project1 gate = new Gate();
        projects.fabricate();
        gate.fabricate();
        Gate myGate = new Gate();
        myGate.fabricate();
        myGate.weld();

        System.out.println("-----------");
        Fixture fix = new Fixture();
        Fixture sink = new Sink();
        fix.install();
        sink.install();
        Sink mySink = new Sink();
        mySink.install();
        mySink.connectPipes();

        System.out.println("-----------");
        Component comp = new Component();
        Component switchs = new Switch();
        comp.wire();
        switchs.wire();
        Switch mySwitch = new Switch();
        mySwitch.wire();
        mySwitch.toggle();

        System.out.println("-----------");
        Unit unit = new Unit();
        Unit ac = new AirConditioner();
        unit.operate();
        ac.operate();
        AirConditioner myAC = new AirConditioner();
        myAC.operate();
        myAC.changeFilter();

        System.out.println("-----------");
        Materials materials = new Materials();
        Materials shingles = new Shingles();
        materials.install();
        shingles.install();
        Shingles myShingles = new Shingles();
        myShingles.install();
        myShingles.nailDown();

        System.out.println("-----------");
        Feature feat = new Feature();
        Feature fountain = new Fountain();
        feat.create();
        fountain.create();
        Fountain myFountain = new Fountain();
        myFountain.create();
        myFountain.circulateWater();

        System.out.println("-----------");
        Element1 elem = new Element1();
        Element1 lighting = new Lighting();
        elem.arrange();
        lighting.arrange();
        Lighting myLights = new Lighting();
        myLights.arrange();
        myLights.dim();

        System.out.println("-----------");
        Accessory acc = new Accessory();
        Accessory handbag = new Handbag();
        acc.wear();
        handbag.wear();
        Handbag myBag = new Handbag();
        myBag.wear();
        myBag.organize();

        System.out.println("-----------");
        Shoe shoe = new Shoe();
        Shoe sneakers = new Sneakers();
        shoe.wear();
        sneakers.wear();
        Sneakers mySneakers = new Sneakers();
        mySneakers.wear();
        mySneakers.tieLaces();

        System.out.println("-----------");
        Glasses glasses = new Glasses();
        Glasses shades = new Sunglasses();
        glasses.wear();
        shades.wear();
        Sunglasses myShades = new Sunglasses();
        myShades.wear();
        myShades.adjustNosePads();

        System.out.println("-----------");
        Watch watches = new Watch();
        Watch smartwatch = new Smartwatchs();
        watches.tellTime();
        smartwatch.tellTime();
        Smartwatchs myWatches = new Smartwatchs();
        myWatches.tellTime();
        myWatches.checkNotifications();

        System.out.println("-----------");
        Bag bag = new Bag();
        Bag suitcase = new Suitcase();
        bag.pack();
        suitcase.pack();
        Suitcase myCase = new Suitcase();
        myCase.pack();
        myCase.extendHandle();

        System.out.println("-----------");
        Equipment1 equipment1 = new Equipment1();
        Equipment1 printer = new Printer();
        equipment1.use();
        printer.use();
        Printer myPrinter = new Printer();
        myPrinter.use();
        myPrinter.loadPaper();

        System.out.println("-----------");
        Supplies supplies = new Supplies();
        Supplies backpack = new Backpack();
        supplies.use();
        backpack.use();
        Backpack myPack = new Backpack();
        myPack.use();
        myPack.organize();

        System.out.println("-----------");
        Equipment2 equipment2 = new Equipment2();
        Equipment2 microscope = new Microscope();
        equipment2.operate();
        microscope.operate();
        Microscope myScope = new Microscope();
        myScope.operate();
        myScope.adjustFocus();

        System.out.println("-----------");
        Devices devices = new Devices();
        Devices stethoscope = new Stethoscope();
        devices.use();
        stethoscope.use();
        Stethoscope myScopes = new Stethoscope();
        myScopes.use();
        myScopes.listen();

        System.out.println("-----------");
        Tool tool = new Tool();
        Tool drill = new Drill();
        tool.use();
        drill.use();
        Drill myDrill = new Drill();
        myDrill.use();
        myDrill.changeBur();

        System.out.println("-----------");
        Tools tools = new Tools();
        Tools scalpel = new Scalpel();
        tools.use();
        scalpel.use();
        Scalpel myScalpel = new Scalpel();
        myScalpel.use();
        myScalpel.sterilize();

        System.out.println("-----------");
        Equipment3 equipment3 = new Equipment3();
        Equipment3 tractor = new Tractor();
        equipment3.operate();
        tractor.operate();
        Tractor myTractor = new Tractor();
        myTractor.operate();
        myTractor.attachImplement();

        System.out.println("-----------");
        Equipment4 equipment4 = new Equipment4();
        Equipment4 excavator = new Excavator();
        equipment4.dig();
        excavator.dig();
        Excavator myExcavator = new Excavator();
        myExcavator.dig();
        myExcavator.extendArm();

        System.out.println("-----------");
        Equipment5 equipment5 = new Equipment5();
        Equipment5 derrick = new Derrick();
        equipment5.drill();
        derrick.drill();
        Derrick myDerrick = new Derrick();
        myDerrick.drill();
        myDerrick.raiseMast();

        System.out.println("-----------");
        System1 system1 = new System1();
        System1 turbine = new WindTurbine();
        system1.generate();
        turbine.generate();
        WindTurbine myTurbine = new WindTurbine();
        myTurbine.generate();
        myTurbine.adjustBlades();

        System.out.println("-----------");
        System2 system2 = new System2();
        System2 composter = new Composter();
        system2.process();
        composter.process();
        Composter myComposter = new Composter();
        myComposter.process();
        myComposter.turnPile();

        System.out.println("-----------");
        Processes proc = new Processes();
        Processes plastic = new PlasticRecycling();
        proc.recycle();
        plastic.recycle();
        PlasticRecycling myPlastic = new PlasticRecycling();
        myPlastic.recycle();
        myPlastic.sortByType();

        System.out.println("-----------");
        System3 system3 = new System3();
        System3 filter = new Filter();
        system3.treat();
        filter.treat();
        Filter myFilter = new Filter();
        myFilter.treat();
        myFilter.backwash();

        System.out.println("-----------");
        Vehicle1 vehicle1 = new Vehicle1();
        Vehicle1 bus = new Bus();
        vehicle1.transport();
        bus.transport();
        Bus myBus = new Bus();
        myBus.transport();
        myBus.announceStop();

        System.out.println("-----------");
        Carriage carriage = new Carriage();
        Carriage passengerCar = new PassengerCar();
        carriage.carry();
        passengerCar.carry();
        PassengerCar myCar = new PassengerCar();
        myCar.carry();
        myCar.checkTickets();

        System.out.println("-----------");
        Container cont = new Container();
        Container cargo = new CargoContainer();
        cont.ship();
        cargo.ship();
        CargoContainer myCargo = new CargoContainer();
        myCargo.ship();
        myCargo.seal();

        System.out.println("-----------");
        Service1 service1 = new Service1();
        Service1 pkg = new PackageDelivery();
        service1.deliver();
        pkg.deliver();
        PackageDelivery myPkg = new PackageDelivery();
        myPkg.deliver();
        myPkg.scanBarcode();

        System.out.println("-----------");
        Equipment6 equipment6 = new Equipment6();
        Equipment6 cameras = new Cameras();
        equipment6.record();
        cameras.record();
        Cameras myCamera = new Cameras();
        myCamera.record();
        myCamera.adjustFocus();

        System.out.println("-----------");
        Machine machine = new Machine();
        Machine press = new OffsetPress();
        machine.print();
        press.print();
        OffsetPress myPress = new OffsetPress();
        myPress.print();
        myPress.mixInk();

        System.out.println("-----------");
        Material1 material1 = new Material1();
        Material1 box = new CardboardBox();
        material1.contain();
        box.contain();
        CardboardBox myBox = new CardboardBox();
        myBox.contain();
        myBox.sealTape();

        System.out.println("-----------");
        Fabric fabric = new Fabric();
        Fabric cotton = new Cotton();
        fabric.weave();
        cotton.weave();
        Cotton myCotton = new Cotton();
        myCotton.weave();
        myCotton.preWash();

        System.out.println("-----------");
        Product3 prod = new Product3();
        Product3 wallet = new Wallet();
        prod.craft();
        wallet.craft();
        Wallet myWallet = new Wallet();
        myWallet.craft();
        myWallet.stitchSeams();

        System.out.println("-----------");
        Plastic plastic1 = new Plastic();
        Plastic bottle = new Bottle();
        plastic1.mold();
        bottle.mold();
        Bottle myBottle = new Bottle();
        myBottle.mold();
        myBottle.cap();

        System.out.println("-----------");
        Compound compound = new Compound();
        Compound polymer = new Polymer();
        compound.mix();
        polymer.mix();
        Polymer myPolymer = new Polymer();
        myPolymer.mix();
        myPolymer.catalyze();

        System.out.println("-----------");
        Medicine1 medicine1 = new Medicine1();
        Medicine1 vaccine = new Vaccine();
        medicine1.develop();
        vaccine.develop();
        Vaccine myVaccine = new Vaccine();
        myVaccine.develop();
        myVaccine.testPotency();

        System.out.println("-----------");
        Device1 device1 = new Device1();
        Device1 nanobot = new Nanorobot();
        device1.operate();
        nanobot.operate();
        Nanorobot myNanobot = new Nanorobot();
        myNanobot.operate();
        myNanobot.program();


    }
}
