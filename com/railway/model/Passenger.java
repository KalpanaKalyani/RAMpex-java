package com.railway.model;

public class Passenger {
    public int id;
    public String name;
    public int age;
    public String gender;
    public String berth;
    public String food;

    public Passenger(int id, String name, int age, String gender, String berth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.berth = berth;
        this.food = "❌ No Food Ordered";
    }
}
