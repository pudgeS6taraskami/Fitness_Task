package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class FitnessClub {

    ArrayList<Abonement> training = new ArrayList<>(20);
    ArrayList<Abonement> pool = new ArrayList<>(20);
    ArrayList group = new ArrayList<>(20);
    public FitnessClub(){

    }
    public void regTrainingOnce(Abonement abonement){
        if (abonement.getDate() > 8 & abonement.getDate() < 22){
        if (training.size() < 20) {
            training.add(abonement);
        }
        else {
            System.out.println("Уже больше 20 человек");
            }
        }
        else {
            System.out.println("Неправильное время");
        }
    }

    public void regPool(Abonement abonement){
        if (pool.size() < 20) {
            pool.add(abonement);
        }
        else {
            System.out.println("Уже больше 20 человек");
        }
    }

    public void addGroup (AbonementInfinite abonementInfinite){
        if (group.size() > 20) {
            group.add(abonementInfinite);
        }
        else {
            System.out.println("Уже больше 20 человек");
        }
    }

    public void close() {
        training.clear();
        pool.clear();
        group.clear();
    }

    @Override
    public String toString() {
        return "FitnessClub{" +
                "training=" + training +
                ", pool=" + pool +
                ", group=" + group +
                '}';
    }
}
