package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Dacia", 90, "black", 1400);
        System.out.println(car);

        double tax = ((Taxable) car).computeTax();
        System.out.println(tax);

        Vehicle v = new Car();
        v.move();

        Car c2;
        try {
            c2 = (Car)car.clone();
            c2.setCapacity(1900);
            System.out.println(car.getCapacity());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        int y = 5;
        System.out.println(y);

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);

        for (Integer integer : list) {
            System.out.println(integer);
        }

        list.remove(2);
        list.add(1, 3);
        System.out.println();
        for(Integer i : list) {
            System.out.println(i);
        }

        list.set(0, 9);
        System.out.println();

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

}