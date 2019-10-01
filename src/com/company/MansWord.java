package com.company;

public class MansWord extends AbastractClassForPeople {
String name, surname;
float height, weight;

    @Override
    public String toString() {
        return "MansWord{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                "} " + super.toString();
    }

    public MansWord(boolean sex, String name, String surname, float height, float weight) {
        super(sex);
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean toTalk() {
        if (sex=true)
        System.out.print("Mans only like to talk about girls it's ");
        return true;
    }

    @Override
    boolean toTolerate() {
        return true;
    }

    @Override
    boolean toSpend() {
        return false;
    }

    @Override
    String toRelate() {
        return "Person";
    }

}
