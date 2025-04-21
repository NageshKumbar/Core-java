package com.xworkz.runner;

import com.xworkz.internal.*;

public class Runner {
    public static void main(String[] args) {
        Dream dream = new Illusion();
        dream.nightMare();
        dream.dayDream();
        dream.kanavu();
        dream.kansu();
        dream.sapna();

        Polygon polygon = new Shape();
        polygon.square();
        polygon.triangle();
        polygon.circle();
        polygon.diagonal();
        polygon.rectangle();

        Job job= new Work();
        job.carpenter();
        job.doctor();
        job.plumber();
        job.engineer();
        job.teacher();

        Road road = new TransportWay();
        road.bike();
        road.car();
        road.cycle();
        road.lorry();
        road.stone();

        Projects projects= new Assessment();
        projects.development();
        projects.devops();
        projects.release();
        projects.testing();
        projects.updates();
    }

}
