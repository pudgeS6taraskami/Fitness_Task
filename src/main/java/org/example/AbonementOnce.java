package org.example;

import java.time.LocalDate;
import java.util.Date;
import java.lang.Math.*;
public class AbonementOnce extends Abonement {

    String name;
    String secondname;
    LocalDate date = LocalDate.now();


    public AbonementOnce (String name, String secondname, LocalDate date){
        this.name = name;
        this.secondname = secondname;
        this.date = date;
    }

    @Override
    public String toString() {
        return "AbonementOnce{" +
                "name='" + name + '\'' +
                ", secondname='" + secondname + '\'' +
                ", wasborn=" + date +
                '}';
    }
}