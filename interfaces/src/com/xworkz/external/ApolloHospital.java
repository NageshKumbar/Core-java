package com.xworkz.external;

import com.xworkz.internal.impl.Hospital;

public class ApolloHospital implements Hospital {
    @Override
    public void doctor() {
        System.out.println("implementing doctor in apollo hospital");
    }
}
