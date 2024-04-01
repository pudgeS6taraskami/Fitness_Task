package org.example;

import java.util.ArrayList;

public class AbonementInfinite extends Abonement{
    String name;
    String secondName;
    int dateWasBorn;

    public AbonementInfinite(String name, String secondName, int dateWasBorn){
        this.name = name;
        this.secondName = secondName;
        this.dateWasBorn = dateWasBorn;
    }

    @Override
    public String toString() {
        return "AbonementInfinite{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", dateWasBorn=" + dateWasBorn +
                '}';
    }
}
