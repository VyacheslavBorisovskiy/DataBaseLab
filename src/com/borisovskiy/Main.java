package com.borisovskiy;

import com.borisovskiy.hierarhy.Employee;
import com.borisovskiy.hierarhy.Manager;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        DataBaseImpl dataBase = new DataBaseImpl(new HashMap<>());
        Employee jack = new Manager("Jack", 31, 40500);
        ((Manager) jack).setBonus(2000d);
        Employee tom = new Manager("Tom", 48, 63000);
        ((Manager) tom).setBonus(2000d);

        dataBase.put(1, jack);
        dataBase.put(2, new Employee("Eva", 28, 25000));
        dataBase.put(3, new Employee("Nick", 24, 10000));
        dataBase.put(4, tom);
        dataBase.put(5, new Employee("Helen", 34, 30000));
        dataBase.printMap();

        dataBase.remove(1);
        dataBase.put(1, new Employee("Sunny", 26, 19000));
        dataBase.replace(1, new Employee("Stive", 23, 21000));

        System.out.println(dataBase.sort(dataBase.getMap()));
    }
}
