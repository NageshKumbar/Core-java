package com.xworkz.internal;

public class PostOffice {
    private String address;
    private int staffCount;
    private int mailBoxes;
    private String courierService;
    private String openingHours;

    // setters (default access)
    void SetAddress(String address){
        this.address = address;
    }

    void SetStaffCount(int staffCount){
        this.staffCount = staffCount;
    }

    void SetMailBoxes(int mailBoxes){
        this.mailBoxes = mailBoxes;
    }

    void SetCourierService(String courierService){
        this.courierService = courierService;
    }

    void SetOpeningHours(String openingHours){
        this.openingHours = openingHours;
    }

    // getters (public access)
    public String GetAddress(){
        return this.address;
    }

    public int GetStaffCount(){
        return this.staffCount;
    }

    public int GetMailBoxes(){
        return this.mailBoxes;
    }

    public String GetCourierService(){
        return this.courierService;
    }

    public String GetOpeningHours(){
        return this.openingHours;
    }
}
