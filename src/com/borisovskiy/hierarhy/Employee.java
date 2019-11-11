package com.borisovskiy.hierarhy;

public class Employee implements Person {
    private String name;
    private int age;
    private Double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}