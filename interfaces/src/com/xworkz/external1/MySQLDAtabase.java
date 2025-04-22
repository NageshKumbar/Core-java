package com.xworkz.external1;

import com.xworkz.internal.rules1.Database;

public class MySQLDAtabase implements Database {
    @Override
    public void connect() {
        System.out.println("Running connect in My sql database");
    }

    @Override
    public void disconnect() {
        System.out.println("Running disconnect in MY SQL database");
    }

    @Override
    public void insert() {
        System.out.println("running insert in My SQL Databse");
    }
}
