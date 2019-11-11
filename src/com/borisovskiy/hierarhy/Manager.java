package com.borisovskiy.hierarhy;

public class Manager extends Employee {
    private Double bonus;

    public Manager(String name, int age, double salary) {
        super(name, age, salary);
        bonus = (double) 0;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
