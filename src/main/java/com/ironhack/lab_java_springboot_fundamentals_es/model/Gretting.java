package com.ironhack.lab_java_springboot_fundamentals_es.model;

public class Gretting {
    private String name;
    private int num1;
    private int num2;

    public Gretting(String name, int num1, int num2) {
        this.name = name;
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
