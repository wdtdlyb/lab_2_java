package com.company;

public class Main {

    public static void main(String[] args) {
        Tv tv1 = new Tv();
        Tv tv2 = new Tv("Samsung QE65Q77RAU", 0);
        Tv tv3 = new Tv("Toshiba 32L5780EC", 3, 54, 32);
        System.out.println(tv1.turnOn());
        System.out.println(tv2.turnOff());
        System.out.println(Tv.programInfo());
    }
}
