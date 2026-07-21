package com.railway.model;

public class Ticket {
    public int tId;
    public Passenger p;
    public Train t;
    public String cls;
    public String quota;
    public String berth;
    public int fare;
    public String sInput;
    public String dInput;

    public Ticket(int tId, Passenger p, Train t, String cls, String quota, String berth, int fare, String sInput, String dInput) {
        this.tId = tId;
        this.p = p;
        this.t = t;
        this.cls = cls;
        this.quota = quota;
        this.berth = berth;
        this.fare = fare;
        this.sInput = sInput.toUpperCase();
        this.dInput = dInput.toUpperCase();
    }

    public void show() {
        System.out.println("\n==================================================");
        System.out.println("             RAILWAY DIGITAL TICKET               ");
        System.out.println("==================================================");
        System.out.println(" 🎫 Ticket ID        : " + tId);
        System.out.println(" 👤 Passenger Name   : " + p.name + " (Age: " + p.age + " | " + p.gender + ")");
        System.out.println(" 🚂 Train Number     : " + t.tNo + " - " + t.tName.trim());
        System.out.println(" 📅 Date of Journey  : 15/07/2026");
        System.out.println(" 🧭 Route Matrix     : " + sInput + " ➔ " + dInput);
        System.out.println(" 🕒 Timings Schedule : " + t.time);
        System.out.println(" 💺 Allocated Class  : " + cls + " Class (" + quota + ")");
        System.out.println(" 🛏  Assigned Seat    : " + berth + " Berth");
        System.out.println(" 🍱 Catering Status  : " + p.food);
        System.out.println(" 💰 Total Fare Paid  : Rs. " + fare);
        System.out.println("==================================================");
    }
}
