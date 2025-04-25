package com.xworkz.external;

import com.xworkz.internal.JDBC;

public class RCBApp {
    private JDBC jdbc;
    public RCBApp(JDBC jdbc) {
        this.jdbc = jdbc;
    }

    public void saveTeamInfo() {
        System.out.println("running saveteaminfo in RCB App");
        if (jdbc != null) {
            this.jdbc.save();
        }else {
            System.out.println("jdbc is null");
        }
    }
}
