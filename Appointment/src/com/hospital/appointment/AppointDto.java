package com.hospital.appointment;

public class AppointDto{
    String fname;
    String lname ;
    String email ;
    String age ;
    String address ;
    String gender ;
    String sick ;
    String number ;


    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setLname(String lname){
        this.lname=lname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSick(String sick) {
        this.sick = sick;
    }

    public String getFname(){
        return fname;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getLname() {
        return lname;
    }

    public String getNumber() {
        return number;
    }

    public String getSick() {
        return sick;
    }
}
