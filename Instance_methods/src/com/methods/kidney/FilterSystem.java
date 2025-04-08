package com.methods.kidney;

public class FilterSystem {

    Kidney kidney;
    public FilterSystem(Kidney kidney) {
        this.kidney =  kidney;
        System.out.println("parameterized const in Filtersystem");
    }

    public void filter() {
        System.out.println("running filter in filtersystem");
        if (kidney != null) {
            kidney.chutney();
        }
        else {
            System.err.println("kidney is null");
        }
    }
}
