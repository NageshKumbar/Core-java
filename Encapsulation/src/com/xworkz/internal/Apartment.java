package com.xworkz.internal;

public class Apartment {
    private String dinning;
    private String playground;
    private String security;
    private String penthouse;
    private String architecture;


    void setDinning(String dinning){
        this.dinning=dinning;
    }
    void setPlayground(String playground){
        this.playground=playground;
    }
    void setSecurity(String security){
        this.security=security;
    }
    void setPenthouse(String penthouse){
        this.penthouse=penthouse;
    }
    void setArchitecture(String architecture){
        this.architecture=architecture;
    }

    public String getDinning(){
        return this.dinning;
    }
    public String getPlayground(){
        return this.playground;
    }
    public String getSecurity(){
        return this.security;
    }
    public String getPenthouse(){
        return this.penthouse;
    }
    public String getArchitecture(){
        return this.architecture;
    }


}
