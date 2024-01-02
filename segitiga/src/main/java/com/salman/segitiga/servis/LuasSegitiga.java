package com.salman.segitiga.servis;

import org.springframework.stereotype.Service;

@Service
public class LuasSegitiga {
    public double luasHit(double a, double b){
        double hasil = a*b*0.5;
        return hasil;
    }
}
