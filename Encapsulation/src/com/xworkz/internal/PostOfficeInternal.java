package com.xworkz.internal;

public class PostOfficeInternal {
    public void runInternal() {
        PostOffice postOffice = new PostOffice();

        System.out.println("------ After Updates ------");
        postOffice.SetAddress("MG Road, Bangalore");
        postOffice.SetStaffCount(15);
        postOffice.SetMailBoxes(120);
        postOffice.SetCourierService("IndiaPost Express");
        postOffice.SetOpeningHours("9 AM to 5 PM");

        System.out.println(postOffice.GetAddress());
        System.out.println(postOffice.GetStaffCount());
        System.out.println(postOffice.GetMailBoxes());
        System.out.println(postOffice.GetCourierService());
        System.out.println(postOffice.GetOpeningHours());
    }
}
