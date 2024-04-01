package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Fitness {
    public static void main(String[] args) {
            AbonementOnce a1 = new AbonementOnce("gleb", "ascas", LocalDate.ofEpochDay(3));
            AbonementInfinite a2 = new AbonementInfinite("safadff", "dasd", 111);
            FitnessClub g = new FitnessClub();
            g.regTrainingOnce(a1);
            g.regTrainingOnce(a2);
            System.out.println(g.toString());
            g.close();
            System.out.println(g.toString());
    }
}
