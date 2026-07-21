package com.railway.service;

import com.railway.model.Passenger;
import com.railway.model.Ticket;
import com.railway.model.Train;
import java.util.ArrayList;

public class BookingService {
    public ArrayList<Ticket> tickets = new ArrayList<>();
    public int count = 846205;

    public void bookMultiPassengers(ArrayList<Passenger> passengerList, Train t, String cls, boolean isTat, String pay, String sIn, String dIn) {
        String quota = isTat ? "TATKAL" : "GENERAL";
        int totalTickets = passengerList.size();
        int seats = 0;
        int perTicketFare = 0;

        if (cls.equals("1AC")) {
            seats = isTat ? t.t1AC : t.s1AC;
            perTicketFare = isTat ? t.f1AC + 450 : t.f1AC;
        } else if (cls.equals("2AC")) {
            seats = isTat ? t.t2AC : t.s2AC;
            perTicketFare = isTat ? t.f2AC + 330 : t.f2AC;
        } else {
            seats = isTat ? t.tSL : t.sSL;
            perTicketFare = isTat ? t.fSL + 105 : t.fSL;
        }

        if (seats < totalTickets) {
            System.out.println("\n❌ Regret: Not enough seats available! Required: " + totalTickets + ", Available: " + seats);
            return;
        }

        System.out.println("\n🎉 [SUCCESS] Payment processed via " + pay);

        for (int i = 0; i < passengerList.size(); i++) {
            Passenger p = passengerList.get(i);
            String finalBerth = p.berth;

            if (p.age >= 60) {
                System.out.println("👵 [AUTO QUOTA DETECTED] Age 60+ profile detected for " + p.name + ". Forcing auto-allocation to LOWER Berth first.");
                finalBerth = "LOWER (SENIOR CITIZEN ASSIGNED)";
            }

            if (cls.equals("1AC")) { if(isTat) t.t1AC--; else t.s1AC--; }
            else if (cls.equals("2AC")) { if(isTat) t.t2AC--; else t.s2AC--; }
            else { if(isTat) t.tSL--; else t.sSL--; }

            Ticket tk = new Ticket(count, p, t, cls, quota, finalBerth, perTicketFare, sIn, dIn);
            tickets.add(tk);
            System.out.println("✅ Ticket ID generated: [" + count + "] for Passenger: " + p.name);
            count++;
        }
    }

    public Ticket getTicket(int id) {
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).tId == id) return tickets.get(i);
        }
        return null;
    }

    public void cancel(int id) {
        Ticket tk = getTicket(id);
        if (tk == null) {
            System.out.println("❌ Invalid Ticket ID!");
            return;
        }
        tickets.remove(tk);

        if (tk.cls.equals("1AC")) { if(tk.quota.equals("TATKAL")) tk.t.t1AC++; else tk.t.s1AC++; }
        else if (tk.cls.equals("2AC")) { if(tk.quota.equals("TATKAL")) tk.t.t2AC++; else tk.t.s2AC++; }
        else { if(tk.quota.equals("TATKAL")) tk.t.tSL++; else tk.t.sSL++; }

        System.out.println("👍 Ticket Cancelled Successfully. Amount refunded to source profile network layers.");
    }
}
