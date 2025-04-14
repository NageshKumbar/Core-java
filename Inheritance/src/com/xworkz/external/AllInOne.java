package com.xworkz.external;

import com.xworkz.internal.*;

public class AllInOne {
    public void showAccessory(Accessory accessory) {
        if(accessory != null) {
            accessory.wear();
            if(accessory instanceof Handbag){
                Handbag handbag = (Handbag) accessory;
                handbag.organize();
            }
            else {
                System.out.println("Acccessory is not handbag Cannot call organize");
            }
        }
        else {
            System.out.println("accessory is null");
        }
    }

    public void ShowDevice(Device device) {
        if(device != null) {
            device.powerOn();
            if(device instanceof Laptop){
                Laptop laptop = (Laptop) device;
                laptop.openLid();
            }
            else {
                System.out.println("Device is not Laptop Cannot call openlid");
            }
        }
        else {
            System.out.println("device is null");
        }
    }

    public void showShoe(Shoe shoe) {
        if (shoe != null) {
            shoe.wear();
            if(shoe instanceof Sneakers){
                Sneakers sneakers = (Sneakers) shoe;
                sneakers.tieLaces();
            }
            else {
                System.out.println("shoe is not sneakers, cannot call tielaces");
            }
        }
        else {
            System.out.println("shoe is null");
        }
    }

    public void showAnimal(Animal animal) {
        if (animal != null) {
            animal.eat();
            if(animal instanceof Dog){
                Dog dog = (Dog) animal;
                dog.bark();
            }
            else {
                System.out.println("animal is not dog, cannot call bark");
            }
        }
        else {
            System.out.println("animal is null");
        }
    }

    public void showAccount(Account account) {
        if (account != null) {
            account.deposit();
            if(account instanceof SavingsAccount) {
                SavingsAccount savingsAccount = (SavingsAccount) account;
                savingsAccount.calculateInterest();
            }
            else {
                System.out.println("account is not savingsaccount, cannot call calculateinterest");
            }
        }
        else {
            System.out.println("account is null");
        }
    }

    public void showShape(Shape shape) {
        if(shape != null) {
            shape.draw();
            if(shape instanceof Circle) {
                Circle circle = (Circle) shape;
                circle.calculateRadius();
            }
            else {
                System.out.println("shape is not circle, cannot call calculateradius");
            }
        }
        else {
            System.out.println("circle is null");
        }
    }

    public void showEmployee(Employee employee) {
        if (employee != null) {
            employee.work();
            if(employee instanceof Manager) {
                Manager manager = (Manager) employee;
                manager.manageTeam();
            }
            else {
                System.out.println("employee is not manager, cannot call manageteam");
            }
        }
        else {
            System.out.println("employee is null");
        }
    }

    public void showPerson(Person person) {
        if (person != null) {
            person.introduce();
            if(person instanceof Student) {
                Student student = (Student) person;
                student.study();
            }
            else {
                System.out.println("person is not student, cannot call study");
            }
        }
        else {
            System.out.println("person is null");
        }
    }

    public void showProduct(Product product) {
        if (product != null) {
            product.display();
            if(product instanceof Electronics) {
                Electronics electronics = (Electronics) product;
                electronics.checkWarranty();
            }
            else {
                System.out.println("product is not electronics, cannot call checkwarrenty");
            }
        }
        else {
            System.out.println("product is null");
        }
    }

    public void showVehical(Vehicle vehicle) {
        if (vehicle != null) {
            vehicle.move();
            if (vehicle instanceof Airplane) {
                Airplane airplane = (Airplane) vehicle;
                airplane.takeOff();
            }
            else {
                System.out.println("vehical is not airplane, cannot call takeoff");
            }
        }
        else {
            System.out.println("vehical is null");
        }
    }

    public void showMedicalProfessional(MedicalProfessional medicalProfessional) {
        if (medicalProfessional != null) {
            medicalProfessional.treatPatient();
            if (medicalProfessional instanceof Doctor) {
                Doctor doctor = (Doctor) medicalProfessional;
                doctor.prescribeMedicine();
            }
            else {
                System.out.println("medicalProfessional is not doctor, cannot call prescribeMeddicine");
            }
        }
        else {
            System.out.println("medicalProfessional is null");
        }
    }

    public void showFoodItem(FoodItem foodItem) {
        if (foodItem != null) {
            foodItem.prepare();
            if (foodItem instanceof Pizza) {
                Pizza pizza = (Pizza) foodItem;
                pizza.addToppings();
            }
            else {
                System.out.println("fooditem is not pizza, cannot call addtoppings");
            }
        }
        else {
            System.out.println("fooditem is null");
        }
    }

    public void showItem(Item item) {
        if (item != null) {
            item.checkOut();
            if (item instanceof Book) {
                Book book = (Book) item;
                book.read();
            }
            else {
                System.out.println("item is not book, cannot call read");
            }
        }
        else {
            System.out.println("item is null");
        }
    }

    public void showInstrument(Instrument instrument) {
        if (instrument != null) {
            instrument.play();
            if (instrument instanceof Guitar) {
                Guitar guitar = (Guitar) instrument;
                guitar.tuneStrings();
            }
            else {
                System.out.println("instrument is not Guiter, cannot call tunestring");
            }
        }
        else {
            System.out.println("instrument is null");
        }
    }

    public void showGame (Game game) {
        if (game != null) {
            game.play();
            if (game instanceof Football) {
                Football football = (Football) game;
                football.scoreGoal();
            }
            else {
                System.out.println("game is not football, cannot call scoregoal");
            }
        }
        else {
            System.out.println("game is null");
        }
    }

    public void showPhenomenon (Phenomenon phenomenon) {
        if (phenomenon != null) {
            phenomenon.occur();
            if (phenomenon instanceof Rain) {
                Rain rain = (Rain) phenomenon;
                rain.measureRainfall();
            }
            else {
                System.out.println("phenomenon is not rain, cannot call measurerainfall");
            }
        }
        else {
            System.out.println("phenomenon is null");
        }
    }

    public void showPlant (Plant plant) {
        if (plant != null) {
            plant.grow();
            if (plant instanceof Flower) {
                Flower flower = (Flower) plant;
                ((Flower) plant).bloom();
            }
            else {
                System.out.println("Plant is not flower, cannot call bloom");
            }
        }
        else {
            System.out.println("plant is null");
        }
    }

    public void showCamera (Camera camera) {
        if (camera != null) {
            camera.capture();
            if (camera instanceof DSLRCamera) {
                DSLRCamera dslrCamera = (DSLRCamera) camera;
                dslrCamera.changeLens();
            }
            else {
                System.out.println("camera is not dslrcamera, cannot call changelens");
            }
        }
        else {
            System.out.println("camera is null");
        }
    }

    public void showExercise(Exercise exercise) {
        if (exercise != null) {
            exercise.perform();
            if (exercise instanceof WeightLifting) {
                WeightLifting weightLifting = (WeightLifting) exercise;
                weightLifting.increaseWeight();
            }
            else {
                System.out.println("exercise is not weightlifting, cannot call increaseweight");
            }
        }
        else {
            System.out.println("exercise is null");
        }
    }

    public void showGarment (Garment garment) {
        if (garment != null) {
            garment.wear();
            if (garment instanceof Shirt) {
                Shirt shirt = (Shirt) garment;
                shirt.buttonUp();
            }
            else {
                System.out.println("garment is not shirt, cannot call buttonup");
            }
        }
        else {
            System.out.println("garment is null");
        }
    }

    public void showBuilding (Building building) {
        if (building != null) {
            building.construct();
            if (building instanceof Skyscraper) {
                Skyscraper skyscraper = (Skyscraper) building;
                skyscraper.installElevator();
            }
            else {
                System.out.println("building is not skyscraper, cannot call installelevator");
            }
        }
        else {
            System.out.println("building is null");
        }
    }

    public void showInvestment (Investment investment) {
        if (investment != null) {
            investment.grow();
            if (investment instanceof Stock) {
                Stock stock = (Stock) investment;
                stock.trade();
            }
            else {
                System.out.println("investment is not stock, cannot call trade");
            }
        }
        else {
            System.out.println("investment is null");
        }
    }

    public void showCourse (Course course) {
        if (course != null) {
            course.teach();
            if (course instanceof ProgrammingCourse) {
                ProgrammingCourse programmingCourse = (ProgrammingCourse) course;
                programmingCourse.debugCode();
            }
            else {
                System.out.println("course is not progrrammingcourse");
            }
        }
        else {
            System.out.println("course is null");
        }
    }

    public void showCarPart(CarPart carPart) {
        if (carPart != null) {
            carPart.function();
            if (carPart instanceof Engine) {
                Engine engine = (Engine) carPart;
                engine.checkOil();
            }
            else {
                System.out.println("carpart is not engine, cannot call checkoil");
            }
        }
        else {
            System.out.println("engine is null");
        }
    }

    public void showGadget (Gadget gadget) {
        if (gadget != null) {
            gadget.operate();
            if (gadget instanceof SmartWatch) {
                SmartWatch smartWatch = (SmartWatch) gadget;
                smartWatch.trackHeartRate();
            }
            else {
                System.out.println("gadget is not smartwatch, cannot call trackheartrate");
            }
        }
        else {
            System.out.println("gadget is null");
        }
    }

    public void showCrop (Crop crop) {
        if (crop != null) {
            crop.grow();
            if (crop instanceof Wheat) {
                Wheat wheat = (Wheat) crop;
                wheat.harvest();
            }
            else {
                System.out.println("crop is not wheat, cannot call harvest");
            }
        }
        else {
            System.out.println("crop is null");
        }
    }

    public void showPublication (Publication publication) {
        if (publication != null) {
            publication.publish();
            if (publication instanceof Magazine) {
                Magazine magazine = (Magazine) publication;
                magazine.flipPages();
            }
            else {
                System.out.println("publication is not magazine, cannot call flipPages");
            }
        }
        else {
            System.out.println("publication is null");
        }
    }

    public void showShow (Show show) {
        if (show != null) {
            show.perform();
            if (show instanceof Concert) {
                Concert concert = (Concert) show;
                concert.playEncore();
            }
            else {
                System.out.println("show is not concert, cannot call playencore");
            }
        }
        else {
            System.out.println("show is null");
        }
    }

    public void showSystem (Systems systems) {
        if (systems != null) {
            systems.protect();
            if (systems instanceof Firewall) {
                Firewall firewall = (Firewall) systems;
                firewall.configureRules();
            }
            else {
                System.out.println("systems is not firewall, cannot call configureRules");
            }
        }
        else {
            System.out.println("systems is null");
        }
    }

    public void showTransport (Transport transport) {
        if (transport != null) {
            transport.move();
            if (transport instanceof Truck) {
                Truck truck = (Truck) transport;
                truck.loadCargo();
            }
            else {
                System.out.println("transport is not truck, cannot call loadcargo");
            }
        }
        else {
            System.out.println("transport is null");
        }
    }

    public void showService (Service service) {
        if (service != null) {
            service.serve();
            if (service instanceof RoomService) {
                RoomService roomService = (RoomService) service;
                roomService.deliverFood();
            }
            else {
                System.out.println("service is not roomService, cannot call deliverFood");
            }
        }
        else {
            System.out.println("Service is null");
        }
    }

    public void showProperty (Property property) {
        if (property != null) {
            property.sell();
            if (property instanceof Apartment) {
                Apartment apartment = (Apartment) property;
                apartment.signLease();
            }
            else {
                System.out.println("property is not apartment, cannot call signLease");
            }
        }
        else {
            System.out.println("property is null");
        }
    }
}
