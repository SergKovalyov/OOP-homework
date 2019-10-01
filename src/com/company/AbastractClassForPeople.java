package com.company;

public abstract class AbastractClassForPeople {
    boolean sex = true;

    public AbastractClassForPeople(boolean sex) {
        this.sex = sex;
    }

    abstract boolean toTalk();

    abstract boolean toTolerate();

    abstract boolean toSpend();

    abstract String toRelate();
}
