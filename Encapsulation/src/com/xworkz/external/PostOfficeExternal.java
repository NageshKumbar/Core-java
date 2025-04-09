package com.xworkz.external;

import com.xworkz.internal.PostOffice;

public class PostOfficeExternal {
    public void run() {
        PostOffice postOffice = new PostOffice();

        System.out.println(postOffice.GetAddress());
        System.out.println(postOffice.GetStaffCount());
        System.out.println(postOffice.GetMailBoxes());
        System.out.println(postOffice.GetCourierService());
        System.out.println(postOffice.GetOpeningHours());
    }

}
