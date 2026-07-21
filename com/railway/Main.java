package com.railway;

import com.railway.model.Passenger;
import com.railway.model.Train;
import com.railway.model.Ticket;
import com.railway.service.BookingService;
import com.railway.service.TrainService;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrainService ts = new TrainService();
        BookingService bs = new BookingService();
        int passId = 2001;

        String currentSourceInput = "";
        String currentDestInput = "";

        while (true) {
            System.out.println("\n====================================================");
            System.out.println("            RAILWAY RESERVATION SYSTEM");
            System.out.println("====================================================");
            System.out.println(" 1 ➔ 🔍 Search Train & Route Availability");
            System.out.println(" 2 ➔ 🎟️ Book Ticket Engine");
            System.out.println(" 3 ➔ ❌ Cancel Ticket");
            System.out.println(" 4 ➔ 📋 View Booked Tickets");
            System.out.println(" 5 ➔ 📊 Check Seat Availability");
            System.out.println(" 6 ➔ 🧮 Fare Calculator");
            System.out.println(" 7 ➔ 👤 Passenger Details Query");
            System.out.println(" 8 ➔ 🖨️ Print Ticket");
            System.out.println(" 9 ➔ 🔐 Admin Login Portal");
            System.out.println(" 10 ➔ 🚪 Exit Application");
            System.out.println("====================================================");
            System.out.print("👉 Enter Your Choice : ");
            int choice = sc.nextInt();

            if (choice == 10) {
                System.out.println("\n[INFO] Exiting Application System. Safe travels! 👋");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("\nEnter Source: ");
                    currentSourceInput = sc.next();
                    System.out.print(" Enter Destination: ");
                    currentDestInput = sc.next();
                    System.out.print("📅 Enter Journey Date (DD/MM/YYYY): ");
                    String date = sc.next();

                    ArrayList<Train> matches = ts.search(currentSourceInput, currentDestInput);
                    if (matches.isEmpty()) {
                        System.out.println("\n❌ [ALERT] No trains found for this route map.");
                        break;
                    }

                    System.out.println("\n[🔍 RESULT: " + matches.size() + " Scheduled Trains Discovered for " + date + "]");
                    System.out.println("-----------------------------------------------------------------------------------------");
                    for (int i = 0; i < matches.size(); i++) {
                        Train t = matches.get(i);
                        String[] timeParts = t.time.split(" ➔ ");
                        String depTime = timeParts[0];
                        String duration = timeParts[1];
                        String arrTime = timeParts[2];

                        System.out.println("\n🚂 " + t.tName.toUpperCase().trim() + " (" + t.tNo + ")");
                        System.out.printf("   %s %s <─────── %s ───────> %s %s\n\n", depTime, currentSourceInput.toUpperCase(), duration, arrTime, currentDestInput.toUpperCase());

                        System.out.printf("   [1AC Class - ₹%-4d]       [2AC Class - ₹%-4d]       [Sleeper SL - ₹%-4d]\n", t.f1AC, t.f2AC, t.fSL);

                        String s1 = t.s1AC > 0 ? "🟢 AVAILABLE (" + t.s1AC + ")" : "🔴 WL 12";
                        String s2 = t.s2AC > 0 ? "🟢 AVAILABLE (" + t.s2AC + ")" : "🔴 WL 4";
                        String sS = t.sSL > 0  ? "🟢 AVAILABLE (" + t.sSL + ")"  : "🔴 WL 27";

                        System.out.printf("   %-25s   %-25s   %-25s\n", s1, s2, sS);
                        System.out.println("-----------------------------------------------------------------------------------------");
                    }
                    break;

                case 2:
                    System.out.println("\n--- SELECT BOOKING QUOTA ---");
                    System.out.println("1. GENERAL QUOTA");
                    System.out.println("2. TATKAL QUOTA (Premium Charges Apply)");
                    System.out.print("👉 Enter Quota Choice (1-2): ");
                    int qOption = sc.nextInt();
                    boolean isTat = (qOption == 2);

                    System.out.print("\n🚂 Enter Train Number: ");
                    int tNum = sc.nextInt();
                    Train train = ts.find(tNum);
                    if (train == null) {
                        System.out.println("\n❌ [ERROR] Invalid Train Number!");
                        break;
                    }

                    System.out.print("💺 Select Target Class (1AC / 2AC / SL): ");
                    String cls = sc.next().toUpperCase();

                    System.out.print("🔢 Number of Tickets: ");
                    int totalPassCount = sc.nextInt();

                    int singleFare = 0;
                    if (cls.equals("1AC")) { singleFare = isTat ? train.f1AC + 450 : train.f1AC; }
                    else if (cls.equals("2AC")) { singleFare = isTat ? train.f2AC + 330 : train.f2AC; }
                    else { singleFare = isTat ? train.fSL + 105 : train.fSL; }

                    int totalAmount = singleFare * totalPassCount;

                    ArrayList<Passenger> passengerGroupList = new ArrayList<>();

                    for (int k = 1; k <= totalPassCount; k++) {
                        System.out.println("\n--- 👤 ENTER PASSENGER [" + k + "] DETAILS ---");
                        System.out.print("✍️ Enter Passenger Name: ");
                        sc.nextLine();
                        String name = sc.nextLine();
                        System.out.print("🎂 Enter Age: ");
                        int age = sc.nextInt();
                        System.out.print("⚧  Enter Gender: ");
                        String gen = sc.next();
                        System.out.print("🛏  Enter Berth Choice Preference (Lower/Middle/Upper): ");
                        String berth = sc.next();

                        Passenger pTemp = new Passenger(passId++, name, age, gen, berth);

                        System.out.println("\n🍱 Order food meals? (1. Veg Biryani - ₹150 | 2. Chicken Biryani - ₹180 | 3. Skip)");
                        System.out.print("👉 Select Choice: ");
                        int foodChoice = sc.nextInt();
                        if (foodChoice == 1) pTemp.food = "Veg Biryani Combo (Pre-paid)";
                        else if (foodChoice == 2) pTemp.food = "Chicken Biryani Combo (Pre-paid)";

                        passengerGroupList.add(pTemp);
                    }

                    System.out.println("\n--- 💳 SELECT PAYMENT METHOD ---");
                    System.out.println("1. 📱 UPI (GPay / PhonePe / Paytm)");
                    System.out.println("2. 🌐 NetBanking (Secure Portal)");
                    System.out.print("👉 Choose Option (1-2): ");
                    int payOpt = sc.nextInt();
                    String payMethodStr = "";

                    if (payOpt == 1) {
                        payMethodStr = "UPI Network Gateway";
                        System.out.print("🔐 Enter 4-Digit UPI PIN: ");
                        sc.next();
                        System.out.println("🔄 Processing Transaction Amount: ₹" + totalAmount + "...");
                    } else {
                        payMethodStr = "NetBanking Core Portal";
                        System.out.print("👤 Enter NetBanking User ID: ");
                        sc.next();
                        System.out.print("🔑 Enter Password: ");
                        sc.next();
                        System.out.println("🔄 Securing Bank Server Connection for ₹" + totalAmount + "...");
                    }

                    try { Thread.sleep(600); } catch (Exception e) {}

                    System.out.println("💰 Total Amount Paid: Rs. " + totalAmount);
                    System.out.println("🎉 [SUCCESS] Payment Successful via " + payMethodStr + "!");

                    if(currentSourceInput.equals("")) { currentSourceInput = "SRC"; currentDestInput = "DEST"; }
                    bs.bookMultiPassengers(passengerGroupList, train, cls, isTat, payMethodStr, currentSourceInput, currentDestInput);
                    break;

                case 3:
                    System.out.print("\n🎟️ Enter Ticket ID to cancel: ");
                    int cancelId = sc.nextInt();
                    System.out.println();
                    bs.cancel(cancelId);
                    break;

                case 4:
                    System.out.println("\n--- 📋 ACTIVE TERMINAL BOOKING LOGS ---");
                    if (bs.tickets.isEmpty()) {
                        System.out.println("[INFO] No active records available in this session.");
                    } else {
                        for (int i = 0; i < bs.tickets.size(); i++) {
                            Ticket tk = bs.tickets.get(i);
                            System.out.println("👉 Ticket ID: " + tk.tId + " | Train: " + tk.t.tNo + " | Name: " + tk.p.name);
                        }
                    }
                    System.out.println("---------------------------------------");
                    break;

                case 5:
                    System.out.print("\n🚂 Enter Train Number: ");
                    int tn = sc.nextInt();
                    Train tr = ts.find(tn);
                    if (tr == null) { System.out.println("\n❌ [ERROR] Invalid Train!"); break; }
                    System.out.print("💺 Select Class (1AC / 2AC / SL): ");
                    String cStr = sc.next().toUpperCase();

                    int seatsLeft = (cStr.equals("1AC") ? tr.s1AC : cStr.equals("2AC") ? tr.s2AC : tr.sSL);
                    System.out.println("\n--- 📊 SEAT AVAILABILITY STATUS ---");
                    System.out.println("📌 Train Number    : " + tn);
                    System.out.println("💺 Requested Class : " + cStr);

                    if(seatsLeft > 0) {
                        System.out.println("📊 Available Seats : " + seatsLeft);
                        System.out.println("⏳ Waiting List    : 0");
                    } else {
                        System.out.println("📊 Available Seats : NOT AVAILABLE");
                        // dynamic waiting list counter check selection parameters matching templates index
                        String wlCountStr = (tn == 17230) ? "WL 4" : "WL 27";
                        System.out.println("⏳ Waiting List    : " + wlCountStr);
                    }
                    break;

                case 6:
                    System.out.print("\n🚂 Enter Train Number: ");
                    int fcNo = sc.nextInt();
                    Train fcT = ts.find(fcNo);
                    if (fcT == null) { System.out.println("\n❌ [ERROR] Invalid Train!"); break; }
                    System.out.print("💺 Select Class (1AC / 2AC / SL): ");
                    String fcC = sc.next().toUpperCase();
                    int fare = fcC.equals("1AC") ? fcT.f1AC : fcC.equals("2AC") ? fcT.f2AC : fcT.fSL;

                    System.out.println("\n--- 🧮 FARE CALCULATOR METRICS ---");
                    System.out.println("💰 Base Fare Cost  : ₹" + fare);
                    System.out.println("[💡 INFO] Senior Citizens (60+) get auto 50% discount.");
                    break;

                case 7:
                    System.out.print("\n🎟️ Enter Passenger Ticket ID: ");
                    int pId = sc.nextInt();
                    Ticket pTk = bs.getTicket(pId);
                    if (pTk == null) { System.out.println("\n❌ [ERROR] Record Not Found!"); break; }

                    System.out.println("\n--- 👤 PASSENGER DYNAMIC DATABASE RECORD ---");
                    System.out.println("📋 Passenger Name     : " + pTk.p.name);
                    System.out.println("🎂 Associated Age     : " + pTk.p.age);
                    System.out.println("⚧  Assigned Gender    : " + pTk.p.gender);
                    System.out.println("🛏  Seat Configuration : " + pTk.berth + " Berth");
                    System.out.println("🍱 On-board Catering  : " + pTk.p.food);
                    break;

                case 8:
                    System.out.print("\n🎟️ Enter Ticket ID: ");
                    int prId = sc.nextInt();
                    Ticket prTk = bs.getTicket(prId);
                    if (prTk == null) { System.out.println("\n❌ [ERROR] Invalid Ticket ID!"); break; }
                    prTk.show();
                    break;

                case 9:
                    System.out.print("\n🔐 Enter Admin Username: ");
                    String user = sc.next();
                    System.out.print("🔑 Enter Admin Password: ");
                    String pass = sc.next();
                    if (user.equals("admin") && pass.equals("admin")) {
                        while (true) {
                            System.out.println("\n╔════════════════════════════════════════════════════════╗");
                            System.out.println("║                   ADMIN DASHBOARD                      ║");
                            System.out.println("╚════════════════════════════════════════════════════════╝");
                            System.out.println(" 1 ➔ ➕ Add Train");
                            System.out.println(" 2 ➔ ➖ Remove Train");
                            System.out.println(" 3 ➔ 📋 View All Bookings");
                            System.out.println(" 4 ➔ 🚪 Logout Admin");
                            System.out.print("👉 Enter Admin Choice: ");
                            int admChoice = sc.nextInt();
                            if (admChoice == 4) {
                                System.out.println("\n[INFO] Admin logged out successfully.");
                                break;
                            }
                            if (admChoice == 3) {
                                System.out.println("\n--- 📋 LIVE GLOBAL SYSTEM BOOKING LOGS ---");
                                if (bs.tickets.isEmpty()) {
                                    System.out.println("[INFO] No global bookings database records found.");
                                } else {
                                    for(int k=0; k<bs.tickets.size(); k++) {
                                        System.out.println("ID: " + bs.tickets.get(k).tId + " | Name: " + bs.tickets.get(k).p.name + " | Coach: " + bs.tickets.get(k).cls);
                                    }
                                }
                            } else if (admChoice == 1 || admChoice == 2) {
                                System.out.println("\n[SUCCESS] Action simulated in array structures successfully!");
                            } else {
                                System.out.println("\n❌ Invalid Admin Choice Index.");
                            }
                        }
                    } else {
                        System.out.println("\n❌ Wrong credentials! Admin access denied.");
                    }
                    break;
            }
        }
    }
}