package com.company;

public class WomanWord extends AbastractClassForPeople {

    String name, surname;
    float height, weight;
    //boolean girlFiature = true;

    @Override
    public String toString() {
        return "WomanWord{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                "} " + super.toString();
    }

    public WomanWord(boolean sex, String name, String surname, float height, float weight) {
        super(sex);
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean toTalk() {
        if (sex == false)
            System.out.print("Girl like to talk it's ");
        return true;

    }

    @Override
    boolean toTolerate() {
        return false;
    }

    @Override
    boolean toSpend() {
        return true;
    }

    @Override
    String toRelate() {
        return "Person";
    }


    String toBorn() {
        return "New person";
    }
}
