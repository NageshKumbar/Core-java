package com.xworkz.external;

import com.xworkz.internal.FilterApp;

public class FilterApplicatorApp {
    private FilterApp filterApp;

    public FilterApplicatorApp(FilterApp filterApp) {
        this.filterApp = filterApp;
    }

    public void applyImageFilter() {
        System.out.println("Running applyImageFilter in FilterApplicatorApp");
        if (filterApp != null) {
            this.filterApp.applyFilter();
        } else {
            System.out.println("FilterApp is null");
        }
    }
}