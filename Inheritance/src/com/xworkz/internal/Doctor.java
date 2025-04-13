package com.xworkz.internal;

public class Doctor extends MedicalProfessional {
    public void prescribeMedicine() {
        System.out.println("Doctor is prescribing medicine");
    }

    @Override
    public void treatPatient() {
        System.out.println("Doctor is examining patient");
    }
}
