package com.railway.model;

import java.util.ArrayList;

public class Train {
    public int tNo;
    public String tName;
    public String time;
    public ArrayList<String> route = new ArrayList<>();

    public int s1AC, s2AC, sSL;
    public int t1AC, t2AC, tSL;
    public int f1AC, f2AC, fSL;

    public Train(int tNo, String tName, String time, String[] viaStations,
                 int s1, int t1, int f1, int s2, int t2, int f2, int sS, int tS, int fS) {
        this.tNo = tNo;
        this.tName = tName;
        this.time = time;

        for (int i = 0; i < viaStations.length; i++) {
            this.route.add(viaStations[i].toLowerCase().trim());
        }

        this.s1AC = s1; this.t1AC = t1; this.f1AC = f1;
        this.s2AC = s2; this.t2AC = t2; this.f2AC = f2;
        this.sSL = sS;  this.tSL = tS;  this.fSL = fS;
    }
}