package com.company;

public class Main {

    public static void main(String[] args) {
        WomanWord object1 = new WomanWord(false, "Jane", "Air", 1.50f, 56.3f);
        MansWord object2 = new MansWord(true, "Ivan", "Johnson", 1.89f, 98.7f);
        /*System.out.println(object1);
        System.out.println(object2);
        System.out.println(object1.toTalk());
        System.out.println(object1.toTolerate());
        System.out.println(object1.toSpend());
        System.out.println(object1.toRelate());
        System.out.println(object2.toTalk());
        System.out.println(object2.toTolerate());
        System.out.println(object2.toSpend());
        System.out.println(object2.toRelate());
        object1.toBorn();

*/
        System.out.println(object1.toTalk());
        System.out.println(object2.toTalk());
    }
}
