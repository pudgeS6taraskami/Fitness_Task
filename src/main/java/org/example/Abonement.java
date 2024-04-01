package org.example;

import java.lang.Math;
import java.time.LocalDate;

public class Abonement {
     double date;

     LocalDate dateLocal = LocalDate.now();
    public Abonement() {

            date = 0 + Math.random() * 23.59;

    }
    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }

}
